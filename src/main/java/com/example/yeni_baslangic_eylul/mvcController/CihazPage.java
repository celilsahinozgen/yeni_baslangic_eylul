package com.example.yeni_baslangic_eylul.mvcController;


import com.example.yeni_baslangic_eylul.service.CihazService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("cihazlar")
public class CihazPage {

    private final CihazService cihazService;

    public CihazPage(CihazService cihazService) {
        this.cihazService = cihazService;
    }

    @GetMapping
    public ModelAndView cihazPage(){
        ModelAndView model = new ModelAndView();
        model.addObject("cihazbilgileri",cihazService.findAll());
        model.setViewName("cihazlar");
        return model;

    }
}
