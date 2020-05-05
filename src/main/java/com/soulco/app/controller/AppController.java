package com.soulco.app.controller;

import com.soulco.app.domain.AppEntity;
import com.soulco.app.service.AppService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {

    private final AppService service;
    private final AppService appService;

    public AppController(AppService service, AppService appService) {
        this.service = service;
        this.appService = appService;
    }

    @RequestMapping(path = "/")
    public List<AppEntity> getUserData() {

        return appService.getItems(3);
    }

    @RequestMapping(path = "/data")
    public String testPost() {
//        System.out.println("log is: " + id);
        return service.getDataFromApp2();
    }

}
