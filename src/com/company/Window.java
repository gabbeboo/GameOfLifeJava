package com.company;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Window {

    private JPanel grid;



    public void createFrame() {

        JFrame game = new JFrame("Game of Life");
        game.setLayout(new FlowLayout());
        game.setSize(500,500);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setVisible(true);
        JPanel topPanel = createChoicesBar();
        createGrid();
        game.add(topPanel,BorderLayout.NORTH);
        game.add(grid,BorderLayout.CENTER);


    }


    protected JPanel createChoicesBar() {
        JPanel panelChoices = new JPanel();
        panelChoices.setLayout(new GridLayout(1,0));
        JButton semaphore = new JButton("Semaphore");
        panelChoices.add(semaphore);
        JButton glider = new JButton("Glider");
        panelChoices.add(glider);
        JButton star = new JButton("Star");
        panelChoices.add(star);
        JButton clearButton = new JButton("Reset");
        panelChoices.add(clearButton);
        return panelChoices;
    }

    private void createGrid () {
        grid = new JPanel();
        grid.add(new JLabel("Hejsan"));
        grid.add(new JLabel("linkan14"));
    }


}
