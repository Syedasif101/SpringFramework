package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider{

    @Override
    public String getUserDetails() {

        // get details from database
        return "User details from the database";
    }
}
