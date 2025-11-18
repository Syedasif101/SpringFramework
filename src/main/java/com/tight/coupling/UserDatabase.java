package com.tight.coupling;


// Database A -> MySQL, PostgreSQL
// and after you are webservice or MongoDB
public class UserDatabase {
    public String getUserDetails()
    {
        // Directly access database here
        return "User Details From Database";
    }
}
