package com.neoteric.javatdd;

import org.junit.jupiter.api.Test;

public class MovieTicketTest {
    @Test
    public void test(){
        MovieTicket details = new MovieTicket();
        details.date = "08-07-2024";
        details.noOfTicket=1;
        details.movieName="kalki";
        details.screen="screen2";
        details.theater="PVR";
        details.seatNumber=4;

        System.out.println(details.date);
        System.out.println(details.noOfTicket);
        System.out.println(details.movieName);
        System.out.println(details.screen);
        System.out.println(details.theater);
        System.out.println(details.seatNumber);

    }
}
