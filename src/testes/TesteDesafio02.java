package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import questoes.Desafio02;

	/**
	 * Classe de testes do segundo desafio. 
	 * @author Matheus Proença
	 *
	 */
class TesteDesafio02 {

	/**
	 * Testes para verificar se os métodos estão fazendo o esperado.
	 */
	@SuppressWarnings("static-access")
	@Test
	void deveriaRetornarAulaNormal() {
		Desafio02 d02 = new Desafio02();
		
		int[] arrivalTime = {-2, -1, 0, 1, 2};
		int limit = 3;
		
		assertEquals("Aula normal!", d02.isClassCanceled(limit, arrivalTime));
	}

	@SuppressWarnings("static-access")
	@Test
	void deveriaRetornarAulaCancelada() {
		Desafio02 d02 = new Desafio02();
		
		int[] arrivalTime = {-2, -1, 0, 1, 2};
		int limit = 2;
		
		assertEquals("Aula cancelada!", d02.isClassCanceled(limit, arrivalTime));
	}
	
	/**
	 * Teste de verificação do contador de estudantes atrasados
	 */
	@SuppressWarnings("static-access")
	@Test
	void deveriaRetorar2EstudantesAtrasados() {
		Desafio02 d02 = new Desafio02();
		
		int[] arrivalTime = {-2, -1, 0, 1, 2};
		
		assertEquals(2, d02.countLateStudents(arrivalTime));
	}	
}