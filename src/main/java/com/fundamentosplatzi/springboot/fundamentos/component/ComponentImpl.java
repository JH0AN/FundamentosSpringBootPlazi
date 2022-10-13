package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImpl implements  IComponent{
    @Override
    public void saludar() {
        System.out.println("Hola Mundo");
    }
}
