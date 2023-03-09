/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework_3;
import java.util.Scanner;
/**
 *
 * @author 467
 */
public class Revisor extends Store{

    public Revisor() {
    }
    
    public void closeStore(Store myStore){
        String proverka = myStore.getStoreName();
        if("IKEA".equals(proverka)){
            myStore.setStoreName(null);
        }
    }
    
    public void rebrandStore(Store myStore){
        String proverka = myStore.getStoreName();
        if("MacDonalds".equals(proverka)){
            myStore.setStoreName("Вкусно и Точка");
        }
        else if(proverka == null){
            myStore.setStoreName(null);
        }
        else{
            myStore.setStoreName(proverka.substring(1));
        }
    }
}
