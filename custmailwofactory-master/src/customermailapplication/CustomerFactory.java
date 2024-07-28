/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customermailapplication;

/**
 *
 * @author LEGION
 */
public class CustomerFactory {
     public static Customer createCustomer(String type) {
        switch (type) { 
            case "Delinquent":
                return new DelinquentCustomer();
            case "Mountain":
                return new MountainCustomer();
            case "Regular":
                return new RegularCustomer();
            default:
                break;
        }
        return null;        
    }
}
