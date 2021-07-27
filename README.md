<h1> FrameWork JUnit - Testes Unitários</h1>



<h4>Este repositório tem uma introdução ao JUnit, com os principais Asserts. Os códigos são exercícios propostos no curso de introdução ao JUnit 4 da DIO - DIGITAL INNOVATION ONE.</h4>



Características do FrameWork Junit 4:

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