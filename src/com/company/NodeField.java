package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NodeField implements Grid {

    private List<List<Node>> grid;
    private ArrayList<Node> nodeRow;

    NodeField() {

        grid = new ArrayList<List<Node>>();
        nodeRow = new ArrayList<>();
        for (int i = 1; i <= 400; i++) {
            Node uniqueNode = new Node();
            nodeRow.add(uniqueNode);
            if (i%20 == 0 && i != 1) {
                grid.add(nodeRow);
                nodeRow = new ArrayList<>();
            }
        }


    }


    public void gridPrint() {
        for (int i = 0; i < 20; i++) {
            System.out.println();
            for (int j = 0; j < 20; j++) {
                grid.get(j).get(i).nodePrint();
            }

        }
        System.out.println();
    }

    public void gridNextStep() {

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                survivalCheck(getNode(j, i), getNeighbours(j,i));
            }
        }

        updateField();

    }

    public void loadFunnyFigure() {

        getNode(2,1).setStatus(true);
        getNode(2,2).setStatus(true);
        getNode(2,3).setStatus(true);


        updateField();
    }


    private ArrayList<Node> getNeighbours(int y, int x) {


        ArrayList<Node> neighbours = new ArrayList<Node>();


        for (int i = x - 1; i < x + 2; i++) {
            for (int j = y - 1; j < y + 2; j++) {
                if (!(j == y && i == x)) {
                    try {
                        neighbours.add(grid.get(j).get(i));
                    } catch (Exception err) {
                        continue;
                    }
                }
            }
        }


        return neighbours;
    }

    private void survivalCheck(Node nodeCheck, ArrayList<Node> neighbours) {

        int aliveNodes = 0;

        for (Node neighbour : neighbours) {
            if (neighbour.lifeCheck()) {
                aliveNodes++;
            }
        }

        System.out.print(aliveNodes);
        if (aliveNodes < 2 || aliveNodes > 3) {
            nodeCheck.setStatus(false);
        } else if (aliveNodes == 2 || aliveNodes == 3) {
            nodeCheck.setStatus(true);
        } else {
            nodeCheck.setStatus(false);
        }


    }

    public Node getNode(int col, int row) {

        return grid.get(col).get(row);

    }

    private void updateField() {

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                getNode(j, i).updateNode();
            }

        }

    }
}
