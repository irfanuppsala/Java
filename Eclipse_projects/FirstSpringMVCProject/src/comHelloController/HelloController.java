package comHelloController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HelloController{

	@RequestMapping("/welcome")
	protected ModelAndView helloWorld() {
        
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hello world");
		return model;
		//String message = "My First SpringMVC Program ";
        //return new ModelAndView("hello","message",message);
    }
}

	/*@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
		HttpServletResponse response) throws Exception{
		
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Hi user, welcome to the first Spring MVC Application");
		
		return modelandview;
	}*/

