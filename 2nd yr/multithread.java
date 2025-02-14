import java.util.Random;

public class Square implements Runnable 
{ 
	int x; 
	Square(int n) 
	{ 
		x=n;
	} 
	public void run() 
	{ 
		int sqr = x * x; 
		System.out.println("Square of " + x + " = " + sqr ); 
	} 
} 

class Cube implements Runnable 
{ 
	int x; 
	Cube(int n) 
	{ 
	x = n; 
	} 
	public void run() 
	{ 
	int cub = x * x * x; 
	System.out.println("Cube of " + x + " = " + cub ); 
	} 
}

class Number extends Thread 
{ 
	public void run() 
	{ 
		Random random = new Random(); 
		for(int i =0; i<5; i++) 
		{ 
			int randomInteger = random.nextInt(100); 
			System.out.println("Random Integer generated : " + randomInteger); 
			Thread t1=new Thread(new Square(randomInteger)); 
			t1.start(); 
			Thread t2=new Thread(new Cube(randomInteger)); 
			t2.start(); 
			try { 
				Thread.sleep(500); 
			}
			catch (InterruptedException ex) { 
				System.out.println(ex); 
			} 
		} 
	 
	} 
}
class DemoThread { 
	public static void main(String args[]) 
	{ 
		Number n = new Number(); 
		n.start(); 
	} 
}
