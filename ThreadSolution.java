import java.util.Scanner;

public class ThreadSolution extends Thread
{	
	public static double numeroFinal;
	public void run()
	{
		try
		{
			int total=0;
			System.out.println("Thread 1: Numeros pares");
			for (int i=1; i<numeroFinal; i++)
			{
				if(i%2==0)
				{
				System.out.println(i);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try 
		{
			int total=0;
			System.out.println("Thread 2: Numeros impares");
			for (int i=1; i<numeroFinal; i++)
			{
				if(i%2!=0)
				{
				System.out.println(i);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		double limite = 0;
		Scanner lector = new Scanner(System.in);
		try 
		{
			System.out.println("Ingrese el limite:");
			limite = Double.parseDouble(lector.next());
			numeroFinal=limite;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		Thread t1 = new Thread(new ThreadSolution());

		t1.start();
	}
}
