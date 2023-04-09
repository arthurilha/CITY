package com.trab.Cidade;


public class CustoBasicoTransporte {
    private String cidade;
    private double valor;
    
    public CustoBasicoTransporte(String cidade, double valor) {
        this.cidade = cidade;
        this.valor = valor;
    }

    public String getCidade() {
        return cidade;
    }

    public double getValor() {
        return valor;
    }
}
