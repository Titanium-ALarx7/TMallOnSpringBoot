package person.TYWang.tmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.Semaphore;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] a){
        SpringApplication.run(MainApplication.class, a);
        //Semaphore
    }
}
