package proyectoReloj;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(new SecondThread(), "Clock") ;
        thread.start();
        TimeUnit.SECONDS.sleep(12);
        thread.interrupt();
        // Te ha faltado esperar a que el hilo secundario termine de ejecutarse.
        thread.join();
        System.out.println("El hilo secundario ha terminado de ejecutarse");
    }
}
