package com.example.lab3.controllers;

import com.example.lab3.repository.HospitalRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HospitalController {

    final HospitalRepository hospitalRepository;

    public HospitalController(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @GetMapping("/principal")
    public String listar(Model model){

        model.addAttribute("lista_hospitales",hospitalRepository.findAll());
        return "principal";
    }

}
