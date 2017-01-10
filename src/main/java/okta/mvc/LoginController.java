package okta.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	/*
	@Autowired
	MetadataManager mm;


	@RequestMapping("/login")
	public String login(Map<String,Object> model) {
		Set<String> idps = mm.getIDPEntityNames();
		model.put("idps", idps);
		return "login";
	}
	*/
	@RequestMapping("/login")
	public ModelAndView ModelAndView () {

		return new ModelAndView("redirect: /saml/login?disco=true");

	}
}
