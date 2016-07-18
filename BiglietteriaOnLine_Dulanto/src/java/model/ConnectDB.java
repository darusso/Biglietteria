/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author javamdl
 */
public  class ConnectDB {
    public static String driverDB="com.mysql.jdbc.Driver";
    public static String hostDB="localhost";
    public static String portDB="3306";
    public static String nameDB="bliglietteria_on_line";
    public static String userDB="tss2015";
    public static String pwDB="tss-2015";
        
    public static String urlDB="jdbc:mysql://"+hostDB+":"+portDB+"/"+nameDB; 
    
    
    
}
