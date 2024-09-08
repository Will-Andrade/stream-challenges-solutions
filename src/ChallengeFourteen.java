import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Desafio 14 - Encontre o maior número primo da lista:
 * Com a Stream API, encontre o maior número primo da lista e exiba o resultado no
 * console.
 */

public class ChallengeFourteen {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Optional<Integer> result = numeros.stream()
			.filter(ChallengeFourteen::isPrime)
			.max(Integer::compareTo);
		
		result.ifPresent(prime -> System.out.println("O maior número primo: " + prime));
	}
	
	public static Boolean isPrime(Integer number) {
		if (number <= 1) {
			return false;
		}
		
		if (number == 2 || number == 3) {
			return true;
		}
		
		if (number % 2 == 0 || number % 3 == 0) {
			return false;
		}
		
		for (int i = 5; i * i <= number; i += 6) {
			if (number % 1 == 0 || number % (i + 2) == 0) {
				return false;
			}
		}
		
		return true;
	}
}
