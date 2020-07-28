package com.ass.smtfp.dao;

import java.util.List;
import com.ass.smtfp.model.AppUser;;



public interface ContactDAO {


	public int delete(int contactId);

	public List<AppUser> userList();

	public int insertUserData(AppUser user);

	public AppUser getUser(String username, String otp);

	public AppUser getUserById(int userId, String otp);

	public int insertType(String name, String status);

	
	public int deleteItem(int itemId);

	public AppUser getUserLogin(String username, String password);

	public AppUser insertWebUser(AppUser user);

	public int updateUserData(Long userId, String status, Integer routing);
}
