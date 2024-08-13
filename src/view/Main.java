package view;

import controller.Controller;

public class Main 
{

	public static void main (String[] args) 
	{
		Controller c = new Controller();
		
		
			
		int[] vet = {1,2,3,3,4,5,6,6};
		int tam = vet.length;
		
		int cont = 0;
		
		int resultado = c.VetPares(vet, tam, cont);
		
		System.out.println(resultado);
		
		for(int n : vet)
		{
			System.out.print(n + ", ");
		}
		
	}
	
}
