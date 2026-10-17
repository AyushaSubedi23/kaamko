package com.kaamko.backend.worker;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String skill;

    @Positive
    private int pricePerHour;

    protected Worker() {
    }

    public Worker(String name, String skill, int pricePerHour) {
        this.name = name;
        this.skill = skill;
        this.pricePerHour = pricePerHour;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getSkill() { return skill; }
    public int getPricePerHour() { return pricePerHour; }

    public void setName(String name) { this.name = name; }
    public void setSkill(String skill) { this.skill = skill; }
    public void setPricePerHour(int pricePerHour) { this.pricePerHour = pricePerHour; }
}