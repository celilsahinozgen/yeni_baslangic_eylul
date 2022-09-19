package com.example.yeni_baslangic_eylul.service;


import com.example.yeni_baslangic_eylul.entity.Cihaz;
import com.example.yeni_baslangic_eylul.repository.CihazRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CihazService {

    private final CihazRepository cihazRepository;



        public Cihaz save(Cihaz cihaz) {
            return cihazRepository.save(cihaz);
        }

        public Cihaz update(Cihaz cihaz) {
            return cihazRepository.save(cihaz);
        }
    public boolean delete(Cihaz cihaz){
        try {
            cihazRepository.delete(cihaz);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

        public List<Cihaz> findAll(){
            return cihazRepository.findAll();
        }

        public Optional<Cihaz> findById(Long id){
            return cihazRepository.findById(id);
        }









}
