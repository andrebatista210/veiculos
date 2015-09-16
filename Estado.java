package br.edu.faeterj;

public enum Estado {

	RJ(1, "RJ"), 
	MG(2, "MG"),
	RS(3, "RS"), 
	MS(4, "MS"),
	RO(5, "RO"),
	BA(6, "BA"),
	SE(7, "SE"),
	SC(8, "SC"), 
	AM(9, "AM"), 
	AC(10, "AC"), 
	AL(11, "AL"),
	CE(12, "CE"),
	RR(13, "RR"), 
	GO(14, "GO"),
	RN(15, "RN"),
	PE(16, "PE"),
	ES(17, "ES"),
	SP(18, "SP");

	private int pos;
	private String estado;

	private Estado(int pos, String estado) {

		this.pos = pos;
		this.estado = estado;

	}

	public String getEstado(){
		return estado;
	}
	public String enumEstados(int codigo) {

		
		for (Estado e : Estado.values()) {

			if (codigo == e.pos) {
				
				return e.estado;
			}

		}
		throw new IllegalArgumentException("Estado não valido");
	}
}
