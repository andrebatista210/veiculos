package br.edu.faeterj;

import java.util.Random;

public class Veiculo {

	private int numAssentos;
	private int assentosDisponiveis;
	private String origem;
	private String destino;
	private Estado estados;
	Sorteio s = new Sorteio();
	private String [] est = {"RJ","SP","MG","SE","AC","ES","AM","RR","PE","TO","RS","SC","MS","CE","PA"};
	
	Veiculo() {
		
		boolean confirma = true;
		
		this.numAssentos = s.sorteiaNumLugar() ;
		this.assentosDisponiveis = s.sorteiaNumLugarOcupado();
		
		int origem = s.sorteiaNUmEstado();
		
		
		this.origem = est[origem];//estados.enumEstados(origem);
		
		int destino = s.sorteiaNUmEstado();
		
		while(origem == destino){
			
			destino = s.sorteiaNUmEstado();
			if(origem != destino){
				confirma = false;
			}
		}
		
		this.destino = est[destino]; //estados.enumEstados(destino);
		
	}
	
// Getters and Setters
	
	public String getOrigem() {
		return origem;
	}

	public String getDestino() {
		return destino;
	}


	// metodo para comprar passagem

	boolean comprar() {

		boolean confirma = false;

		if (assentosDisponiveis > 0) {
						
			this.assentosDisponiveis = this.assentosDisponiveis - 1;
			
			confirma = true;
			System.out.println();
			System.out.println();
			System.out.println("Passagem comprada com sucesso!");
			System.out.println();
			System.out.println();
		}
		else{
			System.out.println();
			System.out.println();
			System.out.println("Onibus cheio!");
			System.out.println();
			System.out.println();
		}

		return confirma;
	}
	
	//retorno numero de assentos total do onibus
	
	public int getNumAssentos() {
		return numAssentos;
	}
	
	//retorna numero de assentos disponiveis
	public int getAssentosDisponiveis() {
		return assentosDisponiveis;
	}
}
