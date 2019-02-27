package co.grandcircus.consumeapi;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.consumeapi.model.complete;
import co.grandcircus.consumeapi.model.response;
import co.grandcircus.consumeapi.model.tiny;

@Component
public class ApiService {
	// If you don't need the User-Agent hack, all you need is this.
	private RestTemplate restTemplate = new RestTemplate();

	public List<complete> printCompleteList() {
		//List<CompleteList> list = new ArrayList<>();
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		response complete = restTemplate.getForObject(url, response.class);
		return complete.getComplete();
	}

	public List<tiny> printTinyList() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		response tiny = restTemplate.getForObject(url, response.class);
		return tiny.getTiny();
	}
	
}
