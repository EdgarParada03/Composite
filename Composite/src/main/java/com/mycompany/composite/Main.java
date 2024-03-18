/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.composite;

/**
 *
 * @author edgar
 */
public class Main {

    public static void main(String[] args) {
        CarsCompany carsCompany = new CompanySection("Cars Company");

        CarsCompany productionEmployees = new CompanySection("Production Employees");
        CarsCompany salesEmployees = new CompanySection("Sales Employees"); 
        CarsCompany distributionStores = new CompanySection("Distribution Store");
        CarsCompany mainStore = new CompanySection("Main Store");
        
        CarsCompany employeeP1 = new Employee("Production Employee 1");
        CarsCompany employeeS1 = new Employee("Sales Employee 1"); 
        CarsCompany employeeS2 = new Employee("Sales Employee 2");
        CarsCompany employeeMS1 = new Employee("Main Store Employee 1");
        CarsCompany employeeMS2 = new Employee("Main Store Employee 2"); 
        CarsCompany employeeMS3 = new Employee("Main Store Employee 3");
        CarsCompany employeeMS4 = new Employee("Main Store Employee 4");
        
        carsCompany.addSection(productionEmployees);
        carsCompany.addSection(salesEmployees);
        carsCompany.addSection(distributionStores);
        distributionStores.addSection(mainStore);
        
        productionEmployees.addSection(employeeP1);
        salesEmployees.addSection(employeeS1);
        salesEmployees.addSection(employeeS2);
        mainStore.addSection(employeeMS1);
        mainStore.addSection(employeeMS2);
        mainStore.addSection(employeeMS3);
        mainStore.addSection(employeeMS4);
        
        carsCompany.generateHierarchy();

    }
}
