package com.example.yeni_baslangic_eylul.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tblcihaz")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cihaz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String firma;
    String marka;
    String model;
    String cinsi;
    String alinantarih;
    String garantibitis;
}
