package com.example.lab3.controllers;

import com.example.lab3.entity.Doctor;
import com.example.lab3.repository.DoctorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class DoctorController {

    final DoctorRepository doctorRepository;

    public DoctorController(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @GetMapping("/doctor")
    public String mostrarDoctores(@RequestParam("id") int id, Model model){

        Optional<Doctor> doctorOptional = doctorRepository.findById(id);
        if (doctorOptional.isPresent()) {
            Doctor doctor = doctorOptional.get();
            model.addAttribute("doctor", doctor);
            return "mostrar_doctores";
        } else {
            return "principal";
        }
    }
}
