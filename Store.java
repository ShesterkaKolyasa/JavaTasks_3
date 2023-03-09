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
public class Store {
    private int storeSquare;
    private int storeID;
    private String storeWorkMode;
    private String storeName;

    public Store(int storeSquare, int storeID, String storeWorkMode, String storeName) {
        this.storeSquare = storeSquare;
        this.storeID = storeID;
        this.storeWorkMode = storeWorkMode;
        this.storeName = storeName;
    }

    public Store() {
    }

    public void setStoreSquare(int storeSquare) {
        this.storeSquare = storeSquare;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public void setStoreWorkMode(String storeWorkMode) {
        this.storeWorkMode = storeWorkMode;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    
    
    public int inputStoreSquare() {
        Scanner storeInfo = new Scanner (System.in);
        System.out.println("input your Store area: ");
        return this.storeSquare = storeInfo.nextInt();
    }


    public int inputStoreID() {
        Scanner storeInfo = new Scanner (System.in);
        System.out.println("input your Store ID: ");
        return this.storeID = storeInfo.nextInt();
    }

    public String inputStoreWorkMode() {
        Scanner storeInfo = new Scanner (System.in);
        System.out.println("input your Store Condition: ");
        return this.storeWorkMode = storeInfo.next();
    }
    
    public String inputStoreName() {
        Scanner storeInfo = new Scanner (System.in);
        System.out.println("input your Store Name: ");
        return this.storeName = storeInfo.next();
    }

    public int getStoreSquare() {
        return storeSquare;
    }

    public int getStoreID() {
        return storeID;
    }

    public String getStoreWorkMode() {
        return storeWorkMode;
    }

    public String getStoreName() {
        return storeName;
    }
    
    
    @Override
    public String toString() {
        return "Store{" + "Your store area is: " + getStoreSquare() + ", Your store ID is: " + getStoreID() + ", Your store WorkMode is: " 
                + getStoreWorkMode() + ", Wellcome to the " + getStoreName() + " Store" + "}";
    }
    
  //  public String toNewString() {
  //      return "Store{" + "Your store area is: " + inputStoreSquare() + ", Your store ID is: " + inputStoreID() + ", Your store WorkMode is: " 
  //              + inputStoreWorkMode() + ", Wellcome to the " + inputStoreName() + " Store" + "}";
  // }
}
