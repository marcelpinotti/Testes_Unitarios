# Framework JUnit - Testes Unitários

### Este repositório tem uma introdução ao JUnit, com os principais Asserts. Os códigos são exercícios propostos no curso de introdução ao JUnit 4 da DIO - DIGITAL INNOVATION ONE.

Características do Framework Junit 4:

- Simples, de código aberto, e executa testes repetidamente;

 * Não serve para testes de regressão ou integrados;   

     ***TESTES UNITÁRIOS***

     - SERVEM PARA TESTAR UMA ÚNICA FUNCIONALIDADE, E UMA ÚNICA CLASSE;
     - CADA CLASSE DEVE TER UMA CLASSE DE TESTE CORRESPONDENTE;   

     O **MAVEN** monta uma arquitetura que ajuda na execução dos testes, pois ele separa as áreas de código das áreas de testes.

     Como o código é testado repetidamente a cada nova execução, o mesmo deve continuar funcionando a cada novo teste independente da alteração.

Os métodos testados recebem a anotação ***@Test***.

***Asserts:*** São usados para validação dos testes.

 * Indicam se um resultado é igual ao resultado esperado em um trecho do código.
 * Estão presentes para tipos primitivos, Objetos e Arrays.
 * Todos Asserts utilizam um Import Static, o que torna o código mais simples.
 * A ordem dos parâmetros é -> Valor Esperado, Valor Atual.


# DESENVOLVIMENTO GUIADO POR TESTE - TDD

## Instrutora Everis - Katia Gonçalves

***TDD*** - DESENVOLVIMENTO GUIADO POR TESTE (Test Driven Development).

​	- Ficou mais difundido nos últimos anos pelo surgimento das metodologias e desenvolvimentos ágeis.

- *Junit* - Plugin que possibilita realizar os testes.

  - Encima das especificações de desenvolvimento do projeto, os testes são escritos antes da criação da próprias classes (código) que irão compor o projeto.
  - O teste passando significa que sua funcionalidade está escrita e possivelmente não tem vulnerabilidade, além de também estar relacionado com a qualidade do processo de desenvolvimento do código.
    - Utilizada em metodologias como o XP (Programação Extrema).

- Fases do TDD:

  - 1º Teste de Unidade. Falha;
  - 2º Teste bem Sucedido. Passa;
  - 3º Refatorar. 

- Desenvolvimento Guiado por testes:

  - Visão mais ampla do que deve ser desenvolvido.

    - Pois antes da funcionalidade é criada o teste (teste falho) da mesma.
