package com.iteso.adapter.impl;

import com.iteso.adapter.Taco;
import com.iteso.adapter.Torta;

/**
 * Created by rvillalobos on 11/16/14.
 */
public class TortaAdapter implements Taco{
    Torta torta;
    String a;
    public TortaAdapter(Torta torta){
        this.torta = torta;
    }
    @Override
    public String fill() {
        a=torta.cutByHalf();
        a+=torta.fill();
    return a;
    }
    @Override
    public String fold() {
        a=torta.cover();
    return a;
    }
    @Override
    public String printDescription() {
        return torta.printDescription();
    }
}
