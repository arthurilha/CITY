package com.trab.Cidade;


public class SolicitaCustoDTO {
    private String cepDestino;
    private double peso;
    
    public SolicitaCustoDTO(String cepDestino, double peso) {
        this.cepDestino = cepDestino;
        this.peso = peso;
    }

    public String getcepDestino() {
        return cepDestino;
    }

    public double getpeso() {
        return peso;
    }
}