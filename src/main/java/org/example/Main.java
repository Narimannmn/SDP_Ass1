package org.example;

import org.example.database.Database;
public class Main {

    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        System.out.println(db1 == db2);
        System.out.println(db1);
        System.out.println(db2);


    }

}