package evoTest.repositories;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import evoTest.models.Professor;

public class ProfessorRepositoryMemory implements ProfessorRepository {
	
	private Map<Integer,Professor> professores = new ConcurrentHashMap<>();
	
	@Override
	public List<Professor> listarProfessor() {
		// TODO Auto-generated method stub
		return List.copyOf(professores.values());
		
	}

	@Override
	public Optional<Professor> buscarProfessorId(int id) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(professores.get(id));
		
	}

	@Override
	public void criarProfessor(Professor prof) {
		// TODO Auto-generated method stub
		professores.put(prof.getId(), prof);
		
		
	}

	@Override
	public void removerProfessor(int id) {
		// TODO Auto-generated method stub
		professores.remove(id);
		}

	

}
