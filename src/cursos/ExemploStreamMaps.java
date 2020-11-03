package cursos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExemploStreamMaps {
	public static void main(String[] args) {

		List<Integer> listInteger = Arrays.asList(8,10,7,6,5,3);
		
		Map<String, Integer> cursosMap = listInteger.stream()
			.filter(v->v>5)
			.map(v->new Curso("Novo Curso "+v, v))
			.sorted(Comparator.comparing(Curso::getAlunos))
			.collect(Collectors.toMap(Curso::getNome,Curso::getAlunos));
			
		cursosMap.forEach((nome, alunos)->System.out.println(nome + "tem "+ alunos+ " alunos"));
	}
}
