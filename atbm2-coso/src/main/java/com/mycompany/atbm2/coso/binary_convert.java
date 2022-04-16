/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atbm2.coso;

/**
 *
 * @author Admin
 */
public class binary_convert {
    private String in;
    private String coso;
    public binary_convert(){
        
    }
    public binary_convert(String input, String hecoso){
        in = input;
        coso = hecoso;
    }
    public String thaplucphan(){
        long tong = 0;
        int somu = -1;
        String kq ="";
        for(int i= in.length() - 1;i >= 0;i--){
            somu+=1;
            int temp = (int)Math.round(Math.pow(2, somu));
            tong+=temp*Long.parseLong(String.valueOf(in.charAt(i)));
        }
        try {
            kq = Long.toHexString(tong);
        }
        catch(Exception ex){
            return null;
        }
        return kq.toUpperCase();
    }
//    public String chuyendoi(){
//        String ketqua = "";
//        if(coso.equals("Thập lục phân")) ketqua+=thaplucphan();
//        return ketqua;
//    }
}
