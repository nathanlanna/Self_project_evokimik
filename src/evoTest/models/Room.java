package evoTest.models;

import java.io.Serial;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Room {
	
	private int Id;
	private String nome;
	private LocalDateTime data_create;
	private List<Participacao> participantes = new ArrayList<>();
	private List<Mission> currentMissions;
	
	public Room(String nome, List<Participacao> participantes) {
		this.nome = nome;
		this.data_create = LocalDateTime.now();
		this.participantes = participantes;	
	}

	public int getId() {
		return Id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getData_create() {
		return data_create;
	}

	public List<Mission> getMissions() {
		return currentMissions;
	}

	public void setMissions(List<Mission> missions) {
		this.currentMissions = missions;
	}
	
	public List<Participacao> getParticipantes(){
		return participantes;
	}
	
}
