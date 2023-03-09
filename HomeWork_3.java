/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework_3;
import java.util.Scanner;

/**
 *
 * @author 467
 */
public class HomeWork_3 {

    public static void main(String[] args) {
        System.out.println("Домашняя работа №3, вариант 5, Панкратов Максим Максимович, РИБО-02-21");
        Store myStore = new Store();
        myStore.inputStoreID();
        myStore.inputStoreName();
        myStore.inputStoreSquare();
        myStore.inputStoreWorkMode();
        System.out.println(myStore.toString());
        
        System.out.println("Новые данные");
        
        Revisor myRevisor = new Revisor();
        myRevisor.closeStore(myStore);
        myRevisor.rebrandStore(myStore);
        System.out.println(myStore.toString());
    }
}
