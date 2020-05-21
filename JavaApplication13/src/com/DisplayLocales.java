/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
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
public class DisplayLocales {
    public DisplayLocales() {
        String baseName = "res.Messages";
        Locale locale =Locale.getDefault();
        ResourceBundle messages =ResourceBundle.getBundle(baseName, locale);
        System.out.println(messages.getString("locale.set"));
        System.out.println(Locale.getDefault().getDisplayCountry()+"\t"+Locale.getDefault().getDisplayLanguage());
        System.out.println(messages.getString("locales"));
        Locale available[] =Locale.getAvailableLocales();
        for(Locale locale : available) {
            System.out.println(locale.getDisplayCountry() + "\t" +
                    locale.getDisplayLanguage(locale));
        }
    }
}
