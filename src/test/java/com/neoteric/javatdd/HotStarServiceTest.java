package com.neoteric.javatdd;

import com.neoteric.javatdd.hotStarModel.CreateAccount;
import com.neoteric.javatdd.hotStarModel.User;
import com.neoteric.javatdd.hotStarService.HotStarAccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotStarServiceTest {
    @Test
    public void test() {

        User user = new User();

        user.holderName = "pavankumar";
        user.amount =149;
        user.age = 24;
        user.email = "pavan2345@email";
        user.phonenumber = 9848022754l;

        HotStarAccountService service = new HotStarAccountService();
        CreateAccount createAccount = service.getAccount(user);

        Assertions.assertEquals("pavan2345@email",user.email);



    }



}
