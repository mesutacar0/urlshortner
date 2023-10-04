package com.macar.urlshortner.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.macar.urlshortner.model.Url;

@Repository
public interface UrlRepository extends JpaRepository<Url, Long> {
    public Optional<String> findByShortUrl(String shortUrl);
}
