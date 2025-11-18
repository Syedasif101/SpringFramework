package com.loose.coupling;

import com.loose.coupling.UserManager;

public class LooseCouplingExample {

    public static void main(String[] args)
    {

        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());


        UserDataProvider webServiceProvider = new WebserviceDataProvider();
        UserManager userManagerWS = new UserManager(webServiceProvider);
        System.out.println(userManagerWS.getUserInfo());


        UserDataProvider newDatabase = new NewDatabaseProvider();
        UserManager userManagerNew = new UserManager(newDatabase);
        System.out.println(userManagerNew.getUserInfo());


    }
}
