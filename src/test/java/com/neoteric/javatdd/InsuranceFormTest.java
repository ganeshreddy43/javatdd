package com.neoteric.javatdd;

import org.junit.jupiter.api.Test;

public class InsuranceFormTest {
    @Test
    public void test(){
        InsuranceForm details = new InsuranceForm();
        details.PolicyholderName ="sukumar";
        details.gender = "male";
        details.address ="hyd";
        details.Email="Sukku@22gmail.com";
        details.date="07-07-2024";
        details.phoneNumber=8523647555l;
        details.typeOfInsurance="healthInsurance";

        System.out.println(details.PolicyholderName);
        System.out.println(details.gender);
        System.out.println(details.address);
        System.out.println(details.Email);
        System.out.println(details.date);
        System.out.println(details.phoneNumber);
        System.out.println(details.typeOfInsurance);

    }
}
