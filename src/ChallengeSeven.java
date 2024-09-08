import java.util.Arrays;
import java.util.List;

/**
 * Desafio 7 - Encontrar o segundo número maior da lista:
 * Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o
 * resultado no console.
 */

public class ChallengeSeven {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		List<Integer> resultList = numeros.stream()
			.sorted((n1, n2) -> n2 - n1)
			.distinct()
			.toList();
		
		System.out.println(resultList.get(1));
	}
}
