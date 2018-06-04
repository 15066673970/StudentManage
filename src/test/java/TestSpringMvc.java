import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quanlian.services.UserService;

@Controller
public class TestSpringMvc {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/test1")
	public String  test1(){
		return "redirect:http://www.baidu.com";
	}
	
}
