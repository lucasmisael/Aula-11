/**
*  Unicesumar–Centro Universitário Cesumar
*  Curso: Análise e Desenvolvimento de Sistemas
*  Autor: 
*  Data:  
*/

public class MostraAutor

{
// O método main é o ponto de entrada do programa:


static public void main(String[] args)
{




/*	
-------------------------------------------------
			exercicio 1

	String nomeDoPrograma = "MostraAutor";
	String autor = "";
	
	if (autor == "")
	{
		System.out.println("Autor nao definido");
	}
	else
	{
	
	System.out.println("Autor:" + autor);

-----------------------------------------------	}
*/




/*---------------------------------------------

			exercicio 2

	for(int i = 0; i < 20; i= i+1)
	{
		System.out.println("Value of i: " + i);
		System.out.println("\n");
	}	

------------------------------------------------------

*/

/*			exercicio 3 


	int [] numbers = {10,20,30,40,50};
	
	for (int i : numbers )
	{
		System.out.print (i);
		System.out.println (",");
	}

	System.out.print("\n");

	String [] nome = {Lucas, James, Lucy};

	for ( String i : nome)
	{
		System.out.print (i)
		System.out.print (",")
	}
*/



/*--------------------------------------------
			Exercicio 4


	System.out.print("O programa foi executado com os parametros: \n");

	for (String arg: args )
	{
		System.out.print (arg);
	}
*/




/*
**************************************************************************
			atividade 1 e 2 - Calculo da média
*****************************************************************************

	//float num = Float.parseFloat(str);  é para converter uma string para inteiro
		
	
	float num1 = Float.parseFloat (args[0]);
	float num2 = Float.parseFloat (args[1]);
	
	System.out.println (num1);
	System.out.println (num2);
	float media = (num1 + num2) /2;
	System.out.print ("Media dos argumentos: ");
	System.out.print (media);
**************************************************************************************
*/	
	
	int i=0;
	float media = 0;
	
	for (string arg: args )
	{	i++;
		float num = Float.parseFloat (arg);
		media = media + num;
			
	}
		media = media / i;
		System.out.print ("Media dos argumentos: ");
		System.out.print (media);
	

	
}
}
