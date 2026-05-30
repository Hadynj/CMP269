
public class GreeterTask implements Runnable{

	public GreeterTask() {
		// TODO Auto-generated constructor stub
	}

    @Override
    public void run(){
        for (int i = 1; i <= 5; i++){
            System.out.println(""
            + Thread.currentThread().getName);
            try{
                Thread.sleep(500);
            } catch (InterrptedException e){
                e.printStacktrace();
            }
        }
    }

}

public class GreetingThreads{
    public static void main(String[] args){
        GreeterTask task = new GreeterTask();

        Thread t1 = new Thread(task, "Lehman-Thread-1");
        Thread t2 = new Thread(task, "Lehman-Thread-2");

        t1.start();
        t2.start();
    }
}
