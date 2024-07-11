package com.neoteric.javatdd.hotStarService;

import com.neoteric.javatdd.hotStarModel.CreateAccount;
import com.neoteric.javatdd.hotStarModel.User;

public class HotStarAccountService {

    public CreateAccount getAccount(User user){
        CreateAccount createAccount=null;
        if(user.amount==149){
            createAccount=new CreateAccount();

            createAccount.name = user.holderName;
            createAccount.phoneNumber= user.phonenumber;
            createAccount.email= user.email;

        }
        return createAccount;
    }

}
