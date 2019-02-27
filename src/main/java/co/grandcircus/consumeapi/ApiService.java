package co.grandcircus.consumeapi;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

public class ApiService {
	// If you don't need the User-Agent hack, all you need is this.
	private RestTemplate restTemplate = new RestTemplate();

	
}
