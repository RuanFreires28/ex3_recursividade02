package controller;

public class Controller 
{
	
	public Controller()
	{
		super();
	}
	
	
	public int VetPares(int[] vet, int tam, int cont)
	{
		
		if (tam == 0)
		{
			return cont;
		}
		else
		{
			
			if (vet[tam - 1] % 2 != 0)
			{
				cont = cont+1;
			}
			
			return VetPares(vet, (tam - 1), cont);
	
		}

	}
	
}
