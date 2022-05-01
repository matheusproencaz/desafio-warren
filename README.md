<div align="center">
  <img alt="Academia-Capgemini" src="https://warren.proway.com.br/assets/img/warren-academy.png"/>
</div>



# Desafio

O Desafio de programação é a segunda etapa do processo de seleção para a Warren Tech Academy. O objetivo é testar os conhecimentos em lógica de programação.
Ele foi separado em 3 questões diferentes as quais foram implementadas em JAVA utilizando a IDE Eclipse com o JUnit 5 para realizar os testes.

## Programas necessários e bibliotecas:

<div>
  <ul>
     <li>
       <img align="center" width="50" height="50" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" />
    </li>
    <li>
      <img align="center" width="40" height="40" src="https://seeklogo.com/images/E/eclipse-logo-85FE4BEA34-seeklogo.com.png" />   
    </li>
     <li>
       <img align="center" width="50" height="50" src="https://avatars.githubusercontent.com/u/874086?s=280&v=4" />
    </li>
  </ul>
</div>

## Desafio 01

Alguns números inteiros positivos **n** possuem uma propriedade na qual a soma de **n + reverso(n)** resultam em números ímpares. 
Por exemplo,**36 + 63 = 99 e 409 + 904 = 1313**. Considere que **n ou reverso(n)** não podem começar com 0.

Existem 120 números reversíveis abaixo de 1000.

Construa um algoritmo que **mostre na tela todos os números n** onde a soma de **n + reverso(n) resultem em números ímpares** que estão abaixo de 1 milhão.

## Desafio 02
        
Um professor de programação, frustrado com a falta de disciplina de seus alunos, decidi cancelar a aula se menos de x alunos estiverem presentes quando a aula for iniciada. O tempo de chegada varia entre:

- **Normal:** tempoChegada <= 0
- **Atraso:** tempoChegada > 0

Construa um algoritmo que dado o tempo de chegada de cada aluno e o limite x de alunos presentes, determina se a classe vai ser cancelada ou não ("Aula cancelada” ou “Aula normal”).

### Exemplo:

**Entrada de dados:**
```java
x = 3
tempoChegada = [-2, -1, 0, 1, 2]
```

**Saída de dados:**
```java
Aula normal.
```
**Explicação:**

Os três primeiros alunos chegaram no horário. Os dois últimos estavam atrasados. O limite é de três alunos, portanto a aula não será cancelada.

## Desafio 03

Dado um vetor de números e um número n. Determine a soma com o menor número de elementos entre os números do vetor mais próxima de n e também mostre os elementos que compõem a soma. Para criar a soma, utilize qualquer elemento do vetor uma ou mais vezes.

### Exemplo:

**Entrada de dados:**
```java
N = 10
V = [2, 3, 4]
```
**Saída de dados:**

```java
[2, 4, 4]
[3, 3, 4]
```

Explicação:

Se **N = 10 e V = [2, 3, 4]** você pode utilizar as seguintes soma: **[2, 2, 2, 2, 2], [2, 2, 3, 3], [2, 4, 4] ou [3, 3, 4]**. Como a quantidade de elementos em **[2, 4, 4] e [3, 3, 4]** é igual, os dois conjuntos devem ser mostrados.

## Como rodar:
1. Crie um pasta que irá conter o repositório;
2. Abra um terminal e digite: ```git clone https://github.com/matheusproencaz/desafio-warren.git```;
3. Com JDK, uma IDE e JUnit instalado, abra a pasta com a IDE. 
4. Rode as questões e/ou os testes.

## Instação do Open JDK 17 - Windows

1. Baixar o openjdk-17.0.1;

2. Copiar o caminho da instalção do java. Ex: C:\Program Files\Java\jdk-17.0.1

3. Ir para o Editar as variáveis de ambiente do sistema

4. Clicar no botão "Variáveis de Ambiente..."

5. Clicar em Novo...

6. No campo "Nome da variável" digitar JAVA_HOME

7. No campo "Valor da variável" digitar o caminho de instalação. Ex: C:\Program Files\Java\jdk-17.0.1

8. Se a variável já existir clicar em Editar e mudar o valor da variável com o caminho

9. Conferir se a variável Path, o valor precisa estar %JAVA_HOME%\bin

## Após a instalação de todos os programas:

File > Open Projects from File System... > Directory... > Selecione a pasta com os arquivos baixados > Finish.
Com o projeto aberto, abrir o pacote questoes e clicar com o botão esquerdo na classe das questões ir em, Run as, Java Application.

## Testes

Foi utilizado o JUnit 5, para rodar os testes é necessário o ter instalado. Com ele instalado clique para rodar o teste como um JUnit test.


## Utilize a IDE que preferir!
