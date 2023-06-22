package com.company;

import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class Main {


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
}
