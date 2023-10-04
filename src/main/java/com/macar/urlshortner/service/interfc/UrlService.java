package com.macar.urlshortner.service.interfc;

import java.util.List;

import com.macar.urlshortner.model.Url;

public interface UrlService {
    Url save(Url url);

    String getLongUrl(String shortUlr);

    List<Url> getAll();
}
