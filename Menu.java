package br.edu.faeterj;

import java.util.Scanner;

public class Menu {

	private Estado e;
	private boolean confirma = true;
	private int opcao;
	
	public int mostrar(Veiculo[] v){
		
		
		do{
		for(int i = 0; i< v.length ;i++ )
		
			System.out.println( (i+1) +" : "+v[i].getOrigem()+ " - "+v[i].getDestino() +" ( " + v[i].getAssentosDisponiveis()+" assentos disponiveis de "+v[i].getNumAssentos()+" ) ");
		
		System.out.println();
		System.out.println();
		
		System.out.println("Escola a opção de sua viagem: ");
		
		Scanner c = new Scanner(System.in);
		opcao = Integer.parseInt(c.nextLine());
		
		if(opcao > 0 && opcao <= v.length)
			confirma = false;
		
		}while(confirma);

		return opcao;	
		
	}
	
}
