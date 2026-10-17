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
    public List<Worker> getWorkers() {
        return repository.findAll();
    }

    @PostMapping
    public Worker addWorker(@Valid @RequestBody Worker worker) {
        return repository.save(worker);
    }
}