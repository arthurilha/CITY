package com.trab.Cidade;

public class CustoTempoEntregaDTO {
    private String cepOrigem;
    private String cidadeOrigem;
    private String cepDestino;
    private String cidadeDestino;
    private double peso;
    private double custoBasico;
    private double desconto;
    private double impostostaxas;
    private double custoFinal;
    private int diasUteisParaEntrega;

    public CustoTempoEntregaDTO(String cepOrigem, String cidadeOrigem, String cepDestino, String cidadeDestino, double peso, double custoBasico, double desconto, double impostostaxas, double custoFinal, int diasUteisParaEntrega) {
        this.cepOrigem = cepOrigem;
        this.cidadeOrigem = cidadeOrigem;
        this.cepDestino = cepDestino;
        this.cidadeDestino = cidadeDestino;
        this.peso = peso;
        this.custoBasico = custoBasico;
        this.desconto = desconto;
        this.impostostaxas = impostostaxas;
        this.custoFinal = custoFinal;
        this.diasUteisParaEntrega = diasUteisParaEntrega;
    }

    // getters e setters
    public String getCepOrigem() {
        return cepOrigem;
    }

    public void setCepOrigem(String cepOrigem) {
        this.cepOrigem = cepOrigem;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCepDestino() {
        return cepDestino;
    }

    public void setCepDestino(String cepDestino) {
        this.cepDestino = cepDestino;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCustoBasico() {
        return custoBasico;
    }

    public void setCustoBasico(double custoBasico) {
        this.custoBasico = custoBasico;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getImpostostaxas() {
        return impostostaxas;
    }

    public void setImpostostaxas(double impostostaxas) {
        this.impostostaxas = impostostaxas;
    }

    public double getCustoFinal() {
        return custoFinal;
    }

    public void setCustoFinal(double custoFinal) {
        this.custoFinal = custoFinal;
    }

    public int getDiasUteisParaEntrega() {
        return diasUteisParaEntrega;
    }

    public void setDiasUteisParaEntrega(int diasUteisParaEntrega){
        this.diasUteisParaEntrega = diasUteisParaEntrega;
    }


}