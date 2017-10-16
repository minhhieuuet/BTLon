/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de1;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author MINH HIEU
 */
public class DumpMethods {
    int hihi,hi,ha,hu;
   public int hi(int i,float b)
   {
       System.out.println("Hi hi");
       return i;
   }
   
    public static String[] getMethods()
    {
        String[] result=new String[100];
        String arg="";
        try {
            File folder = new File("f:/File");
           File[] listOfFiles = folder.listFiles();
           
            Class c = DumpMethods.class;
            Method[] m = c.getDeclaredMethods();
            Class[] n=c.getDeclaredClasses();
            Field[] f = c.getFields();
            for (int i = 0; i < m.length; i++)
            {
            result[i]= m[i].getName()+"("+arg+")"+": "+m[i].getReturnType();
            
            }
            
        } catch (Throwable e) {
            System.out.println(e);
        }
        return result;
    }
    
    public static void main(String[] args) {
       for (String method : getMethods()) {
           if(method==null) break;
           System.out.println(method);
       }
    }
}