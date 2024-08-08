package com.example.homeworkaop.profiles;

import com.example.homeworkaop.interfaces.ProfileService;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class Prod implements ProfileService {
    @Override
    public void Something() {
        System.out.println("prod profile service");
    }

    @Override
    @Async
    public void asyncMethod() {
        try {
            Thread.sleep(2000);
            System.out.println("Async method executed in a different thread");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
