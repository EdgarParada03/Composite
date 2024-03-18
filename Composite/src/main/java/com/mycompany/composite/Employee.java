/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composite;

/**
 *
 * @author edgar
 */
public class Employee implements CarsCompany{
    //Hoja
    private String employeeName;
    
    Employee(String employee){
        employeeName = employee;
    }
    
    @Override
    public String getSectionName() {
        return employeeName;
    }

    @Override
    public void addSection(CarsCompany cars) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void generateHierarchy() {
        System.out.println("-Employee: " + employeeName);
    }
    
}
