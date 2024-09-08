import java.util.Arrays;
import java.util.List;

/**
 * Desafio 16 - Agrupe os números em pares e ímpares:
 * Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo
 * os números pares e outra contendo os números ímpares da lista original, e exiba os
 * resultados no console.
 */

public class ChallengeSixteen {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		List<Integer> oddNumbers = numeros.stream()
			.filter(num -> num % 2 != 0)
			.toList();
		
		List<Integer> evenNumbers = numeros.stream()
			.filter(num -> num % 2 == 0)
			.toList();
		
		System.out.println("Números pares: " + evenNumbers);
		System.out.println("Números ímpares: " + oddNumbers);
	}
}
