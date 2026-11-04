package evoTest.models;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import evoTest.enums.AtributesEnum;

public class Aluno extends Usuario {

	private Map<String,Integer> atributos = Arrays.stream(AtributesEnum.values()).collect(Collectors.toMap(Enum::name, e->1));
		
	public Aluno(String username,String password,String email,String nome, 
			LocalDateTime dia_nasc,String telefone) {
		super(username,password,email,nome,dia_nasc,telefone);
		// TODO Auto-generated constructor stub
	}
	
	public Map<String,Integer> getAtributos() {
		return atributos;
	}
	public void setAtributos(String atributo, int valor) {
		this.atributos.put(atributo, valor);
	}
}
