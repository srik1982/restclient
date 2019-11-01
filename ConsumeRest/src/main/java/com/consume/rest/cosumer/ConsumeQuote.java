package com.consume.rest.cosumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ConsumeQuote implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		System.out.println(quote);

	}

}
