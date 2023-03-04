package com.driver.services;

import com.driver.model.User;

public  interface UserService {
    abstract User register(String username, String password, String countryName) throws Exception;

    abstract User subscribe(Integer userId, Integer serviceProviderId);
}