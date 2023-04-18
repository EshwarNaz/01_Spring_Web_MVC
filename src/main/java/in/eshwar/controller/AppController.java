package in.eshwar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	@GetMapping("/morning")
	public ModelAndView greetMessege() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Good morning");
		mav.setViewName("index");
		return mav;
	}

	@GetMapping("/night")
	public ModelAndView greetMessege1() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Good night");
		mav.setViewName("index");
		return mav;
	}
}
