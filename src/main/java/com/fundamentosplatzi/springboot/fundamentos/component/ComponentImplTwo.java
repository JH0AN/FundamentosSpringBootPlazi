package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComponentImplTwo implements IComponent{
    @Override
    public void saludar() {
        System.out.println("Hola mundo desde el componente dos");
    }
}
