package in.leadr.leadrapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.leadr.leadrapplication.service.UserService;

@Controller
public class AuthController {
	    @Autowired
	    private UserService userService;

	    
	    @GetMapping("/")
	    public String index() {
	        return "index.jsp";
	    }
	    
	    @GetMapping("/admin")
	    public String sample() {
	        return "admin.jsp";
	    }
	   
	   

	    @PostMapping("/login")
	    public String login(@RequestParam String username, @RequestParam String password) {
//	        User user = userService.findByUsername(username);
//	        if (user != null && user.getPassword().equals(password)) {
	        	if (true) {
	            return "userdashboard.jsp";
	        }
	        return "index.jsp";
	    }
}
