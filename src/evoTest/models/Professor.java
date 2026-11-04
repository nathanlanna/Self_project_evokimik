package evoTest.models;

import java.time.LocalDateTime;

public class Professor extends Usuario{
	
	
	private final String subject;
	public Professor(String subject,String username,String password,String email,String nome, 
			LocalDateTime dia_nasc,String telefone) {
		super(username,password,email,nome,dia_nasc,telefone);
		this.subject = subject;
		// TODO Auto-generated constructor stub
	}
	public String getSubject() {
		return subject;
	}
	
	
}
