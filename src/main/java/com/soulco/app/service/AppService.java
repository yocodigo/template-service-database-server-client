package com.soulco.app.service;


import com.soulco.app.domain.AppEntity;
import com.soulco.app.repository.AppRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {

    private final AppRepository appRepository;

    public AppService(AppRepository appRepository) {
        this.appRepository = appRepository;
    }

    public List<AppEntity> getItems(Integer userId) {

        return appRepository.findByEmailAddress(userId);
    }
}
