package okta.mvc;

import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Service;

/**
 * Created by fcastillo on 1/10/2017.
 */
@Service
public final class AuthSuccessHandler implements ApplicationListener<AuthenticationSuccessEvent> {

    /** **/
    @Override
    public void onApplicationEvent(AuthenticationSuccessEvent event)
    {
        System.out.println("\n\n\n >>>>>>>>>>>>>>>>>>>> \n\n " + event.getAuthentication() +
                "\n\n<<<<<<<<<<<<<<<<<<<<<<\n\n\n\n");
    }
}
