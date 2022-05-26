package com.company;

public class Main {


    public static void main(String[] args) {


        Grid simulation = new NodeField();
        simulation.gridPrint();
        simulation.loadFunnyFigure();
        simulation.gridPrint();


        int i = 0;
        while (i < 1) {
            i++;
            simulation.gridNextStep();
            simulation.gridPrint();

        }




    }
}
