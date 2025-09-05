package br.com.etechas.locadora.model;

import br.com.etechas.locadora.enums.CategoriaCarro;

public class Carro {

    private String placa;
    private String modelo;
    private int ano;
    private CategoriaCarro categoria;
    private boolean disponivel;



    public Carro(String placa, String modelo, int ano, CategoriaCarro categoria, boolean disponivel) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.categoria = categoria;
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", categoria=" + categoria +
                ", disponivel=" + disponivel +
                '}';
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public CategoriaCarro getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaCarro categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
