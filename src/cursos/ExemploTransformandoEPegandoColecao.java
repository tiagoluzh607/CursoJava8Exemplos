package cursos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploTransformandoEPegandoColecao {
	public static void main(String[] args) {

		List<Integer> listInteger = Arrays.asList(10,8,10,7,6,5,3);
		
		List<Curso> cursos = listInteger.stream()
			.filter(v->v>5)
			.map(v->new Curso("Novo Curso", v))
			.sorted(Comparator.comparing(Curso::getAlunos))
			.collect(Collectors.toList());
		
		cursos.forEach(c->System.out.println(c.getNome()+" - "+c.getAlunos()));
	}
}
