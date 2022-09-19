package com.example.yeni_baslangic_eylul.mvcController;


import com.example.yeni_baslangic_eylul.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginPage {

    private final LoginService loginService;;

    public LoginPage(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping
    public ModelAndView loginPage(){
        ModelAndView model = new ModelAndView();
        model.setViewName("login");
        return model;
    }
    @PostMapping
    public ModelAndView isLogin(String username, String password){
        boolean isLogin = loginService.isPassword(username, password) ;
        ModelAndView model = new ModelAndView();
        if (isLogin) {
            model.setViewName("homepage");
        } else {
            model.addObject("kullanicibulunamadi","Kullanici adı veya şifresi yanlıştır");
            model.setViewName("login");
        }
        return model;
    }
}
