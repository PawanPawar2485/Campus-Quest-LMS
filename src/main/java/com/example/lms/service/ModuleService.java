package com.example.lms.service;

import com.example.lms.entity.Module;
import com.example.lms.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;

    public List<Module> getModulesByCourse(Long courseId) {
        return moduleRepository.findByCourseId(courseId);
    }

    public Module saveModule(Module module) {
        return moduleRepository.save(module);
    }

    public Optional<Module> getModuleById(Long id) {
        return moduleRepository.findById(id);
    }

    public void deleteModule(Long id) {
        moduleRepository.deleteById(id);
    }
}
