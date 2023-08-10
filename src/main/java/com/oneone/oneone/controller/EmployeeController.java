package com.oneone.oneone.controller;
import com.oneone.oneone.model.Employee;
import com.oneone.oneone.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = {"http://localhost:8888", "http://10.0.2.2:8080"})
@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private CommentRepository CommentRepository;
    @PostMapping("/post")
    public ResponseEntity<String> saveEmp(@RequestBody List<Employee> emp){
        CommentRepository.saveAll(emp);
        return ResponseEntity.ok("Success");
    }
    @GetMapping("/get")
    public ResponseEntity<List<Employee>> getdata(){
        return new ResponseEntity<>(CommentRepository.findAll(), HttpStatus.OK);
    }
}
