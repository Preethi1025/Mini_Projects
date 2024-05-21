/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.projects;

/**
 *
 * @author preet
 */
import java.util.*;
import java.lang.*;
public class MiniProjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        //Password Generator
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";
        String special="<>.,/?'|!@#$%^&*()-+=";
        String combination=upper+lower+special+num;
        int length=8;
        char[] password=new char[length];
        Random r=new Random();
        for(int i=0;i<length;i++){
            password[i]=combination.charAt(r.nextInt(combination.length()));
        }
        System.out.println("Generated password is:"+new String(password));
        
    }
    
}
