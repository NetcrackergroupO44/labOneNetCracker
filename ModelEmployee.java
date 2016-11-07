/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netcracker_o44.lab_1;

/**
 *
 * @author Alex
 */
public class ModelEmployee {
    private String nameEmployee;//Имя работника 
    private String departmentWorkingEmployee;//Отдел, где работает работник
    private int numberTelephoneEmployee;//Номер телефона работника
    private int salaryEmployee;//Зарапотная плата работника
    
    
    
    public ModelEmployee(String nameEmployee, String departmentWorkingEmployee, int numberTelephoneEmployee, int salaryEmployee){
        this.nameEmployee = nameEmployee;
        this.departmentWorkingEmployee = departmentWorkingEmployee;
        this.numberTelephoneEmployee = numberTelephoneEmployee;
        this.salaryEmployee = salaryEmployee;
    }//В данном кнструкторе инициализирует модельь работника
    
    
    public String getNameEmployee(){
        return nameEmployee; 
    }
    
    public String getNameDepatramentWorkingEmployee(){
        return departmentWorkingEmployee; 
    }
    
    public void setNameEmployee(String nameEmployee){
        this.nameEmployee = nameEmployee; 
    }
    
    public void setNameDepatramentWorkingEmployee(String departmentWorkingEmployee){
        this.departmentWorkingEmployee = departmentWorkingEmployee; 
    }
    
    public int getNumberTelephoneEmployee(){
        return numberTelephoneEmployee;
    }
    
    public int getSalaryEmployee(){
        return salaryEmployee;
    }
    
    public void setNumberTelephoneEmployee(int numberTelephoneEmployee){
        this.numberTelephoneEmployee = numberTelephoneEmployee; 
    }
    
    public void setSalaryEmployee(int salaryEmployee){
        this.salaryEmployee = salaryEmployee; 
    }
    
}
