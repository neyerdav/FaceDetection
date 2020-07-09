package dev.neyerdav;


import dev.neyerdav.gui.MainFrame;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(ClassNotFoundException | IllegalAccessException | InstantiationException  | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
	SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            new MainFrame();
        }
    });
    }
}
