package evoTest.repositories;

import java.util.List;
import java.util.Optional;

import evoTest.models.Aluno;
import evoTest.models.Professor;

public interface ProfessorRepository {

	List<Professor> listarProfessor();
	Optional<Professor> buscarProfessorId(int id);
	void criarProfessor(Professor prof);
	void removerProfessor(int id);
	
}
