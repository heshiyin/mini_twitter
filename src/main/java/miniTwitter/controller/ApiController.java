package miniTwitter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import miniTwitter.domain.User;
import miniTwitter.service.UserService;



@Controller
public class ApiController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/home")
    public String getdefault() {
        return "OK";
    }
	
	
	@RequestMapping("/user/{userId}")
	    public ResponseEntity<User> getUser(@PathVariable("userId") int userId) {
	       
	        return new ResponseEntity<>(userService.userService(userId), HttpStatus.OK);
	    }

	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    ResponseEntity index() {
       
        return new ResponseEntity<>("this is index page", HttpStatus.OK);
    }
}