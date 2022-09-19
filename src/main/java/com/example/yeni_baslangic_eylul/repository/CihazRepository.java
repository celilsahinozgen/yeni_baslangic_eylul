package com.example.yeni_baslangic_eylul.repository;


import com.example.yeni_baslangic_eylul.entity.Cihaz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CihazRepository extends JpaRepository<Cihaz, Long> {


}
