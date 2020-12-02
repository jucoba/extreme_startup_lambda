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


    @Test
    public void which_of_the_following_numbers_is_the_largest_794_69(){
        ResponderModel model = new ResponderModel();
        String response = model.answer("which of the following numbers is the largest: 794, 69");
        assertEquals(response, "794");
    }

    @Test
    public void which_of_the_following_numbers_is_the_largest_34_87(){
        ResponderModel model = new ResponderModel();
        String response = model.answer("which of the following numbers is the largest: 34, 87");
        assertEquals(response, "87");
    }

    @Test
    public void what_is_0_multiplied_by_0(){
        ResponderModel model = new ResponderModel();
        String response = model.answer("what is 0 multiplied by 0");
        assertEquals(response, "0");

    }

    @Test
    public void what_is_0_plus_7() {
        ResponderModel model = new ResponderModel();
        String response = model.answer("what is 0 plus 7");
        assertEquals(response, "7");

    }


    @Test
    public void what_is_17_minus_8() {
        ResponderModel model = new ResponderModel();
        String response = model.answer("what is 17 minus 8");
        assertEquals(response, "9");

    }


    @Test
    public void which_city_is_the_Eiffel_tower_in() {
        ResponderModel model = new ResponderModel();
        String response = model.answer("which city is the Eiffel tower in");
        assertEquals(response, "Paris");
    }


}
