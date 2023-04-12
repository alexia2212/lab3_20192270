package com.example.lab3_20192270.controller;


import com.example.lab3_20192270.entity.PacienteEntity;
import com.example.lab3_20192270.repository.PacienteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/paciente")

public class PacienteController {
    final PacienteRepository pacienteRepository;

    public PacienteController(PacienteRepository pacienteRepository){
        this.pacienteRepository = pacienteRepository;
    }



    @GetMapping(value = {"listahospitales", ""})
    public String listarHospitales(Model model){
        List<PacienteEntity> lista = pacienteRepository.findAll();
        model.addAttribute("listahospitales", lista);
        return "index";
    }
}
