package Gestion_des_Employés_dans_une_Entreprise;

//abstract class can't be initialised in main
public class Employee {
    public int id;
    public String name;
    public double baseSalary;
    
    public Employee(int id, String name, double baseSalary){
        this.id = id ;
        this.name = name ;
        this.baseSalary = baseSalary ;
        
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double calculateSalary(){
            return baseSalary;
    }
}
