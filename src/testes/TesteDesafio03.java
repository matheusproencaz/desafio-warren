package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import questoes.Desafio03;

class TesteDesafio03 {

	/**
	 * Testes de verificação do método arraySum
	 */
	@SuppressWarnings("static-access")
	@Test
	void deveriaRetornar244e344() {
		Desafio03 d03 = new Desafio03();
		
		int n = 10;
		int[] v = {2,3,4};
		
		List<List<Integer>> expectedArrays = new ArrayList<>();
		
		expectedArrays.addAll(Arrays.asList(Arrays.asList(2,4,4), Arrays.asList(3,3,4)));
		
		assertEquals(expectedArrays, d03.arraySum(v, n));
	}

	@SuppressWarnings("static-access")
	@Test
	void deveriaRetornar55() {
		Desafio03 d03 = new Desafio03();
		
		int n = 10;
		int[] v = {2,3,4,5};
		
		List<List<Integer>> expectedArrays = new ArrayList<>();
		
		expectedArrays.addAll(Arrays.asList(Arrays.asList(5,5)));
		
		assertEquals(expectedArrays, d03.arraySum(v, n));
	}
	
	@SuppressWarnings("static-access")
	@Test
	void deveriaRetornarNenhumVetor() {
		Desafio03 d03 = new Desafio03();
		
		int n = 0;
		int[] v = {2,3,4,5};
		
		List<List<Integer>> expectedArrays = new ArrayList<>();
		
		expectedArrays.add(Arrays.asList());
		
		assertEquals(expectedArrays, d03.arraySum(v, n));
	}
	
	
	/**
	 * Teste de verificação do método removeBiggerArrays.
	 */
	@SuppressWarnings("static-access")
	@Test
	void deveriaRetornarMenoresVetores() {
		Desafio03 d03 = new Desafio03();
		
		List<List<Integer>> allArrays = new ArrayList<>();
		List<List<Integer>> expectedArrays = new ArrayList<>();
		
		allArrays.addAll(Arrays.asList(Arrays.asList(2,2,2,2,2), 
									   Arrays.asList(2,2,2,4), 
									   Arrays.asList(2,2,3,3),
									   Arrays.asList(2,4,4),
									   Arrays.asList(3,3,4)));
		
		expectedArrays.addAll(Arrays.asList(Arrays.asList(2,4,4),
											Arrays.asList(3,3,4)));
		
		
		assertEquals(expectedArrays, d03.removeBiggerArrays(allArrays, 3));
	}
	
}

