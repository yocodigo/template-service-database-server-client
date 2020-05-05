package com.soulco.app.controller;

import com.soulco.app.domain.AppEntity;
import com.soulco.app.service.AppService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class AppController {

    private final AppService appService;

    public AppController(AppService appService) {
        this.appService = appService;
    }

    @RequestMapping(path = "/")
    public List<AppEntity> getUserData() {

        return appService.getItems(3);
    }

}
