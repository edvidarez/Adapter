package com.iteso.adapter.impl;

import com.iteso.adapter.Taco;
import com.iteso.adapter.Torta;

/**
 * Created by Edmundo on 27/10/2016.
 */
public class TacoAdapter implements Torta{
    Taco myTaco ;
    public TacoAdapter(Taco taco)
    {
        myTaco=taco;
    }
    public String cutByHalf() {
    return "";
    }

    public String fill() {
       return myTaco.fill();
    }

    public String cover() {
    return myTaco.fold();
    }

    public String printDescription() {

        return myTaco.printDescription();
    }
}
