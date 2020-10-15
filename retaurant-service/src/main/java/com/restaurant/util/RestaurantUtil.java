package com.restaurant.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.dcs.common.constant.CommonConstant;

public class RestaurantUtil {

	public static String findPincode(String input) {
		Pattern p = Pattern.compile(CommonConstant.RegexPatternConstant.PINCODE_PATTERN);
		Matcher m = p.matcher(input);
		if (m.find())
			return m.group(1);
		return null;
	}
}
