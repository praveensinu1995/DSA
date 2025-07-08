package java8;

public class CreateThread  {
    public static void main(String[] args) {
        Runnable runnable=()->{
            System.out.println("hi");
        };

        new Thread(runnable).start();

        Thread thread=new Thread(()->{
            System.out.println("from thread ");
        });
        thread.start();
    }

}
