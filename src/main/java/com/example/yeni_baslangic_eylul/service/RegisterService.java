package com.example.yeni_baslangic_eylul.service;


import com.example.yeni_baslangic_eylul.entity.Employee;
import com.example.yeni_baslangic_eylul.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    private final EmployeeRepository employeeRepository;

    public RegisterService(EmployeeRepository employeeRepository){
        this.employeeRepository= employeeRepository;
    }

    public Employee save(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

}
