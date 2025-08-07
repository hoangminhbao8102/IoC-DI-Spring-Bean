/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springiocdemo.controller;

import com.mycompany.springiocdemo.service.LecturerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author 20113
 */
@Controller
public class LecturerController {

    private final LecturerService lecturerService;

    // DI thông qua constructor
    public LecturerController(LecturerService lecturerService) {
        this.lecturerService = lecturerService;
    }

    @GetMapping("/lecturers")
    public String showLecturers(Model model) {
        model.addAttribute("lecturers", lecturerService.getAllLecturers());
        return "lecturers";
    }
}
