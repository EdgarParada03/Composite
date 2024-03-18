/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edgar
 */
public class CompanySection implements CarsCompany{
    //Compuesto
    private String sectionName;
    private List<CarsCompany> employees;
    
    CompanySection(String section){
        sectionName = section;
        employees = new ArrayList<CarsCompany>();
    }
    @Override
    public String getSectionName() {
        return sectionName;
    }

    @Override
    public void addSection(CarsCompany cars) {
        employees.add(cars);
    }

    @Override
    public void generateHierarchy() {
        System.out.println(sectionName);
        for (int i = 0; i < employees.size(); i++) {
            employees.get(i).generateHierarchy();
        }
        System.out.println("/" + sectionName);
    }
    
}
