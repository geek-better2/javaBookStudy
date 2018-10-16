package com.refactor.test;

import com.refactor.domain.Customer;
import com.refactor.domain.Movie;
import com.refactor.domain.Rental;
import org.junit.Test;


public class TestCustomer {

    @Test
    public  void  testRefactor(String[] args){
        Movie m1  = new Movie("同桌的你",1);
        Movie m2  = new Movie("X战警",2);
        Movie m3  = new Movie("变形金刚",0);
        Movie m4  = new Movie("小猪佩奇",2);
        Rental r1 = new Rental(m1,3);
        Rental r2 = new Rental(m2,1);
        Rental r3 = new Rental(m3,5);
        Rental r4 = new Rental(m4,4);
        Customer c1 = new Customer("小明");
        c1.addRental(r1);
        c1.addRental(r2);
        c1.addRental(r3);
        c1.addRental(r4);
        String result = c1.statement();
        System.out.println(result);

    }
}
