package com.iteso.adapter;

import java.util.ArrayList;

/**
 * Created by Edmundo on 27/10/2016.
 */
public class TortaPlate {
    private ArrayList tortas;
    public TortaPlate(){
        tortas = new ArrayList();
    }
    public void addTorta(Torta torta)
    {
        tortas.add(torta);
    }
    public int servePlate(){
        int i;
        for ( i = 0; i < tortas.size(); i++){
            Torta myTorta = (Torta) tortas.get(i);
            myTorta.cutByHalf();
            myTorta.fill();
            myTorta.cover();
            myTorta.printDescription();
        }
        return i;
    }
}
