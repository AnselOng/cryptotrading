package org.ansel.cryptotrading;

import org.ansel.cryptotrading.service.CryptoCurrencyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CryptotradingApplication {

	public static void main(String[] args) {
		// Fetch JSON data from first URL and save to the database
		CryptoCurrencyService cryptoCurrencyService = SpringApplication.run(CryptotradingApplication.class, args).getBean(CryptoCurrencyService.class);
        cryptoCurrencyService.fetchDataFromUrlAndSaveToDatabase("https://api.binance.com/api/v3/ticker/bookTicker");
		cryptoCurrencyService.fetchDataFromUrlAndSaveToDatabase("https://api.huobi.pro/market/tickers");

		SpringApplication.run(CryptotradingApplication.class, args);
	}

}
