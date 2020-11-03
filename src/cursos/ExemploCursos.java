package cursos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Curso{
	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAlunos() {
		return alunos;
	}
	
	@Override
	public String toString() {
		return getNome();
	}
}


public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = Arrays.asList(
			new Curso("Python", 45), new Curso("JavaScript", 150),
			new Curso("Java 8", 113), new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		int soma = cursos.stream()
			.filter(c -> c.getAlunos() >= 100) //filtra cursos acima de 100 alunos
			.mapToInt(c -> c.getAlunos()) //mapeia para um stream de inteiros
			.sum(); //faz a soma do stream
		
		System.out.println(soma);

		
	}
}
