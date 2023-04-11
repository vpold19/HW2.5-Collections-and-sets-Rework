package com.example.hmcollectionsandsetsrework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeService {
    public static void main(String[] args) {

        List<Integer> employees = new ArrayList<>(Arrays.asList());

        List<Employee> employee = List.of(
                new Employee("Рубен", "Громов"),
                new Employee("Бенедикт", "Ковалёв"),
                new Employee("Вадим", "Полдолин"),
                new Employee("Полдолин", "Осипов"),
                new Employee("Клемент", "Пахомов"),
                new Employee("Ника", "Маркова"),
                new Employee("Нинна", "Кошелева"),
                new Employee("Лили", "Емельянова"),
                new Employee("Дэнна", "Суханова"),
                new Employee("Лунара", "Иванова")
        );
        System.out.println(employee);
    }
}
