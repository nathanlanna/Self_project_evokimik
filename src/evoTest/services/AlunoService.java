package evoTest.services;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import evoTest.models.Aluno;
import evoTest.repositories.AlunoRepository;

public class AlunoService {

	private AlunoRepository alunoRep;
	
	public AlunoService(AlunoRepository repository) {
		this.alunoRep = repository;
	}
	public void cadastrarAluno(String username,String password, String email, LocalDateTime dia_nasc,String nome, String telefone) {
		Aluno aluno = new Aluno(username,password,email,nome,dia_nasc,telefone);
		alunoRep.criarAluno(aluno);
	}
	
	public void excluirAluno(int id) {
		alunoRep.removerAluno(id);
	}
	
	public List<Aluno> listarAlunos() {
		List<Aluno> a = alunoRep.listarAlunos();
		return a;
	}
	
	public Optional<Aluno> findAlunoById(int id) {
		return alunoRep.buscarAlunoId(id);
	}
	

	
}
