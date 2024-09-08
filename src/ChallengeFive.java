import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Desafio 5 - Calcule a média dos números maiores que 5:
 * Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no
 * console.
 */

public class ChallengeFive {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
//		List<Integer> filteredNumbers = numeros.stream()
//			.filter(n -> n > 5)
//			.toList();
		
//		Integer result =
//			filteredNumbers.stream().reduce(0, Integer::sum) / filteredNumbers.size();
		
		OptionalDouble average = numeros.stream()
				.filter(n -> n > 5)
				.mapToInt(Integer::intValue)
				.average();
		
		if (average.isPresent()) {
			System.out.println("Média final: " + average.getAsDouble());
		} else {
			System.out.println("Nenhum número maior que 5.");
		}
	}
}
