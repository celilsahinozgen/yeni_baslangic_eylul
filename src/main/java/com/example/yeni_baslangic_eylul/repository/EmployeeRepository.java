package com.example.yeni_baslangic_eylul.repository;


import com.example.yeni_baslangic_eylul.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

   Employee findByUsernameAndPassword(String username,String password);
}
