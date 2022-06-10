package Day10_10_06_2022_Multithreading;

class X implements Runnable // run()
{
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_RED = "\u001B[31m";
//System.out.println(TEXT_RED + "This text is red!" + TEXT_RESET);

    @Override
    public void run() {
        for(int i =1;i<=25;i++) {
            try {
                Thread.sleep(1000);// 5 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(TEXT_RED + "X hello " + i + TEXT_RESET);
        }
    }
}

class Y implements Runnable
{
    @Override
    public void run() {
        for(int i =1;i<=25;i++)
            System.out.println("Y hello "+i);
    }
}

public class MultithreadingUsingRunnable {
    public static void main(String[] args) {
        X obj = new X();
        Y obj1= new Y();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start(); //
        t2.start();


        // t1.run();
        // t2.run();
    }
}
