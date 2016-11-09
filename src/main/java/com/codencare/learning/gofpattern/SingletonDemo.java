/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.learning.gofpattern;

/**
 *
 * @author iman
 */
public class SingletonDemo {
    public static void main(String[] args) {
        DBPool pool1 = DBPool.getInstance();
        pool1.connectDb("Accounting");
        pool1.connectDb("HR");
        DBPool pool2 = DBPool.getInstance();
        pool2.connectDb("CRM");
        pool2.connectDb("SupplyChain");
        pool1.connectDb("Underwriter");
    }
}

class DBPool{
    private static DBPool instance;

    private DBPool(){}
    public static DBPool getInstance(){
        instance = new DBPool();
        return instance;
    }
    
    public void connectDb(String url){
        System.out.printf("%s Connected to %s \n",
                this.hashCode(),url);
    }
}