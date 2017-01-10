package okta.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fcastillo on 1/10/2017.
 */
@Controller
public class TestResponse {

    @RequestMapping(value = "/blanco")
    public String getBlanco(){
        return "Blanco lalala!";
    }
}
