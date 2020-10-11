package com.authentication.constants;

public interface AuthConstant {

	int min = 1111;

	int max = 9999;

	String COLUMN = "{column}";

	String VALUE = "{value}";

	long ACCESS_TOKEN_VALIDITY_SECONDS = 5 * 60 * 60;

	String SIGNING_KEY = "dcs@123#1992";

	String TOKEN_PREFIX = "Bearer ";

	String HEADER_STRING = "AUTH-TOKEN";

	String AUTHORITIES_KEY = "scopes";

	String[] UNSECURED = { "/auth/tokens/*", "/auth/users/signup", "/auth/users/forgor-password", "/auth/users/logout",
			"/auth/users/reset-password", "/auth/users/username/*", "/auth/users/otp", "/v2/api-docs",
			"/configuration/**", "/swagger*/**", "/webjars/**" };

	interface Path {

		String BASE = "auth";

		String CITY = "cities";

		String TOKEN = "tokens";

		String STATE = "states";

		String COUNTRY = "countries";

		String LOC = "locs";

		String USER = "users";

		String ROLE = "roles";

		String MODULE = "modules";

		String HISTORY = "histories";

	}

	interface Handler {

		String ACTIVE = "active";

		String DEACTIVE = "deactive";

		String GET_DOC = "get-file";

		String LOGIN = "login";

		String FORGOT_PASSWORD = "forgot-password";

		String RESET_PASSWORD = "reset-password";

		String SIGNUP = "signup";

		String LOGOUT = "logout";

		String UPLOAD = "upload";

		String ALL = "all";

	}

	interface Header {

		String ACTIVE = "active";

		String CURRENT_USER = "current-user";

	}

	interface RequestParam {
		String ID = "id";

		String FILE = "file";
	}

	interface PathVariable {

		String CODE = "code";

		String VALUE = "value";

		String ID = "id";

		String NAME = "name";

		String USER_NAME = "username";

		String EMAIL = "email";

		String PHONE = "phone";

		String STATE_ID = "state-id";

		String COUNTRY_ID = "country-id";

		String CITY_ID = "city-id";

		String USER_ID = "user-id";

		String FROM_DATE = "from-date";

		String TO_DATE = "to-date";

		String TYPE = "type";

		String NO = "no";

	}

	interface Symbol {

		String SLASH = "/";

		String CURLI_OPEN = "{";

		String CURLI_CLOSE = "}";

		String QUESTION = "?";

		String HASH_AT = "#@";
	}

	interface PathSeperator {

		String NAME = "name";

		String STATE_ID = "state";

		String COUNTRY_ID = "country";

		String EMAIL = "email";

		String PHONE = "phone";

		String STD_CODE = "std-code";

		String MOB = "mob";

		String ROLE = "role";

		String LOC = "loc";

		String FIRST_NAME = "first-name";

		String LAST_NAME = "last-name";

	}

	interface Message {
		String INVALIE_USER = "Invalid username/password.";

		String INVALIE_USER_DES = "The combination of username and password are incorrect.";

		String SUSPEND_BRANCH = "Your branch has been suspended. Please contact IT support.";

		String SUSPEND_GYM = "Your Gym has been suspended. Please contact IT support.";

		String CONSTRAINT = "Values are already in system, that you trying create.";

		String NOT_FOUND = "Not Found";

		String BAD_REQUEST = "Invalid Request Data.";

		String CONFLICT = "A record with {column}, {value} is already present in system. Please try other one.";
	}

	interface ExceptionCode {

		String NOT_FOUND = "404";

		String BAD_REQUESEST = "400";

		String CONFLICT = "409";

		String FORBIDDEN = "403";

		String INTERAL_SERVER_ERROR = "500";
	}

	static String getConflictMessage(String column, String val) {
		return Message.CONFLICT.replace(COLUMN, column).replace(VALUE, val);
	}
}
