package com.example.hmcollectionsandsetsrework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {
private final EmployeeController employeeController;

    public EmployeeController(EmployeeController employeeController) {
        this.employeeController = employeeController;
    }
    @GetMapping("/Person")
    public String helloEmployee() {
        return "<h1> Добро пожаловать в сервис Работников </h1>";
    }
    @GetMapping(path = "/person/add")
    public String addPerson(@RequestParam("name") String name, @RequestParam("surname") String surname){
        return "";
    }
}
