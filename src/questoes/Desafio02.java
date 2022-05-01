package questoes;
	/**
	 * Classe do Segundo desafio de programação para a Warren Tech Academy;
	 * @author Matheus Proença
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
	 * Método que conta o número de estudantes atrasados.
	 * O algoritmo começa com um loop que passa por todo o vetor de tempo de chegada, se o tempo de chegada for maior que 0,
	 * significa que o aluno chegou atrasado, e ele é adicionado ao contador de estudantes atrasados.
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
	 * Método que retorna uma String dizendo se a aula foi cancelada ou não.
	 * É verificado se o número de estudantes atrasados é maior que o limite permitido.
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
