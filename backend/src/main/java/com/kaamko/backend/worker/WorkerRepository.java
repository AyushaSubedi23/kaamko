package com.kaamko.backend.worker;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkerRepository extends JpaRepository<Worker,Long> {
       List<Worker> findBySkillIgnoreCase(String skill);
}
