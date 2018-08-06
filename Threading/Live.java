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
	d1.start();	
	}
}