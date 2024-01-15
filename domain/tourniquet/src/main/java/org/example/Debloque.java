package org.example;

public class Debloque implements Etat{

    Tourniquet tourniquet;

    public Debloque(Tourniquet tourniquet){
        this.tourniquet = tourniquet;
    }

    @Override
    public void insererTicketValide(){

    };

    @Override
    public void insererTicketNonValide(){

    };

    @Override
    public void pousser(){
        tourniquet.setState(new Bloque(tourniquet));
    };




}