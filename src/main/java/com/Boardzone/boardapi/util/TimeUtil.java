/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Boardzone.boardapi.util;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author phump
 */
public class TimeUtil {
    /**
     * DateTimeFormatter of pattern {@code "yyyy-MM-dd hh:mm:ss"}
     */
   public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

   /**
    * 
    * @return Current date Time in {@code yyyy-MM-dd hh:mm:ss} format.
    */
    public static String getTimeNowstr(){
        return LocalDateTime.now().format(dtf);
    }
    
    /**
    * 
    * @return Current date Time in {@code yyyy-MM-dd hh:mm:ss} format.
    */
    public static LocalDateTime getTimeNow(){
        return LocalDateTime.now();
    }
    
   /**
    * This method will find next hour, minute and second of current date time.
    * @param hour
    * @param minute
    * @param second
    * @return String of desired date time in {@code yyyy-MM-dd hh:mm:ss} format .
    */
    public static String getTimeNext(int hour, int minute, int second){
        return LocalDateTime.now().plusHours(hour).plusMinutes(minute).plusSeconds(second).format(dtf);
    }
}
