package ru.javamentor.springmvc.exceptions;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class InfoException {
    private String info;

    public InfoException() {
    }

    public InfoException(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
