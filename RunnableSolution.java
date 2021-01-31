import java.util.Scanner;

public class RunnableSolution implements Runnable
{	
	public static double numeroFinal;
	String name;
	
	public RunnableSolution(String name)
	{
		System.out.println("Runnable");
		this.name=name;
	}
	
	public void run()
	{
		try
		{
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
		
		Thread t1 = new Thread(new RunnableSolution("Runnable"));

		t1.start();
	}
}