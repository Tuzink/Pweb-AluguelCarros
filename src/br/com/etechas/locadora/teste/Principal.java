package br.com.etechas.locadora.teste;

import br.com.etechas.locadora.enums.CategoriaCarro;
import br.com.etechas.locadora.model.Aluguel;
import br.com.etechas.locadora.model.Carro;
import br.com.etechas.locadora.model.Cliente;


public class Principal {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("João", "123456789", "123456789");
        Cliente cliente2 = new Cliente("Claúdia", "987654321","675431234");

        Carro carro1 = new Carro("45367AH", "Uno",  2002, CategoriaCarro.POPULAR, true);
        Carro  carro2 = new Carro("2345AJ","Corolla",  2021, CategoriaCarro.SEDAN, false);
        Carro  carro3 = new Carro("5432AA","Porsche 911",  2025, CategoriaCarro.LUXO, true);

        Aluguel aluguel1 = new Aluguel(cliente1, carro3 ,20 );
        Aluguel aluguel2 = new Aluguel(cliente2, carro1 ,50 );

    }


}
