package Day10_10_06_2022_Multithreading;

class M extends Thread
{

    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_RED = "\u001B[31m";

    public void run() {
        for(int i =1;i<=55;i++)
            System.out.println(TEXT_RED +"M hello "+i +TEXT_RESET);
    }
}

class N extends Thread
{
    public void run() {
        for(int i =1;i<=55;i++)
            System.out.println("N hello "+i);
    }
}

public class MultithreadingUsingThreadClass {
    public static void main(String[] args) {

        M obj = new M();
        N obj1 = new N();

        obj.start();
        obj1.start();
    }
}

