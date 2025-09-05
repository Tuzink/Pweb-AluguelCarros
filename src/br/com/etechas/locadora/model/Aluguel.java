package br.com.etechas.locadora.model;

import br.com.etechas.locadora.enums.CategoriaCarro;

public class Aluguel
    {

    private Cliente cliente;
    private Carro carro;
    private int dias;

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public Carro getCarro() {
            return carro;
        }

        public void setCarro(Carro carro) {
            this.carro = carro;
        }

        public int getDias() {
            return dias;
        }

        public void setDias(int dias) {
            this.dias = dias;
        }

        public Aluguel(Cliente cliente, Carro carro, int dias)
    {
        this.cliente = cliente;
        this.carro = carro;
        this.dias = dias;
    }

        public double calcularValor() {
            if (carro.getCategoria() == CategoriaCarro.LUXO)
                return 350 * dias;
            else if (carro.getCategoria() == CategoriaCarro.POPULAR)
                return 100 * dias;
            else if (carro.getCategoria() == CategoriaCarro.SEDAN)
                return 150 * dias;
            else
                return 200 * dias;
            }
        }



}
