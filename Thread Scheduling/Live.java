class Demo extends Thread
{
	public void run(){
	try{
		System.out.println("Thread Running");
		}
	catch(Exception e){
			System.out.println("Thread Exception caught");
		}
	}
}
public class Live
{
	public static void main(String args[]){
	Demo d1 = new Demo();
	Demo d2 = new Demo();
	d1.start();
	d2.start();
	try{
		d1.join();
		d2.join();	
	}
	catch(Exception e){
		System.out.println("Interruped in join!!");
	}	
	}
}