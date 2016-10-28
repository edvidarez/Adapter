package com.iteso;

import com.iteso.adapter.Taco;
import com.iteso.adapter.TacoPlate;
import com.iteso.adapter.Torta;
import com.iteso.adapter.TortaPlate;
import com.iteso.adapter.impl.TacoLengua;
import com.iteso.adapter.impl.TortaBistec;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Edmundo on 27/10/2016.
 */
public class Plate_test {
    TacoPlate plato_taco;
    TortaPlate plato_torta;
    Taco taco_lengua;
    Torta torta_Bistec;
    @Before
    public void SetUp() {
        plato_taco = new TacoPlate();
        plato_torta = new TortaPlate();
        taco_lengua = new TacoLengua();
        torta_Bistec= new TortaBistec();
    }
    @Test
    public void TacoPlate_Test()
    {
       // plato_taco.addTaco(taco_lengua);
        assertEquals(plato_taco.servePlate(),1);
    }
    @Test
    public void TortaPlate_Test()
    {
        plato_torta.addTorta(torta_Bistec);
        assertEquals(plato_torta.servePlate(),1);
    }
}
