package cursos;

import java.util.Arrays;
import java.util.List;

public class ExemploMediaDeNotas {
	public static void main(String[] args) {

		List<Integer> listInteger = Arrays.asList(10,8,10,7);
		
		listInteger.stream()
			.filter(v->v>7)
			.mapToInt(v->v)
			.average()
			.ifPresent(System.out::println);
	}
}
