package cursos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {

		LocalDate hoje =  LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
		
		Period periodo = Period.between(hoje, olimpiadasRio);
		System.out.println(periodo.getDays());
		
		LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
		System.out.println(proximasOlimpiadas);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = proximasOlimpiadas.format(formatador);
		
		System.out.println(dataFormatada);
		
		//Se Queremos com minutos e segundos
		
		DateTimeFormatter formatadorComHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHora));
		
		//Trabalhando com elementos da data separados
		
		YearMonth mes = YearMonth.of(2020, Month.AUGUST);
		
		//somente hora
		
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
		
	}
}
