package com.kaamko.backend.worker;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerController {

    private final WorkerRepository repository;

    public WorkerController(WorkerRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Worker> getWorkers(@RequestParam(required = false) String skill) {
        if (skill == null) {
            return repository.findAll();
        }
        return repository.findBySkillIgnoreCase(skill);
    }

    @PostMapping
    public Worker addWorker(@Valid @RequestBody Worker worker) {
        return repository.save(worker);
    }
}