/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additionalInfo;
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
import additionalInfo.Command;

/**
 *
 * @author me
 */
public class CommandMap {
    private Map<String,Command> commandMap=new HashMap<>();
    private static CommandMap instance=new CommandMap();
    public CommandMap getInstance(){
    return instance;
    }
    private CommandMap(){
    commandMap.put("Romania",new Command("romania","bucharest"));
    
    }
    public Command getCommand(String Name){
    return commandMap.getName();
    
    }
    public void putCommand(Command command){
    commandMap.put(command.getName(),command);
    
    }
}
