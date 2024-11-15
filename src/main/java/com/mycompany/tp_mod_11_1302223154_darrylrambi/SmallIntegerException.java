/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_mod_11_1302223154_darrylrambi;

/**
 *
 * @author ASUS
 */
public class SmallIntegerException extends Exception {
    private static int total_exception = 0;

    public SmallIntegerException(String msg) {
        super(msg);
        total_exception++;
    }

    public static int getTotal_exception() {
        return total_exception;
    }
    
    public void print() {
        System.out.println(getMessage());
    }
}
