package com.fundamentosplatzi.springboot.fundamentos.beans;

public class MyBeanWithPropertiesImpl implements MyBeanWithProperties{

    private String name;
    private String apellido;

    public MyBeanWithPropertiesImpl(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;
    }

    @Override
    public String function() {
        return name+"-"+apellido;
    }
}
