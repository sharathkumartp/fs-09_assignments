package com.geekster.SB2.controller;

import com.geekster.SB2.model.Doctor;
import com.geekster.SB2.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    // Endpoint to retrieve all doctors
    @GetMapping("/")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    // Endpoint to retrieve a doctor by ID
    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable("id") Long id) {
        return doctorService.getDoctorById(id);
    }

    // Endpoint to create a new doctor
    @PostMapping("/")
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        return doctorService.createDoctor(doctor);
    }

    // Endpoint to update an existing doctor
    @PutMapping("/{id}")
    public Doctor updateDoctor(@PathVariable("id") Long id, @RequestBody Doctor doctor) {
        return doctorService.updateDoctor(id, doctor);
    }

    // Endpoint to delete a doctor by ID
    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable("id") Long id) {
        doctorService.deleteDoctor(id);
    }

    // Endpoint to suggest doctors based on patient's location and symptom
    @GetMapping("/suggested")
    public List<Doctor> suggestDoctorsBySymptom(@RequestParam("city") String city, @RequestParam("symptom") String symptom) {
        return doctorService.getDoctorsByCityAndSpeciality(city, symptom);
    }
}
