package com.amar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by amarendra on 16/1/17.
 */
@ConfigurationProperties
@Component
public class TestProperties {

    @Value("${message}")
    private String message;

    public TestProperties() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
