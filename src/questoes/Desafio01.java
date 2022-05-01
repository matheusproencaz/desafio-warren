package questoes;

	/**
	 * Classe do primeiro desafio de programa��o para a Warren Tech Academy;
	 * @author Matheus Proen�a.
	 *
	 */
public class Desafio01 {
	
	public static void main(String[] args) {
		int valor = (int) 1E6;

		System.out.println("Existem " + counter(valor, true) + " n�meros revers�veis abaixo de "+ valor+"!");
	}
	
	/** M�todo que verifica todos os n�meros at� o valor a ser atingido, caso a soma do n�mero e seu reverso
	* sejam todos �mpares o contador adiciona mais um e o valor � impresso na tela, se o par�metro shouldPrint
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
	
	/** M�todo que inverte o n�mero passado como par�metro.
	 * � utilizado a classe wrapper de inteiros para utilizar o m�todo toString para fazer o casting de inteiro para string, ent�o
	 * � invertido os valores utilizando substrings, basicamente se concatena os caracteres do strings come�ando do �ltimo e indo at� o primeiro.
	 * Ap�s inverter verifica-se a string come�a com o caractere 0, se n�o, faz-se o casting para inteiro da string. 
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
	 * M�todo que verifica se um valor � �mpar ou n�o, tem como objetivo deixar o c�digo mais leg�vel.
	 * @param int number
	 * @return boolean;
	 */
	public static boolean isOdd(int number) {
		return number % 2 != 0;
	};
	
	/**
	 * M�todo que verifica se todos os valores de um n�mero s�o �mpares.
	 * Verifica cada n�mero um por um e adiciona a um contador, se o contador e o tamanho do n�mero s�o iguais, ele retorna verdadeiro.
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
