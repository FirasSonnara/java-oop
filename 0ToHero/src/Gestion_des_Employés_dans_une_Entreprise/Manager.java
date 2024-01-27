package Gestion_des_Employés_dans_une_Entreprise;

public class Manager extends Employee {
    private double bonus;
    public Manager(int id, String name, double baseSalary, double bonus){
        super(id, name, baseSalary);
        this.bonus = bonus ;    
    }
    @Override
    public double calculateSalary(){
        return super.calculateSalary() + bonus;
    }
}
