package com.neoteric.javatdd;

import org.junit.jupiter.api.Test;

public class BankApplicationTest {
    @Test

    public void test (){
        BankApplication details = new BankApplication();
        details.name = "sukumar";
        details.nameOfBank = "HDFC";
        details.address = "hyd";
        details.accountNumber = 1034569870;
        details.phoneNumber = 9848013455l;
        details.date ="07-07-2024";

        System.out.println(details.name);
        System.out.println(details.accountNumber);
        System.out.println(details.nameOfBank);
        System.out.println(details.address);
        System.out.println(details.phoneNumber);
        System.out.println(details.date);
    }
}
