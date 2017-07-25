package solitaire;

import java.awt.*;

class Card {
    final static int width = 50;
    final static int height = 70;

    private final static int red = 0;
    private final static int black = 1;

    private final static int heart = 0;
    private final static int spade = 1;
    private final static int diamond = 2;
    private final static int club = 3;

    private static final String[] names = new String[]{"A", "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "J", "Q", "K"};

    private boolean isFaceUp;
    private final int rank;
    private final int suit;
    boolean isSelected = false;
    int visibleTop;
    int visibleBottom;

    Card(int sv, int rv) {
        suit = sv;
        rank = rv;
        isFaceUp = false;
    }

    public void draw(Graphics g, int x, int y) {
        g.clearRect(x, y, width, height);
        g.setColor(Color.black);
        if (isSelected) {
            g.setColor(Color.red);
            g.drawRect(x, y, width, height);
            g.setColor(Color.black);
        } else {
            g.drawRect(x, y, width, height);
        }
        if (isFaceUp()) {
            if (getColor() == red) {
                g.setColor(Color.red);
            } else {
                g.setColor(Color.blue);
            }
            g.drawString(names[getRank()], x + 3, y + 15);
            switch (getSuit()) {
                case heart:
                    drawHeart(g, x, y);
                    break;
                case spade:
                    drawSpade(g, x, y);
                    break;
                case diamond:
                    drawDiamond(g, x, y);
                    break;
                case club:
                    drawClub(g, x, y);
                    break;
            }
        } else {
            drawFaceDown(g, x, y);
        }
    }

    private void drawFaceDown(Graphics g, int x, int y) {
        g.setColor(Color.yellow);
        g.drawLine(x + 15, y + 5, x + 15, y + 65);
        g.drawLine(x + 35, y + 5, x + 35, y + 65);
        g.drawLine(x + 5, y + 20, x + 45, y + 20);
        g.drawLine(x + 5, y + 35, x + 45, y + 35);
        g.drawLine(x + 5, y + 50, x + 45, y + 50);
    }

    private void drawClub(Graphics g, int x, int y) {
        g.drawOval(x + 20, y + 25, 10, 10);
        g.drawOval(x + 25, y + 35, 10, 10);
        g.drawOval(x + 15, y + 35, 10, 10);
        g.drawLine(x + 23, y + 45, x + 20, y + 55);
        g.drawLine(x + 20, y + 55, x + 30, y + 55);
        g.drawLine(x + 30, y + 55, x + 27, y + 45);
    }

    private void drawDiamond(Graphics g, int x, int y) {
        g.drawLine(x + 25, y + 20, x + 40, y + 40);
        g.drawLine(x + 40, y + 40, x + 25, y + 60);
        g.drawLine(x + 25, y + 60, x + 10, y + 40);
        g.drawLine(x + 10, y + 40, x + 25, y + 20);
    }

    private void drawSpade(Graphics g, int x, int y) {
        g.drawLine(x + 25, y + 20, x + 40, y + 50);
        g.drawLine(x + 40, y + 50, x + 10, y + 50);
        g.drawLine(x + 10, y + 50, x + 25, y + 20);
        g.drawLine(x + 23, y + 45, x + 20, y + 60);
        g.drawLine(x + 20, y + 60, x + 30, y + 60);
        g.drawLine(x + 30, y + 60, x + 27, y + 45);
    }

    private void drawHeart(Graphics g, int x, int y) {
        g.drawLine(x + 25, y + 30, x + 35, y + 20);
        g.drawLine(x + 35, y + 20, x + 45, y + 30);
        g.drawLine(x + 45, y + 30, x + 25, y + 60);
        g.drawLine(x + 25, y + 60, x + 5, y + 30);
        g.drawLine(x + 5, y + 30, x + 15, y + 20);
        g.drawLine(x + 15, y + 20, x + 25, y + 30);
    }

    public int getColor() {
        if (getSuit() == heart || getSuit() == diamond) {
            return red;
        }
        return black;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }


}
