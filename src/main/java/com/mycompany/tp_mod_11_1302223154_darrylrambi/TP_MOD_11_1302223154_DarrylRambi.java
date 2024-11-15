/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_mod_11_1302223154_darrylrambi;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class TP_MOD_11_1302223154_DarrylRambi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int Count = 0;
        boolean bool = true;
        
        System.out.println("Small Integer Tester");
        while (bool) {
            try {
                System.out.println("Masukkan integer: ");
                input = Integer.parseInt(scanner.nextLine());

                if (input == -99) {
                    bool = false;
                }

                if (input < 0) {
                    throw new SmallIntegerException("Nilai Lebih kecil dari 0");
                }
                
                if (input > 9) {
                    throw new SmallIntegerException("Nilai lebih besar dari 9");
                }
                
                System.out.println("Nilai benar");
            
            } catch (NumberFormatException e) {
                System.out.println("Input harus integer");
            } catch (SmallIntegerException e) {
                e.print();
                Count++;
                System.out.println("Total jumlah SmallIntegerException: " + Count);
            }
        }
    }
}
