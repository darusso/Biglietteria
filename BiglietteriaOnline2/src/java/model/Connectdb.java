package model;
/**
 *
 * @author Davide Russo
 */
public  class Connectdb 
{
    public static String driverDB="com.mysql.jdbc.Driver";
    public static String hostDB="localhost";
    public static String portDB="3306";
    public static String nameDB="biglietteria_on_line";
    public static String userDB="tss2015";
    public static String pwDB="tss-2015";
        
    public static String urlDB="jdbc:mysql://"+hostDB+":"+portDB+"/"+nameDB;    
    
}
