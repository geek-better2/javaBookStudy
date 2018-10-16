package com.refactor.test;

import com.refactor.domain.Customer;
import com.refactor.domain.Movie;
import com.refactor.domain.Rental;
import org.junit.Test;

public class TestCustomer {

    @Test
    public void test(){
        Movie m1  = new Movie("ͬ������",1);
        Movie m2  = new Movie("Xս��",2);
        Movie m3  = new Movie("���ν��",0);
        Movie m4  = new Movie("С������",2);
        Rental r1 = new Rental(m1,3);
        Rental r2 = new Rental(m2,1);
        Rental r3 = new Rental(m3,5);
        Rental r4 = new Rental(m4,4);
        Customer c1 = new Customer("С��");
        c1.addRental(r1);
        c1.addRental(r2);
        c1.addRental(r3);
        c1.addRental(r4);
        String result = c1.statement();
        System.out.println(result);

    }
}
