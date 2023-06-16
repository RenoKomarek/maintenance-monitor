package com.example.maintenancemonitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class maintenancemonitorControllerTest {

    public maintenancemonitorController maintenancemonitorController = new maintenancemonitorController();

    String defaultmessage = "Everything works as expected";

    @Test
    void message(){
        assertEquals(defaultmessage, maintenancemonitorController.message());
    }

}