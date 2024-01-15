package org.example;

public class Bloque implements Etat{



    Tourniquet tourniquet;

    public Bloque(Tourniquet tourniquet){
        this.tourniquet = tourniquet;
    }

    @Override
    public void insererTicketValide(){
        tourniquet.setState(new Debloque(tourniquet));

    };
    @Override
    public void insererTicketNonValide(){

    };
    @Override
    public void pousser(){

    };




}