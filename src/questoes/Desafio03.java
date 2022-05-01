package questoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

	/**
	 * Classe do Terceiro desafio de programa��o para a Warren Tech Academy; 
	 * @author Matheus Proen�a
	 */
public class Desafio03 {

	public static void main(String[] args) {

		int n = 10;
		int[] v = {2, 3, 4};
		
		System.out.println(arraySum(v, n));
	}

	/** 
	 * M�todo que retorna a lista de lista de inteiros, dos menores vetores encontrados em que a soma dos seus valores � igual a n�mero 
	 * passado como par�metro do m�todo. Ordena os n�meros do vetor de forma ascendente e chama o m�todo que encontra todos os vetor
	 * poss�veis em que a soma � igual ao n�mero passado como par�metro e ap�s isso chama o m�todo que encontra os menores vetores dos que foram encontrados.
	 * 
	 * @param int[] array
	 * @param int num
	 * @return List<List<Integer>> arraysFound
	 */
	public static List<List<Integer>> arraySum(int[] array, int num) {
		List<List<Integer>> arraysFounds = new ArrayList<>();
		List<Integer> tempArray = new ArrayList<>();

		Arrays.sort(array);
		findArrays(arraysFounds, tempArray, array, num, 0);
		smallestArrays(arraysFounds);

		return arraysFounds;
	}

	/** M�todo que encontra todos os vetores em que a soma dos seus n�meros � igual ao n�mero passado como par�metro.
	 * O m�todo recebe uma Lista de lista de vetores que ser�o os vetores encontrados, recebe uma lista tempor�ria de inteiros
	 * o vetor de inteiros, o valor a ser atingido e o index do loop, ent�o o m�todo verifica se o n�mero a ser atingido � igual 
	 * a 0, caso satisfa�a essa condi��o quer dizer que os valores desse vetor s�o iguais ao n�mero informado, e assim eles s�o 
	 * adicionados � lista de lista de inteiros achados e retorna o m�todo. Se n�o satisfazer a condi��o o algoritmo segue para  
	 * um loop que primeiro verifica se algum valor do vetor � maior que o valor a ser atingido e caso aconte�a pula o mesmo.  
	 * O valor do vetor � adicionado ao vetor tempor�rio e ent�o � chamado o m�todo novamente, passando o valor atualizado do 
	 * n�mero a ser atingido, o valor do index do loop no momento e por �ltimo remove o �ltimo valor do vetor tempor�rio.
	 * 
	 * @param List<List<Integer>> arraysFounds
	 * @param List<Integer> tempArray
	 * @param int[] array
	 * @param int num
	 * @param int index
	 */
	public static void findArrays(List<List<Integer>> arraysFounds, List<Integer> tempArray, int[] array, int num,
			int index) {
		
		if (num == 0) {
			arraysFounds.add(new ArrayList<>(tempArray));
			return;
		}
		
		for (int i = index; i < array.length; i++) {
		
			if (array[i] > num) {
				break;
			}
			tempArray.add(array[i]);
			
			findArrays(arraysFounds, tempArray, array, num - array[i], i);
			tempArray.remove(tempArray.size() - 1);
		}
	}
	
	/**M�todo para encontrar o menor tamanho das lista de inteiros, em uma lista.
	 * @param List<List<Integer>> arraysFound
	 */
	public static void smallestArrays(List<List<Integer>> arraysFound) {

		int size = arraysFound.get(0).size();
		
		for(int i = 0; i < arraysFound.size(); i++) {
			if(arraysFound.get(i).size() < size) {
				size = arraysFound.get(i).size();
			}
		}

		arraysFound = removeBiggerArrays(arraysFound, size);
	}

	/**
	 * M�todo que remove, de uma lista de lista de inteiros, listas maiores que um valor inteiro enviado como par�metro.
	 * @param List<List<Integer>> arraysFound
	 * @param int smallestSize
	 * @return List<List<Integer>> arraysFound;
	 */
	public static List<List<Integer>> removeBiggerArrays(List<List<Integer>> arraysFound, int smallestSize){
		arraysFound.removeIf(x -> x.size() > smallestSize);
		return arraysFound;
	}
}