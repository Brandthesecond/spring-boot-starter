package edu.bls.site.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {

    @RequestMapping("/")
    public ModelAndView doDefault() throws Exception {
        
        
        return new ModelAndView("index");
        
    }
    
}
