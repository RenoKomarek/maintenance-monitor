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

    @Test
    void set() {
        String newmessage = "test";
        maintenancemonitorController.set(newmessage);
        assertEquals(newmessage, maintenancemonitorController.message());
    }

    @Test
    void reset(){
        String newmessage = "reset";
        maintenancemonitorController.set(newmessage);
        maintenancemonitorController.reset();
        assertEquals(defaultmessage, maintenancemonitorController.message());
    }

}