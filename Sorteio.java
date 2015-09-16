package br.edu.faeterj;

import java.util.Random;

public class Sorteio {

	private int i;
	
	public int sorteiaNUmEstado(){
	Random c = new Random();
	i = c.nextInt(15);
	return i;
	}
	
	public int sorteiaNumLugar(){
		
		Random d = new Random();
		i = d.nextInt(15)+50;
		return i;
	}
	
	public int sorteiaNumLugarOcupado(){
		
		Random o = new Random();
		i = o.nextInt(50);
		return i;
	}
	
	
	
}
