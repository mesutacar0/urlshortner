package com.macar.urlshortner.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macar.urlshortner.model.Url;
import com.macar.urlshortner.repository.UrlRepository;
import com.macar.urlshortner.service.interfc.UrlService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UrlServiceImpl implements UrlService {

    @Autowired
    UrlRepository urlRepository;

    @Override
    public Url save(Url url) {
        return urlRepository.save(url);
    }

    @Override
    public String getLongUrl(String shortUlr) {
        return urlRepository.findByShortUrl(shortUlr).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public List<Url> getAll() {
        return urlRepository.findAll();
    }

}
