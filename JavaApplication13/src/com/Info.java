/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;
import java.util.spi.CurrencyNameProvider;
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
public class Info {
    public Info(){
    
    String baseName = "res.Messages";
        Locale locale = Locale.getDefault();
        ResourceBundle messages = ResourceBundle.getBundle(baseName, locale);
        System.out.println(messages.getString("info"));
        System.out.println(messages.getString("country")+" "+locale.getDisplayCountry());
        System.out.println(messages.getString("language")+" "+locale.getDisplayLanguage());
        System.out.println(messages.getString("currency")+" "+Currency.getInstance(locale));
        String[] weekDays = new DateFormatSymbols(locale).getWeekdays();
        System.out.println(messages.getString("weekdays")+" "+Arrays.toString(weekDays));
        String[] months=new DateFormatSymbols(locale).getMonths();
        System.out.println(messages.getString("months")+" "+Arrays.toString(months));
        LocalDateTime today=LocalDateTime.now();
      
        System.out.println(messages.getString("today")+" "+today.format(formatter));
    }
}
