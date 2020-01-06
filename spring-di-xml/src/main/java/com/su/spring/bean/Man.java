package com.su.spring.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Man {
    private String name;
    private Man gf;
    private List<String> hobbies;
    private String matiralStatus;
    private String gender;
    public Man() {
    }

    public Man(String name) {
        this.name = name;
    }
}
