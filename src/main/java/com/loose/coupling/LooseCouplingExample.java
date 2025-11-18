package com.loose.coupling;

import com.loose.coupling.UserManager;

public class LooseCouplingExample {

    public static void main(String[] args)
    {

        UserDataProvider databaseProvider = new UserDatabaseProvider();

        UserManager userManagerWithDB = new UserManager(databaseProvider);

        System.out.println(userManagerWithDB.getUserInfo());


    }
}
