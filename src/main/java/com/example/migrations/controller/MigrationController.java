package com.example.migrations.controller;

import com.example.migrations.service.MigrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@AllArgsConstructor
public class MigrationController {
    final MigrationService migrationService;


    @GetMapping("/products/fetch-product")
    public List<String> fetchProduct(@RequestParam(value = "name", required = false) String name) {
        return migrationService.getProductName(name);
    }
}
