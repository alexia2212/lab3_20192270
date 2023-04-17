package com.example.lab3_20192270.controller;

import com.example.lab3_20192270.entity.DoctoresEntity;
import com.example.lab3_20192270.repository.DoctorRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/doctor")

public class DoctorController {
    final DoctorRepository doctorRepository;

    public DoctorController(DoctorRepository doctorRepository){
        this.doctorRepository = doctorRepository;
    }


}
