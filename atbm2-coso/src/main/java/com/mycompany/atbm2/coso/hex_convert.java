/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atbm2.coso;

import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class hex_convert {
    private String in;
    private String coso;
    public hex_convert(){
        
    }
    public hex_convert(String input, String hecoso){
        in = input;
        coso = hecoso;
    }
    public String nhiphan(){
        HashMap<Character, String> hashMap = new HashMap<Character, String>();
        hashMap.put('0', "0000");
        hashMap.put('1', "0001");
        hashMap.put('2', "0010");
        hashMap.put('3', "0011");
        hashMap.put('4', "0100");
        hashMap.put('5', "0101");
        hashMap.put('6', "0110");
        hashMap.put('7', "0111");
        hashMap.put('8', "1000");
        hashMap.put('9', "1001");
        hashMap.put('A', "1010");
        hashMap.put('B', "1011");
        hashMap.put('C', "1100");
        hashMap.put('D', "1101");
        hashMap.put('E', "1110");
        hashMap.put('F', "1111");
        
        String kq="";
        for(int i=0;i<in.length();i++){
            if(hashMap.containsKey(in.charAt(i))){
                kq+=hashMap.get(in.charAt(i));
            }
        }
        return kq;
    }
    public String chuyendoi(){
        String ketqua = "";
        if(coso.equals("Nhị phân")) ketqua+=nhiphan();
        return ketqua;
    }
}
