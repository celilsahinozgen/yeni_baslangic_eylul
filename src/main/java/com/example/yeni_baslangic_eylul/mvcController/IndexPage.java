package com.example.yeni_baslangic_eylul.mvcController;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static com.example.yeni_baslangic_eylul.constants.RestApiUrls.VERSION;

@Controller
@RequestMapping("/index")
public class IndexPage {

    @GetMapping()
    public ModelAndView indexPage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        return model;
    }

}
