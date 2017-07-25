package solitaire;

import javax.swing.*;
import java.awt.*;

class WinGame extends JFrame {

    public WinGame() {
        initWindow();
    }

    private void initWindow() {
        setResizable(false);
        setBounds(550, 400, 300, 100);
        setTitle("solitaire");
        JButton newGame = new JButton("You win! Let's start new game");
        setBackground(new Color(70, 194, 33));
        newGame.addActionListener(e -> {
            Solitaire.initPile();
            Solitaire.gw.repaint();
            setVisible(false);
            repaint();
        });
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        buttonsPanel.add(newGame);
        add(buttonsPanel, BorderLayout.CENTER);
    }
}
