package com.example.yeni_baslangic_eylul.mvcController;


import com.example.yeni_baslangic_eylul.entity.Cihaz;
import com.example.yeni_baslangic_eylul.service.CihazService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/cihazekleme")
public class CihazEklemeController {

        private final CihazService cihazService;


    public CihazEklemeController(CihazService cihazService) {
        this.cihazService = cihazService;
    }

    @GetMapping()
    public ModelAndView cihazeklemePage(){
        ModelAndView model= new ModelAndView();
        model.setViewName("cihazekleme");
        return model;
    }



    @PostMapping
    public ModelAndView saveCihaz( String firmabilgisi,
                                    String cihazcinsi,
                                   String  cihazmarka,
                                   String  cihazmodel,
                                   String cihazalimtarihi,
                                   String garantibitis) {

        ModelAndView model= new ModelAndView();
        cihazService.save(Cihaz.builder()
                        .firma(firmabilgisi)
                .cinsi(cihazcinsi)
                .marka(cihazmarka)
                .model(cihazmodel)
                .alinantarih(cihazalimtarihi)
                .garantibitis(garantibitis).build());
        return model;

    }
}
