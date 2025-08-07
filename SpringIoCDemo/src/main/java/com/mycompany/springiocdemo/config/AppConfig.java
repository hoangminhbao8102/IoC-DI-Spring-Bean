/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springiocdemo.config;

import com.mycompany.springiocdemo.service.LecturerService;
import com.mycompany.springiocdemo.service.LecturerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author 20113
 */
@Configuration
public class AppConfig {

    // Tạo và đăng ký một Spring Bean thủ công
    @Bean
    public LecturerService lecturerService() {
        return new LecturerServiceImpl();
    }

    // Bạn có thể thêm các bean khác nếu muốn (ví dụ bean cấu hình, formatter...)
}
