package br.edu.faeterj;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Menu m = new Menu();
		Scanner c = new Scanner(System.in);
		int opcao;
		Veiculo[] v = new Veiculo[12]; // inicia o vetor
		boolean confirma = false; // returno do metodo compra
		boolean sair = true;
		
		//inicia os objetos Veiculos
		
		for(int i = 0 ; i < v.length ; i++){
			
			v[i] = new Veiculo();
		}
		do{
		
			opcao = m.mostrar(v);
			
			if(opcao == 0){
				sair = true;
				System.out.println("Fim");
				break;
			}
			confirma = v[opcao -1].comprar();
		
		}while(sair);
	
	}
}
