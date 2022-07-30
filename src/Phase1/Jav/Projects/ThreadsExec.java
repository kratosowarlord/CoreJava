package Phase1.Jav.Projects;

public class ThreadsExec extends Thread {
	
	
	public void run() {
		
		System.out.println("This is the Run method of Thread class.");
	}
	
	
	
	public static void main(String[] args) {
		
		ThreadsExec tc = new ThreadsExec();
		
		tc.start();
		
		
		
	}

}
