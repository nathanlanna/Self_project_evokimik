package evoTest.services;

import java.util.List;

import evoTest.models.Mission;
import evoTest.models.Participacao;
import evoTest.models.Room;
import evoTest.repositories.AlunoRepository;
import evoTest.repositories.ProfessorRepository;
import evoTest.repositories.RoomRepository;

public class RoomService {

	private AlunoRepository alunoRep;
	private ProfessorRepository proRep;
	private RoomRepository roomRep;
	
	public RoomService(RoomRepository repository,AlunoRepository alunoRep, ProfessorRepository profRep) {
		this.alunoRep = alunoRep;
		this.proRep = profRep;
		this.roomRep = repository;
	}
	
	public void criarSala(String nome, List<Participacao> participantes) {
		Room room = new Room(nome, participantes);
		roomRep.criarSala(room);
	}
	
	public void deletarSala(Room room) {
		roomRep.deletarSala(room.getId());
	}
	
	public void adicionarParticipante(Room room,Participacao participante) {
		room.getParticipantes().add(participante);
	}
	
	public List<Participacao> listarParticipantes(Room room) {
		return room.getParticipantes();
	}
	
	public List<Mission> carregarMissões(Room room) {
		return room.getMissions();
	}
	
	public void adicionarMission(Room room,Mission mission) {
		room.getMissions().add(mission);
	}
	
	
	
}
