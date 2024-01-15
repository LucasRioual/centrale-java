package org.centrale.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPierreFeuilleCiseaux {

    @Test 
    public void jeuEgalite(){
        Hand p = new Pierre();
        Hand f = new Feuille();
        Hand c = new Ciseaux();
        Assertions.assertEquals(p.playWith(p), 0);
        Assertions.assertEquals(f.playWith(f), 0);
        Assertions.assertEquals(c.playWith(c), 0);
    }

}
