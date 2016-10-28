package com.iteso.adapter.impl;

import com.iteso.adapter.Torta;

/**
 * Created by rvillalobos on 11/16/14.
 */
public class TortaBistec implements Torta {
    public String cutByHalf() {
        System.out.println("Take a bread and cut it by half");
        return "Take a bread and cut it by half";
    }

    public String fill() {
         System.out.println("Take the bottom half and fill it with Bistec");
        return "Take the bottom half and fill it with Bistec";
    }

    public String cover() {
        System.out.println("Put the top of the bread");
        return "Put the top of the bread";
    }

    public String printDescription() {
        System.out.println("Bistec Torta");
        return "Bistec Torta";
    }
}
