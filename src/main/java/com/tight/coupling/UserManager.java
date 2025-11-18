package com.tight.coupling;

import com.loose.coupling.UserDataProvider;

public class UserManager {
    private UserDatabase userDatabase = new UserDatabase();



    public String getUserInfo(){

        return userDatabase.getUserDetails();

    }

}
