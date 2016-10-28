package com.iteso;

import com.iteso.adapter.Taco;
import com.iteso.adapter.TacoPlate;
import com.iteso.adapter.Torta;
import com.iteso.adapter.TortaPlate;
import com.iteso.adapter.impl.TacoAdapter;
import com.iteso.adapter.impl.TacoLengua;
import com.iteso.adapter.impl.TortaAdapter;
import com.iteso.adapter.impl.TortaBistec;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by Edmundo on 27/10/2016.
 */
public class TacoTest {
    TacoPlate plato_taco;
    TortaPlate plato_torta;
    Taco taco_lengua;
    Torta torta_Bistec;
    Taco taco_adapter;
    Taco taco_iteso;
    Torta torta_adapter;
    @Before
    public void SetUp() {
        plato_taco = new TacoPlate();
        plato_torta = new TortaPlate();
        taco_lengua = new TacoLengua();
        torta_Bistec= new TortaBistec();
        taco_adapter = new TortaAdapter(torta_Bistec);
        taco_iteso = new TacoLengua();
        torta_adapter = new TacoAdapter(taco_iteso);
    }



    @Test
    public void TacoLengua_Test()
    {
        assertEquals(taco_lengua.fill(),"Take a tortilla and fill it with Lengua");
        assertEquals(taco_lengua.fold(),"Fold the tortilla");
        assertEquals(taco_lengua.printDescription(),"Lengua Taco");
    }
    @Test
    public void TacoAdapter_Test()
    {
        assertEquals(taco_adapter.fill(),"Take a bread and cut it by halfTake the bottom half and fill it with Bistec");
        assertEquals(taco_adapter.fold(),"Put the top of the bread");
        assertEquals(taco_adapter.printDescription(),"Bistec Torta");
    }
    @Test
    public void TortaAdapter_Test()
    {
        assertEquals(torta_adapter.fill(),"Take a tortilla and fill it with Lengua");
        assertEquals(torta_adapter.cutByHalf(),"");
        assertEquals(torta_adapter.printDescription(),"Lengua Taco");
        assertEquals(torta_adapter.cover(),"Fold the tortilla");
    }
    @Test
    public void TacoPlate_Test()
    {
        plato_taco.addTaco(taco_lengua);
        assertEquals(plato_taco.servePlate(),1);
    }
    @Test
    public void TortaPlate_Test()
    {
        plato_torta.addTorta(torta_Bistec);
        assertEquals(plato_torta.servePlate(),1);
    }
}
