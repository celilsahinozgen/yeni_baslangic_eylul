package com.example.yeni_baslangic_eylul.service;


import com.example.yeni_baslangic_eylul.entity.Employee;
import com.example.yeni_baslangic_eylul.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final EmployeeRepository employeeRepository;

    public LoginService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public boolean isPassword(String username,String password) {
        Employee user= employeeRepository.findByUsernameAndPassword(username,password);
        if (user == null){
            return false;
        } else {
            return true;
        }
    }

}
