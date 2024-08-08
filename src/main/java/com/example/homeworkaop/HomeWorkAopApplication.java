package com.example.homeworkaop;

import com.example.homeworkaop.interfaces.ProfileService;
import com.example.homeworkaop.profiles.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class HomeWorkAopApplication implements CommandLineRunner {

    private final MainService mainService;

    @Autowired
    public HomeWorkAopApplication(MainService mainService) {
        this.mainService = mainService;
    }

    public static void main(String[] args) {
        SpringApplication.run(HomeWorkAopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        mainService.Test();
    }

    @Scheduled(cron = "0 20,45 * * * *")
    public void scheduledTask() {
        System.out.println("Scheduled unning at 20th and 45th minute of every hour.");
    }

    @Scheduled(fixedRate = 3000)
    public void scheduledTaskEvery3Seconds() {
        System.out.println("Scheduled running every 3 seconds.");
    }
}
