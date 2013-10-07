package webflow;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainFlow {
	private static Logger logger = Logger.getLogger(MainFlow.class);
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public List<Model> testz(){
		System.out.print("test");
		logger.debug("hello flow");
		List<Model> models =  new ArrayList<Model>();
		models.add(new Model("1","test"));
		models.add(new Model("2","see you "));
		return models;
		
	}
}
