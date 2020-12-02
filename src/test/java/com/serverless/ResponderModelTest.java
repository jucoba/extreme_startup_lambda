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

}
