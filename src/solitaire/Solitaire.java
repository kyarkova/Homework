package solitaire;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Solitaire extends JFrame {
    private static boolean selectDone = false;
    private static int pileSelected = -1;
    private static CardPile[] allPiles;
    static DeckPile deckPile;
    static DiscardPile discardPile;
    static SuitPile[] suitPile;
    static Solitaire gw;
    static Card selectedCard;

    static public void main(String[] args) {
        gw = new Solitaire();
        gw.setVisible(true);
    }

    private Solitaire() {
        initWindow();
        initPile();
    }

    public static void initPile() {
        allPiles = new CardPile[13];
        suitPile = new SuitPile[4];
        int y = 50;
        allPiles[0] = deckPile = new DeckPile(345, y);
        allPiles[1] = discardPile = new DiscardPile(290, y);
        for (int i = 0; i < 4; i++) {
            allPiles[2 + i] = suitPile[i] =
                    new SuitPile(15 + 60 * i, y);
        }
        for (int i = 0; i < 7; i++) {
            allPiles[6 + i] =
                    new TablePile(15 + 55 * i, y + 80, i + 1);
        }
        selectedCard = null;
        selectDone = false;
    }

    private void initWindow() {
        setBounds(500, 300, 415, 700);
        setResizable(false);
        setTitle("solitaire");
        setBackground(new Color(70, 194, 33));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                clicked(x, y);
            }
        });
        JButton newGame = new JButton("Start new game");
        newGame.addActionListener(e -> {
            initPile();
            repaint();
        });
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        buttonsPanel.add(newGame);
        add(buttonsPanel, BorderLayout.SOUTH);
    }


    @Override
    public void paint(Graphics g) {
        g.clearRect(0, 0, getWidth(), getHeight() - 35);
        for (int i = 0; i < 13; i++) {
            allPiles[i].display(g);
        }
    }

    private void clicked(int xCoord, int yCoord) {
        if (!selectDone) {
            trySelect(xCoord, yCoord);
        } else {
            for (int i = 0; i < 13; i++) {
                if (Solitaire.allPiles[i].includes(xCoord, yCoord)) {
                    Solitaire.allPiles[i].tryPut(Solitaire.allPiles[pileSelected], selectedCard);
                }
            }
            deselectCards();
            selectedCard.isSelected = false;
            pileSelected = -1;
            selectedCard = null;
            selectDone = false;
        }
        repaint();
    }


    private void trySelect(int x, int y) {
        for (int i = 0; i < 13; i++) {
            if (Solitaire.allPiles[i].includes(x, y)) {
                selectDone = Solitaire.allPiles[i].select(x, y);
                if (selectDone) {
                    pileSelected = i;
                }
            }
        }
    }

    private static void deselectCards() {
        for (int i = 0; i < 13; i++) {
            int index = allPiles[i].indexOf(selectedCard);
            if (index > -1) {
                for (int k = index; k < allPiles[i].size(); k++) {
                    allPiles[i].get(k).isSelected = false;
                }
            }
        }
    }
}
