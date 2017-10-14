/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de1;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author MINH HIEU
 */
public class GiaoDien extends JFrame{
    
    public GiaoDien(String[] listAllClass)
    {
        setSize(1000,700);
        setVisible(true);
        setResizable(true);
        setLocation(100, 100);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        int count=50;
        
        JLabel[] listLabel=new JLabel[100];
        
        //Mouse lisence
       
        for (String listAllClas : listAllClass) {
            if(listAllClas==null) break;
            if (listAllClas != null) {
                
               if(!listAllClas.contains(" "))
               {
                    System.out.println(count);
                   
                    JLabel label = new JLabel(listAllClas);
                    label.setBounds(100,count,100,50);
                    Border border = LineBorder.createGrayLineBorder();
                    label.setBorder(border);
                    label.setOpaque(true);
                    add (label);
                    int count1=250;
                    
                    for(String listAllClas1 : listAllClass)
                    {
                        if(listAllClas1==null) break;
                            if(listAllClas1.contains(listAllClas)&&listAllClas1.contains(" "))
                            {
                                    String[] parts=listAllClas1.split(" ");
                                    JLabel label1 = new JLabel(parts[1]);
                                    label1.setBounds(count1,count,100,50);
                                    Border border1 = LineBorder.createGrayLineBorder();
                                    label1.setBorder(border1);
                                    label1.setOpaque(true);
                                    add (label1);
                                    
                                    count1+=150;
                            }
                    }
                    count+=60;
                    
               }        
            }
            } 
        }
    }
    
    

