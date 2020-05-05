package com.soulco.app.service;


import com.soulco.app.client.AppClient;
import com.soulco.app.domain.AppEntity;
import com.soulco.app.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {

    private final AppClient appClient;
    private final AppRepository appRepository;

    @Autowired
    public AppService(AppClient appClient, AppRepository appRepository) {
        this.appClient = appClient;
        this.appRepository = appRepository;
    }

    public List<AppEntity> getItems(Integer userId) {

        return appRepository.findByEmailAddress(userId);
    }

    public String getDataFromApp2() {
        System.out.println(appClient.getDataFromApp2(123456));
        return appClient.getDataFromApp2(123456);
    }
}
