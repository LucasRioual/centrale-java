package org.example;



public class Action {
    //Liste de toutes les actions

    // Chaque action doit retourner un état

    //false = Bloque, true = Debloque


    public boolean insertTicketValide() {
        return true;
    }

    public boolean insertTicketNonValide(boolean oldEtat){
        return oldEtat;
    }

    public boolean tourner(){
            return false;
    }







}





