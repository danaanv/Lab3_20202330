package com.example.lab3.controllers;

import com.example.lab3.entity.Paciente;
import com.example.lab3.repository.PacienteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class PacienteController {

    final PacienteRepository pacienteRepository;

    public PacienteController(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @GetMapping("/paciente")
    public String mostrarPaciente(@RequestParam("id") int id, Model model){

        Optional<Paciente> pacienteOptional = pacienteRepository.findById(id);
        if (pacienteOptional.isPresent()) {
            Paciente paciente = pacienteOptional.get();
            model.addAttribute("paciente", paciente);
            return "mostrar_pacientes";
        } else {
            return "principal";
        }
    }
}
