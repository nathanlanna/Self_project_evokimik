package evoTest.models;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public abstract class Usuario {

	private int Id;
	private String username;
	private String password;
	private String email;
	private String nome;
	private LocalDateTime dia_nasc;
	private String telefone;
	private List<Room> salas;
	private List<Mission> missions;
	
	protected Usuario(String username, String password, String email,String nome,
			LocalDateTime dia_nasc, String telefone) {
		this.Id = UUID.randomUUID().hashCode();
		this.username=username;
		this.password=password;
		this.email = email;
		this.dia_nasc = dia_nasc;
		this.nome=nome;
		this.telefone = telefone;
		
	}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id){
		this.Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDateTime getDia_nasc() {
		return dia_nasc;
	}
	public void setDia_nasc(LocalDateTime dia_nasc) {
		this.dia_nasc = dia_nasc;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public List<Room> getSalas() {
		return salas;
	}
	public void setSalas(List<Room> salas) {
		this.salas = salas;
	}
	public List<Mission> getMission() {
		return missions;
	}
	public void setMission(List<Mission> mission) {
		this.missions = mission;
	}
	
	
}
