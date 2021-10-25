/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author HP
 */
@Controller
public class ControladorInicio {
    @GetMapping("/")
    public String inicio(Model model){
        var persona = new persona();
        persona.setNombre("Amaranta");
        persona.setApellido("Buendia");
        persona.setEnero("55");
        persona.setFebrero("85");
        persona.setMarzo("85");
        persona.setTotal("225");
        
        var persona2 = new persona();
        persona2.setNombre("Carlos");
        persona2.setApellido("Pineda");
        persona2.setEnero("200");
        persona2.setFebrero("25");
        persona2.setMarzo("95");
        persona2.setTotal("305");
        
        var persona3 = new persona();
        persona3.setNombre("Jesus");
        persona3.setApellido("Bolero");
        persona3.setEnero("90");
        persona3.setFebrero("300");
        persona3.setMarzo("55");
        persona3.setTotal("445");
        
        var personas = Arrays.asList(persona,persona2,persona3);
        model.addAttribute("personas",personas);
        return "index";
    } 
}
