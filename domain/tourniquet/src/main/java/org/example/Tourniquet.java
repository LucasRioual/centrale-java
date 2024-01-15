package org.example;


public class Tourniquet {

   private Etat state = new Bloque(this);

   public void insertTicketValide(){
       state.insererTicketValide();
       System.out.println("insert ticket");

   }

    public void insertTicketNonValide(){
        state.insererTicketNonValide();
    }

    public void pousser(){
        state.pousser();
    }

   public void setState(Etat etat){
       state = etat;

   }

}
