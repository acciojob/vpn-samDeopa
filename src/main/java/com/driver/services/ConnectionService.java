package com.driver.services;

import com.driver.model.User;

public  interface ConnectionService {
    abstract User connect(int userId, String countryName) throws Exception;
    abstract User disconnect(int userId) throws Exception;

    abstract User communicate(int senderId, int receiverId) throws Exception;
}