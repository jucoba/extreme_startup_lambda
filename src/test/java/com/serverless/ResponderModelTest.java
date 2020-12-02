package com.serverless;



import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ResponderModelTest {

    @Test
    public  void cuando_el_query_esta_vacio_responda_Jubel() {
        ResponderModel model = new ResponderModel();
        String response = model.answer("");
        assertEquals(response, "Jubel");
    }

    @Test
    public void sumar_3_7_debe_dar_10(){
        ResponderModel model = new ResponderModel();
        String response = model.answer("what is the sum of 3 and 7");
        assertEquals(response, "10");
    }

}
