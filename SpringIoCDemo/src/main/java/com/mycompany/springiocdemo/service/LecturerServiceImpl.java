/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springiocdemo.service;

import com.mycompany.springiocdemo.model.Lecturer;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 20113
 */
public class LecturerServiceImpl implements LecturerService {

    @Override
    public List<Lecturer> getAllLecturers() {
        return Arrays.asList(
                new Lecturer("Nguyễn Văn A", "Công nghệ phần mềm"),
                new Lecturer("Trần Thị B", "Khoa học máy tính")
        );
    }
}
