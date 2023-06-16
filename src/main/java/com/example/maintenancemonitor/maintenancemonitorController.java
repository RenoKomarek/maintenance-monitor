package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class maintenancemonitorController {

    String defaultmessage = "Everything works as expected";
    String m = defaultmessage;

    String ok = "ok";

    @RequestMapping("/api/message")
    public String message(){
        return m;
    }

    @RequestMapping("/api/message/set")
    public String set(@RequestParam String m) {
        this.m = m;
        return ok;
    }

}
