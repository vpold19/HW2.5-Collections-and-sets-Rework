package com.example.hmcollectionsandsetsrework;

public interface EmpService {
    Employee add(String name, String surname);
    Employee remove(String name, String surname);
    Employee find(String name, String surname);
}
