package proyectoReloj;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.HOURS;

public class SecondThread implements Runnable{
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public void run() {
        LocalDateTime nextHour=LocalDateTime.of(LocalDateTime.now().getYear(),LocalDateTime.now().getMonth(),
        LocalDateTime.now().getDayOfMonth(),LocalDateTime.now().getHour()+1,0,0,0);
        int condition = nextHour.getHour();while (!Thread.currentThread().isInterrupted()) {

            while(LocalDateTime.now().getHour() < condition && !Thread.currentThread().isInterrupted()) {
                System.out.println(LocalDateTime.now().format(dateTimeFormatter));
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    return;
                }

            }

        }

    }
}
