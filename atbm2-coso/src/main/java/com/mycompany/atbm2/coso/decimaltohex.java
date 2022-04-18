/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atbm2.coso;

  import java.util.Scanner;
public class decimaltohex {

{
    
}
public static String decimalcvtohex(int in){
    int rem;
        
     // For storing result
     String str2=""; 
 
     // Digits in hexadecimal number system
     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
 
     while(in>0)
     {
       rem=in%16; 
       str2=hex[rem]+str2; 
       in=in/16;
     }
     return str2;
}
public static int hexToDecimal(String hexnum){
        String hstring = "0123456789ABCDEF";
        hexnum = hexnum.toUpperCase();
        int num = 0;
        for (int i = 0; i < hexnum.length(); i++)
        {
            char ch = hexnum.charAt(i);
            int n = hstring.indexOf(ch);
            num = 16*num + n;
        }
        return num;
    }
}
