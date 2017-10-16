/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author MINH HIEU
 */
public class GetVar {
     public static String[] getVar()
    {
        
        Class c = DumpMethods.class;
        String[] result=new String[100];
        String arg="";
        try {
            
            Method[] m = c.getDeclaredMethods();
            Field[] f = c.getDeclaredFields();
            for (int i = 0; i < f.length; i++)
            {
            result[i]= f[i].getName()+":"+f[i].getGenericType();
            
            }
            
        } catch (Throwable e) {
            System.out.println(e);
        }
        return result;
    }
    
    public static void main(String[] args) {
       for (String method : getVar()) {
           if(method==null) break;
           System.out.println(method);
       }
    }
}
