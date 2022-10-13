package com.fundamentosplatzi.springboot.fundamentos.beans;

import org.springframework.stereotype.Component;

public class BeanImpl implements IBean{

    @Override
    public void imprimir() {
        System.out.println("Hola Sofia Mucho gusto, estoy desde el bean implementation");
    }
}
