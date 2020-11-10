package kodekveld1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Inneholder løsningsforslag til alle oppgaver
 */
public class Answars {
	private static final List<Integer> numbers = Arrays.asList(1,10,100,2,20,3,30,4,5,6,7,8,9,50,40);
	private static final List<String> names = Arrays.asList("Lars","Arne","Hans Ludvig");


	/**
	 * Sort the array numbersUnsoured in ASC order
	 * @return List<Integer>
	 */
	public List<Integer> numbersSortASC(){
		return numbers.stream().sorted().collect(Collectors.toList());
	}

	/**
	 * Sort the array numbersUnsoured in DESC order
	 * @return List<Integer>
	 */
	public List<Integer> numbersSortDESC(){
		return numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}

	/**
	 * Return the sum of all elements in the list
	 * @return int
	 */
	public Integer numbersSum(){
		return numbers.stream().mapToInt(Integer::intValue).sum();
	}

	/**
	 * Return the names sorted in ASC order
	 * @return List<String>
	 */
	public List<String> namesASC(){
		return names.stream().sorted().collect(Collectors.toList());
	}
}
