package Phase1.Jav.Projects;

public class Syncronized_wait {
	
	private static Object LOCKEY = new Object();
    public static void main(String args[]) throws InterruptedException
    {
        Thread.sleep(2000);
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
        synchronized (LOCKEY) 
        {
            LOCKEY.wait(2000);
            System.out.println("Object '" + LOCKEY + "' is woken after" + " waiting for 1 second");
        }
    }


}
