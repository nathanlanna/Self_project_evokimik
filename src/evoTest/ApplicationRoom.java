package evoTest;

import java.time.LocalDateTime;
import java.util.Scanner;

import evoTest.repositories.AlunoRepository;
import evoTest.repositories.AlunoRepositoryMemory;
import evoTest.services.AlunoService;

public class ApplicationRoom {

	public static void main(String[] args) {
		AlunoRepository alunoRepo = new AlunoRepositoryMemory();
		AlunoService aService = new AlunoService(alunoRepo);
		Scanner n = new Scanner(System.in);

		System.out.println("Olá, gostaria de se cadastrar como aluno? 'S' para continuar");
		if (n.next().equals(new String("s"))) {

			System.out.println("Preencha corretamente o formulário");

			System.out.println("username:");
			String username = n.next();
			System.out.println("senha:");
			String password = n.next();
			System.out.println("email:");
			String email = n.next();
			System.out.println("nome:");
			String nome = n.next();
			System.out.println("telefone:");
			String telefone = n.next();
			
			aService.cadastrarAluno(username, password, email, LocalDateTime.now(), nome, telefone);
			System.out.println("O aluno foi criado com sucesso");

		}else{
			System.out.println("Obrigado, volte sempre");
		}
		
		System.out.println("Listagem de alunos:");
		aService.listarAlunos().forEach(aluno->System.out.println(aluno));
	}

}
