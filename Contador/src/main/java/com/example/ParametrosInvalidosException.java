package com.example;

public class ParametrosInvalidosException extends Exception{

    private final String erro;

    public ParametrosInvalidosException (String erro){
        this.erro = erro;
    };

    public String getErro() {
        return erro;
    }
}
