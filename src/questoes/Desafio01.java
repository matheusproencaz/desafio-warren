package questoes;

	/**
	 * Classe do primeiro desafio de programação para a Warren Tech Academy;
	 * @author Matheus Proença.
	 *
	 */
public class Desafio01 {
	
	public static void main(String[] args) {
		int valor = (int) 1E6;

		System.out.println("Existem " + counter(valor, true) + " números reversíveis abaixo de "+ valor+"!");
	}
	
	/** Método que verifica todos os números até o valor a ser atingido, caso a soma do número e seu reverso
	* sejam todos ímpares o contador adiciona mais um e o valor é impresso na tela, se o parâmetro shouldPrint
	* for verdadeiro.  
	* 
	* @param int target
	* @param boolean shouldPrint
	* @return int counter
	*/
	public static int counter(int target, boolean shouldPrint) {
		int counter = 0;

		for (int i = 0; i <= target; i++) {
			int rNumber = reverseNumber(i);
			int sum = i + rNumber;
			
			if (isAllNumbersOdd(sum)) {
				
				if(shouldPrint) {
					System.out.println(i);
				}
				counter++;
			}
		}
		return counter;
	}
	
	/** Método que inverte o número passado como parâmetro.
	 * É utilizado a classe wrapper de inteiros para utilizar o método toString para fazer o casting de inteiro para string, então
	 * é invertido os valores utilizando substrings, basicamente se concatena os caracteres do strings começando do último e indo até o primeiro.
	 * Após inverter verifica-se a string começa com o caractere 0, se não, faz-se o casting para inteiro da string. 
	 * 
	 * @param Integer number
	 * @return Integer reversedNumber;
	 */
	public static Integer reverseNumber(Integer number) {
		String numStr = number.toString();
		String numStrInverted = "";
		Integer reversedNumber = 0;
		
		for (int i = 0; i < numStr.length(); i++) {
			numStrInverted += numStr.substring(numStr.length() - i - 1, numStr.length() - i);
		}

		if(numStrInverted.charAt(0) != '0') reversedNumber = Integer.parseInt(numStrInverted);
		
		return reversedNumber;
	}

	
	/**
	 * Método que verifica se um valor é ímpar ou não, tem como objetivo deixar o código mais legível.
	 * @param int number
	 * @return boolean;
	 */
	public static boolean isOdd(int number) {
		return number % 2 != 0;
	};
	
	/**
	 * Método que verifica se todos os valores de um número são ímpares.
	 * Verifica cada número um por um e adiciona a um contador, se o contador e o tamanho do número são iguais, ele retorna verdadeiro.
	 * @param number
	 * @return
	 */
	public static boolean isAllNumbersOdd(Integer number) {
		int counter = 0;
		char[] numArray = number.toString().toCharArray();
		
		for(int i = 0; i < numArray.length; i++) {
			if(isOdd(numArray[i])){
				counter++;;
			}
		}
		return (counter == numArray.length);
	}
}
