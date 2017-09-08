package solitaire;

class SuitPile extends CardPile {

    SuitPile(int x, int y) {
        super(x, y);
    }

    @Override
    public void tryPut(CardPile selectedPile, Card selectedCard) {
        if (canTake(selectedCard)) {
            int index = selectedPile.indexOf(selectedCard);
            if (index == selectedPile.size() - 1) {
                Card card = selectedPile.pop();
                card.isSelected = false;
                push(card);
            }
            allSuitsFull();
            if (!selectedPile.empty() && !selectedPile.top().isFaceUp()) {
                selectedPile.top().flip();
            }
        }
    }

    @Override
    public boolean canTake(Card aCard) {
        if (empty()) {
            return aCard.getRank() == 0;
        }
        Card topCard = top();
        return (aCard.getSuit() == topCard.getSuit()) &&
                (aCard.getRank() == 1 + topCard.getRank());
    }

    private static void allSuitsFull() {
        for (int i = 0; i < 4; i++) {
            if (Solitaire.suitPile[i].size() != 13) {
                return;
            }
        }
        new WinGame().setVisible(true);
    }
}
