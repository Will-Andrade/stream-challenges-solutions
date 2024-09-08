import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Desafio 18 - Verifique se todos os números da lista são iguais:
 * Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o
 * resultado no console.
 */

public class ChallengeEighteen {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Integer firstElement = numeros.getFirst();
		Boolean allNumbersAreEqual = numeros.stream()
			.allMatch(n -> Objects.equals(n, firstElement));
		
		System.out.println("Todos os números são iguais? " + allNumbersAreEqual);
	}
}
