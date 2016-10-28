package com.iteso.adapter.impl;

import com.iteso.adapter.Taco;

/**
 * Created by rvillalobos on 11/16/14.
 */
public class TacoLengua implements Taco {
    @Override
    public String fill() {
        System.out.println("Take a tortilla and fill it with Lengua");
        return "Take a tortilla and fill it with Lengua";

    }

    @Override
    public String fold() {
        System.out.println("Fold the tortilla");
        return "Fold the tortilla";

    }

    @Override
    public String printDescription() {
        System.out.println("Lengua Taco");
        return "Lengua Taco";
    }
}
