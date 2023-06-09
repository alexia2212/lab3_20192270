package com.example.lab3_20192270.controller;

import com.example.lab3_20192270.entity.DoctoresEntity;
import com.example.lab3_20192270.entity.HospitalEntity;
import com.example.lab3_20192270.repository.HospitalRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/hospital")
public class HospitalController {

    final HospitalRepository hospitalRepository;

    public HospitalController(HospitalRepository hospitalRepository){
        this.hospitalRepository = hospitalRepository;
    }



    @GetMapping(value = {"listahospitales", ""})
    public String listarHospitales(Model model){
        List<HospitalEntity> lista = hospitalRepository.findAll();
        model.addAttribute("listahospitales", lista);
        return "index";
    }


}
