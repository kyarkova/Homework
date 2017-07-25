package solitaire;

class DeckPile extends CardPile {

    DeckPile(int x, int y) {
        super(x, y);
        CardPile pileOne = new CardPile(0, 0);
        CardPile pileTwo = new CardPile(0, 0);
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= 12; j++) {
                pileOne.push(new Card(i, j));
                count++;
            }
        }
        for (; count > 0; count--) {
            int limit = ((int) (Math.random() * 1000)) % count;
            for (int i = 0; i < limit; i++) {
                pileTwo.push(pileOne.pop());
            }
            push(pileOne.pop());
            while (!pileTwo.empty()) {
                pileOne.push(pileTwo.pop());
            }
        }
    }

    @Override
    public boolean select(int xCoord, int yCoord) {
        if (empty()) {
            while (!Solitaire.discardPile.empty()) {
                Card card = Solitaire.discardPile.pop();
                card.flip();
                Solitaire.deckPile.push(card);
            }
            return false;
        }
        Solitaire.discardPile.push(pop());
        return false;
    }
}
