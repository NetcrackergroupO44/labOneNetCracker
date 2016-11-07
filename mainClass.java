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
public class mainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelEmployee emp1 = new ModelEmployee("Jame", "NetCracker", 777555, 2000);
        ModelEmployee emp2 = new ModelEmployee("Alex", "NetCracker", 113423, 1500);
        ModelEmployee emp3 = new ModelEmployee("Bob", "NetCracker", 53321, 1000);
        
        ModelEmployee[] mass = new ModelEmployee[]{emp1,emp2,emp3};
        
        ModelDepartament List = new ModelDepartament("NetCarakcer","Vitalii", mass);
        
        List.pushEmployee(new ModelEmployee("Gean", "Netracker", 232132, 3500));
//        List.getListNameEmployee();
        List.popEmployee();
//        List.getListNameEmployee();
        List.setEmployee(2, new ModelEmployee("Redclif","Hollywood",2343234,50000));
        List.setEmployee(4, new ModelEmployee("Gared","Hollywood",211134,1000));
        List.setEmployee(3, new ModelEmployee("Dady","Hollywood",27556,3000));
        List.getListNameEmployee();
        
        List.removeEmployee(2);
        
        List.getListNameEmployee();
    }
    
    
            
        }
