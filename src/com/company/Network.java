package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Network {

    private List<List<Node>> grid;
    private ArrayList<Node> nodeRow;

    Network() {

        grid = new ArrayList<List<Node>>();
        nodeRow = new ArrayList<Node>();
        for (int i = 0; i < 20 ; i++){
            Node uniqueNode = new Node();
            nodeRow.add(uniqueNode);
        }

        for ( int i = 0; i < 10; i++) {
         grid.add(nodeRow);
        }

    }



    public void networkPrint() {
        for ( int i = 0 ; i < 10; i++) {
            System.out.println();
            for ( int j = 0; j < 20;j++) {
                grid.get(i).get(j).nodePrint();
            }

        }
    }


}
