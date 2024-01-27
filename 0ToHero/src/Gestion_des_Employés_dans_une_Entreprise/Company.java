package Gestion_des_Employés_dans_une_Entreprise;

import java.util.ArrayList;
import java.util.List;

public class Company {
    List<Employee> listEmployee = new ArrayList<>();
    
    public void ajouterNouvelEmployee(Employee emp){
        if(!listEmployee.contains(emp)){
            listEmployee.add(emp);
            System.out.println("Donner le nom : "+emp.getName());
        } else {
                    System.out.println("Employee existant");
            }            
        }
   
            
    
    public void afficherListeEmployee(){
        System.out.println("Liste des Employés:");
        for (Employee employee : listEmployee)
            System.out.println("Nom: " + employee.getName() + ", Salaire: " + employee.calculateSalary());
    }
    
    public double massSalaire(){
       if (listEmployee.isEmpty()){
           System.out.println("entreprise vide");
           return 0.0;
       }
         
       double salaireTotale = 0.0 ;
       for (Employee employee : listEmployee){
           salaireTotale += employee.calculateSalary();
       }
       return (salaireTotale/listEmployee.size());
    }
    
}
