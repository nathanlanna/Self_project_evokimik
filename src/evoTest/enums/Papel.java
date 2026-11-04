package evoTest.enums;

import java.util.EnumSet;
import java.util.Set;

public enum Papel {

    PROFESSOR(EnumSet.allOf(Permissoes.class)),
    ALUNO(EnumSet.of(Permissoes.ENVIAR_MENSAGEM));
	
	private final Set<Permissoes> permissoes;
	
	
		Papel(Set<Permissoes> permissoes) { this.permissoes = permissoes; }

	    public boolean pode(Permissoes p) { return permissoes.contains(p); } 
	    //TODO Auto-generated constructor stub
	

}
