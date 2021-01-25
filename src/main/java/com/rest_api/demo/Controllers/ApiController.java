package com.rest_api.demo.Controllers;

import com.rest_api.demo.Models.Track;
import com.rest_api.demo.Services.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private ApiService apiService;

    @Autowired
    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/get/{author}/{limit}")
    public Track get(@PathVariable String author, @PathVariable int limit) {
        return apiService.getTracksByAuthor(author, limit);
    }


}
