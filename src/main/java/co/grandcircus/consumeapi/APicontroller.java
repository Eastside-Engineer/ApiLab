package co.grandcircus.consumeapi;



import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.consumeapi.model.complete;
import co.grandcircus.consumeapi.model.tiny;



@Controller
public class APicontroller {
	@Autowired
	ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView showHome() {
		List<tiny> tinyList = apiService.printTinyList();
		
		return new ModelAndView("index", "tiny", tinyList);
	}
	@RequestMapping("/whole-list")
	public ModelAndView showCompleteList() {
		List<complete> completeList = apiService.printCompleteList();
		Collections.sort(completeList);
		return new ModelAndView("complete-list", "complete", completeList);
	}
}
