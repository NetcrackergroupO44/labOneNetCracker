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
public class ModelDepartament {
    private String nameDepartament;// Имя департамента
    private String nameDirector;// Имя директора
    private MyArrayList ListEmployee;
    
    public ModelDepartament(String nameDepartament, String nameDirector){
       this.nameDepartament = nameDepartament;
       this.nameDirector = nameDirector;
       ListEmployee = new MyArrayList();
    }//В данной модели инициализируется модель отдела
    
    public ModelDepartament(String nameDepartament, String nameDirector, ModelEmployee[] massiveEmployee){
        
        this.nameDepartament = nameDepartament;
        this.nameDirector = nameDirector;
        ListEmployee = new MyArrayList(massiveEmployee.length, massiveEmployee);
              
    }
    
    public String getNameDepartament(){
        return nameDepartament; 
    }
    
    public String getNameDirector(){
        return nameDirector; 
    }
    
    public void setNameDepartament(String nameDepartament){
        this.nameDepartament = nameDepartament; 
    }
    
    public void setNameDirector(String nameDirector){
        this.nameDirector = nameDirector; 
    }
    
    public MyArrayList getList(){
        return ListEmployee; 
    }
    
    public void getListNameEmployee(){
        ListEmployee.getListNodeNameEmployee();
    }
    
    public void getListNameDepatramentOfWorkingEmployee(){
        ListEmployee.getListNodeNameDepatramentOfWorkingEmployee();
    }
    
    public void getListNumberTelephoneEmploye(){
        ListEmployee.getListNodeNumberTelephoneEmployee();
    }
    
    public void getListSalaryEmployee(){
        ListEmployee.getNodeListSalaryEmployee();
    }
    
    public int getEmployeeTelephone(int value){
        return ListEmployee.getNodeEmployee(value).getNumberTelephoneEmployee();
    }
    
    public int getEmployeeSalary(int value){
        return ListEmployee.getNodeEmployee(value).getSalaryEmployee();
    }
    
    public String getEmployeeWorkDepartament(int value){
        return ListEmployee.getNodeEmployee(value).getNameDepatramentWorkingEmployee();
    }
    
    public String getEmployeeName(int value){
        return ListEmployee.getNodeEmployee(value).getNameEmployee();
    }
    
    public ModelEmployee getEmployee(int value){
        return ListEmployee.getNodeEmployee(value);
    }
    
    public void setEmployeeWorkDepartament(int value, String nameDepartament){
        ListEmployee.getNodeEmployee(value).setNameDepatramentWorkingEmployee(nameDepartament);
    }
    
    public void setEmployeeTelephone(int value, int telephoneEmployee){
        ListEmployee.getNodeEmployee(value).setNumberTelephoneEmployee(telephoneEmployee);
    }
    
    
    
    public void pushEmployee(ModelEmployee employee){
        ListEmployee.push(employee);
    }
    
    public void popEmployee(){
        ListEmployee.pop();
    }
    
    public void setEmployee(int value, ModelEmployee employee){
        ListEmployee.setNodeEmployee(value, employee);
    }
    
    public void removeEmployee(int value){
        ListEmployee.removeNodeEmployee(value);
    }
    
    public int getSize(){
       return ListEmployee.size;
    }

    MyArrayList getListControll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         
    public  class Node {
        ModelEmployee element;
        Node next;
        
    
        public Node(ModelEmployee element, Node next){
            this.element = element;
            this.next = next;
        }  
    }  
    
    public  class MyArrayList{
        int size;
        Node head;

        public MyArrayList(int size, ModelEmployee[] massiveEmploye) {
            this.size = size;
            head = new Node(null,null);
            Node temp = head;
            for(int iteration = 0; iteration < size; iteration++){
                temp.next = new Node(massiveEmploye[iteration], null);
                temp = temp.next;
            }
            
        }
        
        public MyArrayList() {
            head = new Node(null,null);
            size = 1;  
        }
        
        
        public void getListNodeNameEmployee(){
            Node temp = head;
            for(int i = 0; i < size;i++){
                System.out.print(temp.next.element.getNameEmployee()+" ");
                temp = temp.next;
            }
            System.out.println();
        } 
        
        public void getListNodeNameDepatramentOfWorkingEmployee(){
            Node temp = head;
            for(int i = 0; i < size;i++){
                System.out.print(temp.next.element.getNameDepatramentWorkingEmployee()+" ");
                temp = temp.next;
            }
            System.out.println();
        } 
        
        public void getListNodeNumberTelephoneEmployee(){
            Node temp = head;
            for(int i = 0; i < size;i++){
                System.out.print(temp.next.element.getNumberTelephoneEmployee()+" ");
                temp = temp.next;
            }
            System.out.println();
        } 
        
        public void getNodeListSalaryEmployee(){
            Node temp = head;
            for(int i = 0; i < size;i++){
                System.out.print(temp.next.element.getSalaryEmployee()+" ");
                temp = temp.next;
            }
            System.out.println();
        } 
        
        
        
        public ModelEmployee getNodeEmployee(int value){
            ModelEmployee temp = null;
            Node temping = null;
            temping = head.next;
            if(size != 0)
            for(int i = 0; i < size;i++){
                temp = temping.element;
                temping = temping.next;
                if(value == i) break;  
            }        
            return temp;
            
        }
        
        public void push(ModelEmployee employe){
            Node temp = head.next;
            Node newNode = new Node(employe,temp);
            head.next = newNode; 
            size++;
        }
        
        public void pop(){
        size--;
        Node temp = head;
        for(int i = 0; i < size;i++){
            temp = temp.next;
        }
        temp.next = null;
        }
        
        public void setNodeEmployee(int value, ModelEmployee employee){
            Node temp = head;
            if(value == 1){
              temp = head.next;
              Node newNode = new Node(employee,temp);
              head.next = newNode;
            }
            if(value > 1 && value < size+1){
              for(int i = 1; i < size+1;i++){
                  if(value == i){
                      Node newNode = new Node(employee,temp.next);
                      temp.next = newNode;
                      break;
                 }
                  temp = temp.next;
              }  
            }
            if(value == size+1){
                int i = 0;
                while(i != size){
                    temp = temp.next;
                    i++;
                }
                Node newNode = new Node(employee, null);
                temp.next = newNode;
            }
                size++;
        }
        
        public void removeNodeEmployee(int value){
            Node temp = head;
            Node rem = null;
            Node temping = head;
            if(value == 1){
              temp = head.next;
              head = temp;
            }
            if(value > 1 && value < size-1){
              for(int i = 0; i < size;i++){
                  
                  if(value == i){
                     temp = temp.next;
                     rem = temp;
                  } else{
                     temp = temp.next;
                  }
              }
              for(int i = 0; i < size-1;i++){
                 
                  if(value == i+1){
                     temping.next = rem;
                     temping = temping.next;
                  } else{
                      temping = temping.next;
                  }
              }
              
            }
            if(value == size-1){
               for(int i = 0; i < size-1;i++){
                   temp = temp.next;
                }
                temp.next = null;
            }
                size--;
        }
        
        
        
        
        
     }
   }
  


