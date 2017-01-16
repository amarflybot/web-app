package com.amar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by amarendra on 16/1/17.
 */
@RestController
public class TestController {

    @Autowired
    private TestProperties testProperties;

    @GetMapping(path = "/message")
    public String message(){
        return testProperties.getMessage();
    }

}
