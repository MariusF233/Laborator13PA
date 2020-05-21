/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additionalInfo;
import com.Info;
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
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Map;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author me
 */
public class AdditonalInformation {
    
    private final Map<String,Info> info = new HashMap<>();
    String requestUrl="www.oorsprong.org/wensamples.countryinfo/CountryInfoService.wso";
    public AdditionalInformation(){
    String baseName = "res.Commands";
        Locale locale = Locale.getDefault();
        ResourceBundle messages = ResourceBundle.getBundle(baseName, locale);
    
        System.out.println(messages.getString("country")+" "+locale.getDisplayCountry());
        System.out.println(messages.getString("capital")+" "+locale.getDisplayCapital());
        
        
    }
    
    
    @Override
    public void getInfo(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
    {
    String countryName=request.getParameter("countryName");
    String countryCapital=request.getParameter("countryCapital");
    
    
    
    }
    
}

