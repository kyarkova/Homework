package solitaire;

import java.awt.*;
import java.util.Stack;

class CardPile {
    final int x;
    final int y;
    Stack<Card> pile = new Stack<>();

    CardPile(int xCoord, int yCoord) {
        x = xCoord;
        y = yCoord;
    }

    Card top() {
        return pile.peek();
    }

    boolean empty() {
        return pile.isEmpty();
    }

    int size(){
        return pile.size();
    }

    int indexOf(Card card){
        return pile.indexOf(card);
    }

    Card get (int i){
        return pile.get(i);
    }

    void push(Card aCard) {
        pile.push(aCard);
    }

    Card pop() {
        Card result = null;
        if (!pile.isEmpty()) {
            result = pile.pop();
        }
        return result;
    }

    public boolean includes(int clickX, int clickY) {
        return x <= clickX && clickX <= x + Card.width &&
                y <= clickY && clickY <= y + Card.height;
    }

    public boolean select(int tx, int ty) {
        return false;
    }

    public void display(Graphics g) {
        g.setColor(Color.black);
        if (pile.isEmpty()) {
            g.drawRect(x, y, Card.width, Card.height);
        } else {
            pile.get(pile.size() - 1).draw(g, x, y);
        }
    }

    public boolean canTake(Card aCard) {
        return false;
    }

    public void tryPut(CardPile selectedPile, Card selectedCard) {
    }

}
