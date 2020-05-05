package com.soulco.app.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "app-client", url = "http://localhost:8082")
public interface AppClient {

    @RequestMapping(value = "/data")// add header here to include ",headers = {"apikey=${service.promotion-details.apiKey}"}, consumes = APPLICATION_JSON_VALUE"
        // make call to fatsecret rest api
    String getDataFromApp2(@RequestParam(value = "id", required = false) int id);
}
