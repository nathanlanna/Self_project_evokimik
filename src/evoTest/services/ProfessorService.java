package evoTest.services;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import evoTest.models.Professor;
import evoTest.repositories.ProfessorRepository;

public class ProfessorService {

	private ProfessorRepository profRep;
	
	public ProfessorService(ProfessorRepository repository) {
		this.profRep = repository;
	}
	public void cadastrarProfessor(String disciplina,String username,String password, String email, LocalDateTime dia_nasc,String nome, String telefone) {
		Professor professor = new Professor(disciplina,username,password,email,nome,dia_nasc,telefone);
		profRep.criarProfessor(professor);
	}
	
	public void excluirAluno(int id) {
		profRep.removerProfessor(id);
	}
	
	public List<Professor> listarProfessor() {
		List<Professor> p = profRep.listarProfessor();
		return p;
	}
	
	public Optional<Professor> findProfessorById(int id) {
		return profRep.buscarProfessorId(id);
	}
	

	
}
