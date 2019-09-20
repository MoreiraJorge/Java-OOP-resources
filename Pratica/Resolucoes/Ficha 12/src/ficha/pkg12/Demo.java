/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha.pkg12;
import CallsStructure.Manage;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author morei
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manage mn = new Manage();
        
        //Path to the CallsData file
        String path = "C:" + File.separator + "GitRepos" + File.separator + "Paradigmas" + File.separator + "Pratica"+ File.separator + "Resolucoes" + File.separator + "Ficha 12" + File.separator + "CallsData.csv"; 
        
        try {
            mn.LoadInfoToArray(path);
            
        } catch (IOException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("");
        System.out.println("");
        
        
        
        
    }
    
}
