package proyectoReloj;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(new SecondThread(), "Clock") ;
        thread.start();
        TimeUnit.SECONDS.sleep(12);
        thread.interrupt();
        System.out.println("El hilo secundario ha terminado de ejecutarse");
    }
}
