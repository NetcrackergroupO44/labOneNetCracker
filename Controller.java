/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netcracker_o44.lab_1;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Controller {
    private ModelDepartament model; 
    private View view; 
    
    public Controller(ModelDepartament model, View view){ 
        this.model = model; 
        this.view = view; 
    } 
    
    
    
    public String getNameDepartamentControll(){
        return model.getNameDepartament();
    }
    
    public String getNameDirectorControll(){
        return model.getNameDirector(); 
    }
    
    public void setNameDepartamentControll(){
        Scanner in = new Scanner(System.in);
        String nameDepartament = in.nextLine();
        model.setNameDepartament(nameDepartament); 
    }
    
    public void setNameDirectorControll(){
        Scanner in = new Scanner(System.in);
        String nameDirector = in.nextLine();
        model.setNameDirector(nameDirector); 
    }
    
    public void getListNameEmployeeControll(){
        model.getListNameEmployee();
    }
    
    public void getListNameDepatramentOfWorkingEmployeeControll(){
       model.getListNameDepatramentOfWorkingEmployee();
    }
    
    public void getListNumberTelephoneEmployeeControll(){
        model.getListNumberTelephoneEmploye();
    }
    
    public void getListSalaryEmployeeControll(){
        model.getListSalaryEmployee();
    }
    
    public ModelEmployee getEmployeeControll(){
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        return model.getEmployee(value);
    }
    
    public void setEmployeeWorkDepartamentControll(){
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        String nameDepartament = in.nextLine();
        model.getEmployee(value).setNameDepatramentWorkingEmployee(nameDepartament);
    }
    
    public void setEmployeeTelephoneControll(){
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        int telephoneEmployee = in.nextInt();
        model.getEmployee(value).setNumberTelephoneEmployee(telephoneEmployee);
    }
    
    public void pushEmployeeControll(){
        model.pushEmployee(inPutEmployee());
    }
    
    public void popEmployeeControll(){
        model.popEmployee();
    }
    
    public void setEmployeeControll(){
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        model.setEmployee(value, inPutEmployee());
    }
    
    public void removeEmployeeControll(){
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        model.removeEmployee(value);
    }
    
    public static ModelEmployee inPutEmployee(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя : ");
        String name = in.nextLine();
        System.out.println();
        System.out.print("Введите в каком отделе работает сотрудник : ");
        String dep = in.nextLine();
        System.out.println();
        System.out.print("Введите номер телефона сотрудника  : ");
        int telephone = in.nextInt();
        System.out.println();
        System.out.print("Введите зарплату сотрудника сотрудника  : ");
        int salary = in.nextInt();
        return new ModelEmployee(name, dep, telephone, salary);
    }
    
   
    
    public static ModelDepartament departamentEmployee(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя директора : ");
        String nameDirect = in.nextLine();
        System.out.println();
        System.out.print("Введите имя отдела : ");
        String depName = in.nextLine();
        System.out.println();
        System.out.print("Сколько добавить сотрудников в "+depName+" : ");
        int value = in.nextInt();
        System.out.println();
        ModelDepartament mod = new ModelDepartament(depName, nameDirect);
        
        for(int i  = 0; i < value;i++){
            ModelEmployee newEmp = inPutEmployee();
            mod.pushEmployee(newEmp);
          }
        return mod;
    }
    
    public ModelEmployee searchEmployeeByName(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя : ");
        String name = in.nextLine();
        System.out.println();
        ModelEmployee emp = null;
        for(int i = 0; i < model.getSize();i++){
            if(model.getEmployeeName(i).equals(name))
                emp = model.getEmployee(i);  
        }
        return emp;
    }
    
    public ModelEmployee searchEmployeeByTelephone(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите телефон работника : ");
        int tel = in.nextInt();
        System.out.println();
        ModelEmployee emp = null;
        for(int i = 0; i < model.getSize();i++){
            if(model.getEmployeeTelephone(i) == tel)
                emp = model.getEmployee(i);  
        }
        return emp;
    }
    
    public ModelEmployee searchEmployeeBySalary(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите зарплату работника : ");
        int sal = in.nextInt();
        System.out.println();
        ModelEmployee emp = null;
        for(int i = 0; i < model.getSize();i++){
            if(model.getEmployeeSalary(i) == sal)
                emp = model.getEmployee(i);  
        }
        return emp;
    }
    
    public ModelEmployee searchEmployeeByWorkingDepartament(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя отдела работника : ");
        String nameDep = in.nextLine();
        System.out.println();
        ModelEmployee emp = null;
        for(int i = 0; i < model.getSize();i++){
            if(model.getEmployeeWorkDepartament(i).equals(nameDep))
                emp = model.getEmployee(i);  
        }
        return emp;
    }
    
    
    
}
