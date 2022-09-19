package com.example.yeni_baslangic_eylul.mvcController;


import com.example.yeni_baslangic_eylul.entity.Employee;
import com.example.yeni_baslangic_eylul.service.RegisterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("register")
public class RegisterPage {

    private final RegisterService registerService;

    public RegisterPage(RegisterService registerService){
        this.registerService =registerService;
    }

    @GetMapping
    public ModelAndView registerPage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("register");
        return model;
    }
    @PostMapping
    public ModelAndView saveEmployee(String name,String lastname,String username,String mail,String password){
        ModelAndView model= new ModelAndView();
        model.setViewName("register");
        registerService.save(Employee.builder()
                        .name(name)
                        .lastname(lastname)
                        .username(username)
                        .mail(mail)

                        .password(password).build());
        return model;

    }


}
