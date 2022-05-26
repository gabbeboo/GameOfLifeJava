package com.company;

public class Node {
    private char visual;
    private boolean aliveStatus;
    private boolean aliveStatusNextIteration;


    Node() {
        visual = '*';
        aliveStatus = false;
    }

   public void nodePrint(){
       System.out.print(visual);
   }

   public void setStatus(boolean status) {

        aliveStatusNextIteration = status;


   }

   public void updateNode() {

        aliveStatus = aliveStatusNextIteration;

        if (aliveStatus == true) {
            visual = 'X';
        } else {
            visual = '*';
        }

   }


   public boolean lifeCheck() {

        return aliveStatus;
   }
}
