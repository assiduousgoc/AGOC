package com.ass.client;

import com.ass.smtfp.model.UserData;
import com.ass.smtfp.model.UserLoginDto;

public interface GMSUserClient {

	UserData login(UserLoginDto dto) throws RuntimeException;
}
