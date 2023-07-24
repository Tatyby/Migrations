package com.example.migrations.service;

import com.example.migrations.repository.MigrationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MigrationService {
    private final MigrationRepository migrationRepository;
    public List<String> getProductName(String name) {
        return migrationRepository.getProductName(name);
    }
}
