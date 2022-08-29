package com.example.resume.init;

import com.example.resume.service.InfoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitDB implements CommandLineRunner {

    private final InfoService infoService;

    public InitDB(InfoService infoService) {
        this.infoService = infoService;
    }

    @Override
    public void run(String... args) throws Exception {

        infoService.init();
    }
}
