package questoes;
	/**
	 * Classe do Segundo desafio de programa��o para a Warren Tech Academy;
	 * @author Matheus Proen�a
	 *
	 */
public class Desafio02 {

	public static void main(String[] args) {
		
		int[] arrivalTime = {-2, -1, 0, 1, 2};
		int limit = 3;
		
		String aula = isClassCanceled(limit, arrivalTime);
		System.out.println(aula);
	}
	/**
	 * M�todo que conta o n�mero de estudantes atrasados.
	 * O algoritmo come�a com um loop que passa por todo o vetor de tempo de chegada, se o tempo de chegada for maior que 0,
	 * significa que o aluno chegou atrasado, e ele � adicionado ao contador de estudantes atrasados.
	 * 
	 * @param int[] arrivalTime
	 * @return int lateStudents
	 */
	public static int countLateStudents(int[] arrivalTime) {

		int lateStudents = 0;
		
		for(int i = 0; i < arrivalTime.length; i++) {
			if(!(arrivalTime[i] <= 0)) {
				lateStudents++;
			}
		}
		return lateStudents;
	}
	
	/**
	 * M�todo que retorna uma String dizendo se a aula foi cancelada ou n�o.
	 * � verificado se o n�mero de estudantes atrasados � maior que o limite permitido.
	 * 
	 * @param limit
	 * @param arrivalTime
	 * @return
	 */
	public static String isClassCanceled(int limit, int[] arrivalTime) {
		String isClassCanceled = "";
		
		if(countLateStudents(arrivalTime) >= limit) {
			isClassCanceled = "Aula cancelada!";
		} else {
			isClassCanceled = "Aula normal!";
		}
		return isClassCanceled;
	}
}
