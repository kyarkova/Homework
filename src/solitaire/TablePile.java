package solitaire;

import java.awt.*;

class TablePile extends CardPile {

    TablePile(int x, int y, int c) {
        super(x, y);
        for (int i = 0; i < c; i++) {
            Card card = Solitaire.deckPile.pop();
            push(card);
        }
        top().flip();
    }

    @Override
    public boolean includes(int clickX, int clickY) {
        int bottom;
        if (size() == 0) {
            bottom = 200;
        } else {
            bottom = top().visibleBottom;
        }
        return x <= clickX && clickX <= x + Card.width &&
                y <= clickY && clickY <= bottom;
    }

    @Override
    public void display(Graphics g) {
        if (empty()) {
            g.setColor(Color.BLACK);
            g.drawRect(x, y, Card.width, Card.height);
        }

        int localY = y;
        for (Card card : pile) {
            card.visibleTop = localY;
            card.draw(g, x, localY);
            localY += 35;
            card.visibleBottom = localY;
        }
        if (!empty()) {
            top().visibleBottom += 35;
        }
    }

    @Override
    public boolean select(int xCoord, int yCoord) {
        boolean cardFound = false;
        if (empty()) {
            return cardFound;
        }
        for (Card card : pile) {
            if (yCoord >= card.visibleTop && yCoord <= card.visibleBottom && card.isFaceUp()) {
                if (Solitaire.selectedCard == null) {
                    Solitaire.selectedCard = card;
                    cardFound = true;
                }
                card.isSelected = !card.isSelected;
            } else {
                if (Solitaire.selectedCard != null) {
                    card.isSelected = !card.isSelected;
                }
            }
        }
        return cardFound;
    }

    @Override
    public void tryPut(CardPile selectedPile, Card selectedCard) {
        if (canTake(selectedCard)) {
            relay(selectedPile, selectedCard);
        }
    }

    @Override
    public boolean canTake(Card card) {
        if (empty()) {
            return card.getRank() == 12;
        }
        Card topCard = top();
        return (card.getColor() != topCard.getColor()) &&
                (card.getRank() == topCard.getRank() - 1);
    }

    private void relay(CardPile selectedPile, Card selectedCard) {
        int index = selectedPile.indexOf(selectedCard);
        for (int k = index; k < selectedPile.size(); k++) {
            push(selectedPile.get(k));
        }
        for (int k = selectedPile.size() - index; k > 0; k--) {
            selectedPile.top().isSelected = false;
            selectedPile.pop();
        }
        if (!selectedPile.empty() && !selectedPile.top().isFaceUp()) {
            selectedPile.top().flip();
        }
    }
}
