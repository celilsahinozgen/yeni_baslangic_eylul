package com.example.yeni_baslangic_eylul.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@Builder
@Data
@Table(name = "tblEmployee")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String lastname;
    String username;
    String mail;
    String password;
    int state;
    /*yetkiyi sonra eklicem
                yetki  superadmin, admin,kullanıcı şeklinde vercem
      */



}
