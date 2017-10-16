/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author MINH HIEU
 */
public class TestgetClassName {
    public static String[] listAllClass=new String[200];
       
        public static void xuly() {
                //Lay duong dan den folder
                String url= "f:/File";
                
                
                
                File folder = new File(url);
                File[] listOfFiles = folder.listFiles();
               
                int count=0;
                //Vong for cho tat ca file trong folder
                for(File f:listOfFiles)
                {
                    //GetVar var=new GetVar();
                    
                    String m = f.getName(); 
                    if(m.contains("class"))
                    {
                    
                    String[] n= m.split("\\.");
                    
                    System.out.println(n[0]);
                        GetSuperClass s=new GetSuperClass();
                        System.out.println("Super Class:"+s.getSuperClass(url, n[0]));
                        System.out.println("-");   
                    GetVar vars=new GetVar();
                        System.out.println("Variables:");
                        for(String v:vars.getVar(url,n[0]))
                        {
                        if(v==null) break;
                        System.out.println(v);
                          
                        
                        }
                        System.out.println("------");
                    GetMethods methods=new GetMethods();
                        System.out.println("Methods:");
                        for(String v:methods.getMethods(url,n[0]))
                        {
                        if(v==null) break;
                        System.out.println(v);
                          
                        
                        }
                        System.out.println("_____________________________");
                    }
                }
            
                
            
        }
        
        public static void main(String[] args) {
        xuly();
    }
}
