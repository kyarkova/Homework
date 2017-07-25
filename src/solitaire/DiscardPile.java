package solitaire;

class DiscardPile extends CardPile {

    DiscardPile(int x, int y) {
        super(x, y);
    }

    @Override
    public void push(Card aCard) {
        if (!aCard.isFaceUp()) {
            aCard.flip();
        }
        super.push(aCard);
    }

    @Override
    public boolean select(int xCoord, int yCoord) {
        if (empty()) {
            return false;
        }
        Card card = Solitaire.discardPile.top();
        Solitaire.selectedCard = card;
        card.isSelected = !card.isSelected;
        return true;
    }
}
