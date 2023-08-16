package org.ansel.cryptotrading.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import aj.org.objectweb.asm.TypeReference;

import java.io.IOException;
import java.util.List;

import org.ansel.cryptotrading.entity.CryptoCurrency;
import org.ansel.cryptotrading.repository.CryptoCurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;

@Service
public class CryptoCurrencyService {

    @Autowired
    private CryptoCurrencyRepository cryptoCurrencyRepository;

    @Scheduled(fixedRate = 10000)
    public void fetchDataFromUrlAndSaveToDatabase(String url) {
        RestTemplate restTemplate = new RestTemplate();

        try {
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
            String jsonResponse = response.getBody();

            ObjectMapper objectMapper = new ObjectMapper();
            List<CryptoCurrency> cryptoCurrencies = objectMapper.readValue(jsonResponse, new TypeReference<List<CryptoCurrency>>() {});

            cryptoCurrencyRepository.saveAll(cryptoCurrencies);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
