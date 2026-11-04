package evoTest.repositories;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import evoTest.models.Aluno;

public class AlunoRepositoryMemory implements AlunoRepository {
	
	private Map<Integer,Aluno> alunos = new ConcurrentHashMap<>();
	
	@Override
	public List<Aluno> listarAlunos() {
		// TODO Auto-generated method stub
		return List.copyOf(alunos.values());
		
	}

	@Override
	public Optional<Aluno> buscarAlunoId(int id) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(alunos.get(id));
		
	}

	@Override
	public void criarAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		alunos.put(aluno.getId(), aluno);
		
		
	}

	@Override
	public void removerAluno(int id) {
		// TODO Auto-generated method stub
		alunos.remove(id);
		}

}
