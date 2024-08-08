package com.example.homeworkaop.profiles;

import com.example.homeworkaop.interfaces.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MainService {
    private final ProfileService profileService;

    @Autowired
    public MainService(ProfileService profileService) {
        this.profileService = profileService;
    }

    public void runProfileService() {
        profileService.Something();
    }

    public void Test() {
        System.out.println("test method");
        profileService.asyncMethod();
    }
}
