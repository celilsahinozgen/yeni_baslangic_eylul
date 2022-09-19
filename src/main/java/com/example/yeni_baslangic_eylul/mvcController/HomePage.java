package com.example.yeni_baslangic_eylul.mvcController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("homepage")
public class HomePage {


    @GetMapping
    public ModelAndView homePage() {
        ModelAndView model= new ModelAndView();
        model.setViewName("homepage");
        return model;
    }
}
