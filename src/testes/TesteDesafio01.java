package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import questoes.Desafio01;

	/**
	 * Classe de testes do primeiro desafio.
	 * @author Matheus Proença
	 *
	 */
class TesteDesafio01 {
	
	/**
	 * Teste de verificação para 1.000.000;
	 */
	@SuppressWarnings("static-access")
	@Test
	void deveriaRetornar18720() {
		Desafio01 d01 = new Desafio01();
		assertEquals(18720, d01.counter((int) 1E6, false));
	}

	/**
	 * Teste de verificação para 1.000;
	 */
	@SuppressWarnings("static-access")
	@Test
	void deveriaRetornar120() {
		Desafio01 d01 = new Desafio01();
		assertEquals(120, d01.counter(1000, false));
	}

	/**
	 * Teste para verificar se o número é invertido corretamente.
	 */
	@SuppressWarnings("static-access")
	@Test
	void deveriaInverter() {
		Desafio01 d01 = new Desafio01();
		assertEquals(904, d01.reverseNumber(409));
	}
	
	/**
	 * Testes para verificar se está verificando os números ímpares de um número corretamente.
	 */
	@SuppressWarnings("static-access")
	@Test
	void deveriaRetornarVerdadeiro() {
		Desafio01 d01 = new Desafio01();
		assertEquals(true, d01.isAllNumbersOdd(1331));
	}
	
	@SuppressWarnings("static-access")
	@Test
	void deveriaRetornarFalso() {
		Desafio01 d01 = new Desafio01();
		assertEquals(false, d01.isAllNumbersOdd(409));
	}
	
}
