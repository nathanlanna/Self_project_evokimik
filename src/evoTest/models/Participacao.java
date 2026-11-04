package evoTest.models;

import evoTest.enums.Papel;

public class Participacao {

	private final Usuario participante;
	private final Papel papel;
	
	public Participacao(Usuario participante, Papel papel) {
		this.papel=papel;
		this.participante = participante;
	}
}
