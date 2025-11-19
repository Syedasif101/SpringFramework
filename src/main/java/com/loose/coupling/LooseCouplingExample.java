package com.loose.coupling;

import com.loose.coupling.UserManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {

    public static void main(String[] args)
    {

//        UserDataProvider databaseProvider = new UserDatabaseProvider();
//        UserManager userManagerWithDB = new UserManager(databaseProvider);
//        System.out.println(userManagerWithDB.getUserInfo());
//
//
//        UserDataProvider webServiceProvider = new WebserviceDataProvider();
//        UserManager userManagerWS = new UserManager(webServiceProvider);
//        System.out.println(userManagerWS.getUserInfo());
//
//
//        UserDataProvider newDatabase = new NewDatabaseProvider();
//        UserManager userManagerNew = new UserManager(newDatabase);
//        System.out.println(userManagerNew.getUserInfo());


        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationLooseCoupling.xml");

        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithUserDatabaseProvider");
        System.out.println(userManagerWithDB.getUserInfo());

        UserManager webServiceProvider = (UserManager) context.getBean("userManagerWithWebserviceDatabaseProvider");
        System.out.println(webServiceProvider.getUserInfo());

        UserManager newUserDatabase = (UserManager) context.getBean("userManagerWithNewDatabaseProvider");
        System.out.println(newUserDatabase.getUserInfo());


    }
}
