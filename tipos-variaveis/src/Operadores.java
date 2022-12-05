public class Operadores {
    public static void main(String[] args){
        /*String nomeCompleto = "LINGUAGEM" + " " + "JAVA";
        System.out.print(nomeCompleto);*/


//qual o resultado das expressoes abaixo?

	/*String concatenacao ="?"; 

    concatenacao = 1+1+1+"1";

    System.out.println(concatenacao);
	 
	concatenacao = 1+"1"+1+1;

    System.out.println(concatenacao);
	 
	concatenacao = 1+"1"+1+"1";

    System.out.println(concatenacao);
	 
	concatenacao = "1"+1+1+1;

    System.out.println(concatenacao);
	 
	concatenacao = "1"+(1+1+1);
    
    System.out.println(concatenacao);*/


// Operadores Unários
        /*int numero = 5;
        //System.out.println(- numero);

        numero = - numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);*/


//Incremento
// repetição
        
        /*int numero = 5;
        //numero ++; //incrementa 1
        //numero = numero + 2;

        System.out.println( ++ numero);
        System.out.println(numero);*/

//Decremento
        /*int numero = 10;
        System.out.println( -- numero);
        System.out.println(numero);*/


//Boolean
        /*boolean variavel = true;
        //System.out.println(!variavel);

        variavel = !variavel;

        System.out.println(variavel);*/

//Ternário

        // classe Operadores.java

        //int a, b;
 
        /*a = 5;
        b = 6;*/

        //a = 6;
        //b = 6;

        /*String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);*/

        //String resultado = a==b ? "verdadeiro" : "falso";
        //System.out.println(resultado);*/

 
/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
if(a==b)
 resultado = "verdadeiro";
else
 resultado = "falso";
*/


//Operadores Relacionais

        /*int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.print("a nossa condição é verdadeira");
        }*/
        

        
        /*System.out.println("numeroUm é igual ao numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente ao numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior ao numeroDois? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("numeroUm é menor ao numeroDois? " + simNao);*/


//Operadores com String

        /*String nomeUm = "Josiane";
        String nomeDois = "Josyane";*/

        /*String nomeUm = "Josiane";
        String nomeDois = "Josiane";

        System.out.println(nomeUm == nomeDois);*/

    
//Operadores lógicos
        
        boolean condicao1=true;
 
        boolean condicao2=false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras."); 
            //não será executado por que não são verdadeiras.

        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira.");
        }
        System.out.println("fim");

    }
}
