/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composite;

/**
 *
 * @author edgar
 */
public interface CarsCompany {
    String getSectionName();
    void addSection(CarsCompany cars);
    void generateHierarchy();
}
