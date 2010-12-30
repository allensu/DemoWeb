package tw.com.demo;

import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import tw.com.demo.pojo.UserT;
import tw.com.demo.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@Autowired
	private UserService userService;
	
	@RequestMapping("/user")
	public String userView(Map<String, Object> map) {
		map.put("user", new UserT());
		map.put("userList", userService.getUserTAll());
		
		return "user";
	}
	
	@RequestMapping(value = "/user/add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") UserT user, BindingResult result)
	{
		userService.addUser(user);
		
		return "redirect:/control/user";
	}
	
//	/**
//	 * Simply selects the home view to render by returning its name.
//	 */
//	@RequestMapping(value = "/home")
//	public ModelAndView home() {
//		logger.info("Welcome home!");
//		return new ModelAndView("home", "message", "Spring MVC Demo");
//	}
//
//	@RequestMapping(value = "/time", method = RequestMethod.GET)
//	public @ResponseBody
//	String getTime(@RequestParam String name) {
//		String result = "Time for " + name + " is " + new Date().toString();
//		return result;
//	}
}
