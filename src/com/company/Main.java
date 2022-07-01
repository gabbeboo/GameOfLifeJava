package com.company;

import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {


    public static void main(String[] args) {

        initializeUi();
        Grid simulation = new NodeField();
        simulation.gridPrint();
        simulation.loadFunnyFigure();
        simulation.gridPrint();

        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();


        while(readString != null) {

            if (readString.isEmpty()) {
                simulation.gridNextStep();
                simulation.gridPrint();
            }

            if (scanner.hasNextLine()) {
                readString = scanner.nextLine();
            } else {
                readString = null;
            }


        }





    }

    private static void initializeUi() {

        JFrame grid = new JFrame();
        grid.setSize(800,800);
        grid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        grid.setVisible(true);

        JPanel menu = new JPanel();
        menu.setSize(500,500);
        JButton star = new JButton("Star");
        JButton sephamore = new JButton("Sephamore");
        JButton glider = new JButton("Glider");
        JButton reset = new JButton("Reset");

        menu.add(star);
        menu.add(sephamore);
        menu.add(glider);
        menu.add(reset);
        grid.add(menu);
    }
}
