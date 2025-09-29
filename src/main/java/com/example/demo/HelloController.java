package com.example.demo;

import java.net.InetAddress;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        String hostname = System.getenv("HOSTNAME");
        if (hostname==null) {
            try {
                hostname = InetAddress.getLocalHost().getHostName();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "Hello from " + (hostname==null ? "" : hostname);
    }
}