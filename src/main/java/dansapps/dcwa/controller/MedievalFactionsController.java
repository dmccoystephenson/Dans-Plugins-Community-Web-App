package dansapps.dcwa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MedievalFactionsController {

    @RequestMapping(value = "/mf")
    public ModelAndView mf() { // TODO: fix this not redirecting
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("medievalfactions");
        return modelAndView;
    }
}