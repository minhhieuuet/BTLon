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

public class ClassName{
        public static String[] listAllClass=new String[200];
       
        public static void xuly() {
        
    
	 
                //\MINHHIEU\Documents\NetBeansProjects\JavaApplication1\src\DoMinhHieu-16021577-Tuan6
                
                File folder = new File("f:/File");
                File[] listOfFiles = folder.listFiles();
                System.out.println(listOfFiles.length);
                int countAllClass=0;
            
                
            for (File listOfFile : listOfFiles) {
                
                
                //read file
                if(listOfFile==null) break;
                
                String URL = listOfFile.toString();
                String fileName = URL;
                String[] lineList=new String[500];
                String[] listClass=new String[500];
                int count=0;
                int countClass=0;
                try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                    
                    String line;
                    while ((line = br.readLine()) != null) {
                        
                        lineList[count++]=line;
                        
                    }
                    
                } catch (IOException e) {
                    e.printStackTrace();
                }
                    for (String lineList1 : lineList) {
                        if(lineList1==null) break;
                        
                        if (lineList1 != null) {
                            if (lineList1.contains("class")) {
                                if (lineList1.contains("extends")) {
                                    String[] words = lineList1.split("\\s+");
                                    for (int j = 0; j < words.length; j++) {
                                        if(words[j]==null) break;
                                       
                                        if(words[j].equals("class"))
                                        {
                                            
                                            listClass[countClass]=words[j+3].replace("{","")+" "+words[j+1].replace("{","");
                                            countClass++;
                                        }
                                        
                                    }
                                } else {
                                    String[] words = lineList1.split("\\s+");
                                    for (int j = 0; j < words.length; j++) {
                                         if(words[j]==null) break;
                                        if(words[j].equals("class"))
                                        {
                                            
                                            listClass[countClass]=words[j+1].replace("{","");
                                            countClass++;
                                        }
                                        
                                    }
                                }
                            }
                        }
                    }
                    
                    for (String listClas : listClass) {
                        
                        if(listClas==null) break;
                        if (listClas != null) {
                            listAllClass[countAllClass++] = listClas;
                        }
                    }
                
            }
            
            
           
        }
        
        public static void main(String[] args) {
            xuly();
            
            GiaoDien gd=new GiaoDien(listAllClass);
    }
      
}
