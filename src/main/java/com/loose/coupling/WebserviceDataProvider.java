package com.loose.coupling;

public class WebserviceDataProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "Getting data from webservice";
    }
}
