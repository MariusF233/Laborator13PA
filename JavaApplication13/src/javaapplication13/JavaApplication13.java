/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;
import java.lang.Object;
//import java.beans.Introspector;

import java.awt.*;

import java.awt.BorderLayout;
import java.awt.Container;
import java.beans.BeanInfo;
import java.beans.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.beans.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComponent;

/**
 *
 * @author me
 */
public class JavaApplication13 {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String baseName="res.Messages";
    boolean isRunning=true;
while (isRunning) {
    Locale locale=Locale.getDefault();
    ResourceBundle messages = ResourceBundle.getBundle(baseName, locale);
    
    String commandName = scanner.next();        
            if(commandName.equals("Info"))
            { new Info();}
            else if(commandName.equals("DisplayLocales"))
            {new DisplayLocales();}
            else if(commandName.equals("SetLocale"))
            {
            System.out.println("1. romanian");
                System.out.println("2. english");
                System.out.println(messages.getString("option"));
                String option = s.nextLine();
            if(option.equals("1"))
            {
            locale="ro-RO";
            
           }else locale="en-US";
             new SetLocale(locale);
            }else if(commandName.equals("exit"))
            {System.out.println(messages.getString("exit"));
            break;}
            
            
            
            
  
}
}