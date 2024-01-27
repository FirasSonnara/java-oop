package Gestion_des_Employés_dans_une_Entreprise;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Company entreprise = new Company();
        
        // Add employees to the company
        Employee employee1 = new Employee(1,"John Doe", 50000.0);
        Employee employee2 = new Employee(2,"Jane Smith", 45000.0);
        Manager manager1 = new Manager(0,"Alice Johnson", 80000.0, 10000.0);

        entreprise.ajouterNouvelEmployee(employee1);
        entreprise.ajouterNouvelEmployee(employee2);
        entreprise.ajouterNouvelEmployee(manager1);

        // Display the list of employees
        entreprise.afficherListeEmployee();

        // Calculate and display the average salary
        double averageSalary = entreprise.massSalaire();
        System.out.println("Masse Salariale Moyenne: " + averageSalary);
    }
    
}
