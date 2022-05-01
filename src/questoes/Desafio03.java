package questoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

	/**
	 * Classe do Terceiro desafio de programação para a Warren Tech Academy; 
	 * @author Matheus Proença
	 */
public class Desafio03 {

	public static void main(String[] args) {

		int n = 10;
		int[] v = {2, 3, 4};
		
		System.out.println(arraySum(v, n));
	}

	/** 
	 * Método que retorna a lista de lista de inteiros, dos menores vetores encontrados em que a soma dos seus valores é igual a número 
	 * passado como parâmetro do método. Ordena os números do vetor de forma ascendente e chama o método que encontra todos os vetor
	 * possíveis em que a soma é igual ao número passado como parâmetro e após isso chama o método que encontra os menores vetores dos que foram encontrados.
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

	/** Método que encontra todos os vetores em que a soma dos seus números é igual ao número passado como parâmetro.
	 * O método recebe uma Lista de lista de vetores que serão os vetores encontrados, recebe uma lista temporária de inteiros
	 * o vetor de inteiros, o valor a ser atingido e o index do loop, então o método verifica se o número a ser atingido é igual 
	 * a 0, caso satisfaça essa condição quer dizer que os valores desse vetor são iguais ao número informado, e assim eles são 
	 * adicionados à lista de lista de inteiros achados e retorna o método. Se não satisfazer a condição o algoritmo segue para  
	 * um loop que primeiro verifica se algum valor do vetor é maior que o valor a ser atingido e caso aconteça pula o mesmo.  
	 * O valor do vetor é adicionado ao vetor temporário e então é chamado o método novamente, passando o valor atualizado do 
	 * número a ser atingido, o valor do index do loop no momento e por último remove o último valor do vetor temporário.
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
	
	/**Método para encontrar o menor tamanho das lista de inteiros, em uma lista.
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
	 * Método que remove, de uma lista de lista de inteiros, listas maiores que um valor inteiro enviado como parâmetro.
	 * @param List<List<Integer>> arraysFound
	 * @param int smallestSize
	 * @return List<List<Integer>> arraysFound;
	 */
	public static List<List<Integer>> removeBiggerArrays(List<List<Integer>> arraysFound, int smallestSize){
		arraysFound.removeIf(x -> x.size() > smallestSize);
		return arraysFound;
	}
}