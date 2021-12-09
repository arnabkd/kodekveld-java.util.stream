package kodekveld1;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Tests {
	Task tasks = new Task(); 				//TODO Bruk denne dersom du vil teste dine egne metoder
	//Answers tasks = new Answers();  		//TODO Bruk denne dersom du vil kjøre løsningsforslaget

	private static final List<Integer> numbersSortedASC = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50, 100);
	private static final List<Integer> numbersSortedDESC = Arrays.asList(100, 50, 40, 30, 20, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
	private static final List<Integer> numbersAbove40 = Arrays.asList(100, 50);
	private static final List<Integer> numbersWithLeastTwoDigits = Arrays.asList(100, 50, 40, 30, 20, 10);
	private static final List<String> namesASC = Arrays.asList("Arne", "Hans Ludvig", "Lars");
	private static final String anonymousLambdaFunctionString = "Hello Cap";

	private static final int doubleValueResult = 20;
	private static final int sumOfNumbers = 295;


	//------- Test numbers
	@Test
	public void numbersSortASC() {
		assertEquals(numbersSortedASC, tasks.numbersSortASC());
	}

	@Test
	public void numbersSortDESC() {
		assertEquals(numbersSortedDESC, tasks.numbersSortDESC());
	}

	@Test
	public void numbersSum(){
		assertEquals(295, (int)tasks.numbersSum());
	}

	@Test
	public void numbersWithLeastTwoDigitsDESC() {
		assertEquals(numbersWithLeastTwoDigits, tasks.numbersWithLeastTwoDigitsDESC());
	}
	//Forslag til flere oppgaver
	//Return all numbers negated
	//Return all numbers maching a given list as param. eks param {1,10,40,80,200}, expect list containing {1,10,40}

	//------- Test names

	@Test
	public void namesSortASC(){
		assertEquals(namesASC, tasks.namesASC());
	}

	@Test
	public void numbersAbove40() { assertEquals(numbersAbove40, tasks.numbersAbove40());}

	@Test
	public void testAnonymousLambdaFunction() {
		assertEquals(anonymousLambdaFunctionString, tasks.anonymousLambdaFunction());
	}

	@Test
	public void doubleValue() {
		assertEquals(doubleValueResult, tasks.doubleValue());
	}

	@Test
	public void stringConcat() {
		assertEquals(anonymousLambdaFunctionString, tasks.StringConcat());
	}

	@Test
	public void sumNumbers(){
		assertEquals(sumOfNumbers, tasks.numbersSum());
	}


}
