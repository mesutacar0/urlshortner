package com.macar.urlshortner.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.macar.urlshortner.model.Url;
import com.macar.urlshortner.service.interfc.UrlService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/url")
public class UrlController {

    @Autowired
    UrlService urlService;

    @GetMapping(value = "/hello")
    public String getMethodName() {
        return "Hello World!";
    }

    @GetMapping
    public ResponseEntity<List<Url>> getAll() {
        return new ResponseEntity<>(urlService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Url> create(@RequestBody Url url) {
        return new ResponseEntity<>(urlService.save(url), HttpStatus.CREATED);
    }
}
