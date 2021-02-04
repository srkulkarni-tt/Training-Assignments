package com.thinkitive;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Trial {
	@Autowired
	Calculator Calculator;

	@RequestMapping(value = "handle", method = RequestMethod.GET) // Whenever a request in JSP file with action="handle"
																	// occurs, this method will
	// be called
	public String rootGet(HttpServletRequest request) {
		String yourname = request.getParameter("yourname");
		request.setAttribute("name", yourname);
		return "yourname.jsp";
	}

//	@RequestMapping(value = "login", method = RequestMethod.POST)
//	public ModelAndView rootPost(HttpServletRequest request) {
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		
//		ModelAndView model = new ModelAndView();
//		model.addObject("username", username);
//		model.addObject("password", password);
//		model.setViewName("yourname.jsp");
//
//		return model;
//	}

	/* Alternative to the above style */
//	@RequestMapping(value = "login", method = RequestMethod.POST)
//	public ModelAndView rootPost(String username, String password) {
//		
//		ModelAndView model = new ModelAndView();
//		model.addObject("username", username);
//		model.addObject("password", password);
//		model.setViewName("yourname.jsp");
//
//		return model;
//	}

	/* Validation */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView rootPost(String username, String password) {

		ModelAndView model = new ModelAndView();

		if (username.equals("root") && password.equals("root")) {
			model.addObject("username", username);
			model.addObject("password", password);
			model.setViewName("yourname.jsp");
			return model;

		} else {
			model.addObject("errorMsg", "Invalid username or password");
			model.setViewName("index.jsp");
			return model;
		}
	}

	@RequestMapping(value = "calculate")
	public ModelAndView calculation(String operation, String firstNum, String secondNum) {
		ModelAndView model = new ModelAndView();
		int a = Integer.parseInt(firstNum);
		int b = Integer.parseInt(secondNum);

		if (operation.equals("add")) {
			model.addObject("ans", Calculator.add(a, b));
			model.setViewName("calculator.jsp");
			return model;
		} else if (operation.equals("sub")) {
			model.addObject("ans", Calculator.sub(a, b));
			model.setViewName("calculator.jsp");
			return model;
		}
		if (operation.equals("mul")) {
			model.addObject("ans", Calculator.mul(a, b));
			model.setViewName("calculator.jsp");
			return model;
		} else {
			model.addObject("ans", Calculator.div(a, b));
			model.setViewName("calculator.jsp");
			return model;
		}

	}
}
