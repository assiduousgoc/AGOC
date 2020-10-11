package com.authentication.config;

import com.authentication.models.LocalUser;

public class LocaleThread {

	static private ThreadLocal<LocalUser> LOCAL_USER = new ThreadLocal<>();

	public static ThreadLocal<LocalUser> getLocal() {
		return LOCAL_USER;
	}

}
