package evoTest.repositories;

import java.util.List;
import java.util.Optional;

import evoTest.models.Aluno;

public interface AlunoRepository {

	List<Aluno> listarAlunos();
	Optional<Aluno> buscarAlunoId(int id);
	void criarAluno(Aluno aluno);
	void removerAluno(int id);
	
}
