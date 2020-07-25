package com.ass.smtfp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.ass.smtfp.model.AppUser;



@SuppressWarnings("unused")
public class ContactDAOImpl implements ContactDAO {

	private JdbcTemplate jdbcTemplate;

	public ContactDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	
	
	public AppUser getUser(String username, String otp) {
		Object[] arr = new Object[0];
		String sql = null;
		if (otp != null && !otp.equals("")) {
			sql = "SELECT user_id,username,userType,OTP,created_date,status,name,companyname,routing from appuser where username = ?  AND  OTP= ? ";
			arr = new Object[] { username, otp };
		} else {
			sql = "SELECT user_id,username,userType,OTP,created_date,status,name,companyname,routing from appuser where username = ? and status='1' ";
			arr = new Object[] { username };
		}
		List<AppUser> userlist = jdbcTemplate.query(sql, arr, new RowMapper<AppUser>() {

			public AppUser mapRow(ResultSet rs, int rowNum) throws SQLException {
				AppUser user = new AppUser();
				user.setUser_id(rs.getInt("user_id"));
				user.setUsername(rs.getString("username"));
				user.setUserType(rs.getString("userType"));
				user.setOTP(rs.getString("OTP"));
				user.setCompanyName(rs.getString("companyname"));
				if (rs.getString("status").equals("1")) {
					user.setStatus("Success");
				} else {
					user.setStatus("Fail");
				}
				user.setName(rs.getString("name"));
				user.setCreatedDate(rs.getDate("created_date"));
				user.setRouting(rs.getInt("routing"));

				return user;
			}

		});
		if (!CollectionUtils.isEmpty(userlist)) {
			return userlist.get(0);
		}
		return null;

	}

	public int insertUserData(AppUser user) {
		StringBuilder sb = new StringBuilder(
				" INSERT INTO `hms`.`appuser`(`username`,`phone`,`password`,`userType`,`OTP`,`enabled`,`status`,`name`,`address1`,`companyname`,`routing`) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
		return jdbcTemplate.update(sb.toString(), user.getUsername(), user.getUsername(), user.getPassword(),
				user.getUserType(), user.getOTP(), "1", "2", user.getName(), user.getAddress1(), user.getCompanyName(),
				user.getRouting());
	}

	public List<AppUser> userList() {
		String sql = "SELECT user_id,name,username,companyname,userType,OTP,created_date,status,address1, enabled, phone,routing from appuser ";
		List<AppUser> listUser = jdbcTemplate.query(sql, new RowMapper<AppUser>() {

			public AppUser mapRow(ResultSet rs, int rowNum) throws SQLException {
				AppUser user = new AppUser();
				user.setName(rs.getString("name"));
				user.setCompanyName(rs.getString("companyname"));
				user.setUser_id(rs.getInt("user_id"));
				user.setUsername(rs.getString("username"));
				user.setUserType(rs.getString("userType"));
				user.setOTP(rs.getString("OTP"));
				user.setPhone(rs.getString("phone"));
				user.setAddress1(rs.getString("address1"));
				if (rs.getString("status").equals("1")) {
					user.setStatus("Success");
				} else if (rs.getString("status").equals("2")) {
					user.setStatus("Pending");
				} else {
					user.setStatus("Denied");
				}
				user.setCreatedDate(rs.getDate("created_date"));
				user.setRouting(rs.getInt("routing"));
				return user;
			}

		});

		return listUser;
	}

	public AppUser getUserById(int userId, String otp) {
		Object[] arr = new Object[0];
		String sql = null;
		if (otp != null && !otp.equals("")) {
			sql = "SELECT user_id,username,userType,OTP,created_date,status, name,address1 from appuser where user_id = ?  AND  OTP= ? ";
			arr = new Object[] { userId, otp };
		} else {
			sql = "SELECT user_id,username,userType,OTP,created_date,status, name,address1 from appuser where user_id = ?";
			arr = new Object[] { userId };
		}
		List<AppUser> userlist = jdbcTemplate.query(sql, arr, new RowMapper<AppUser>() {

			public AppUser mapRow(ResultSet rs, int rowNum) throws SQLException {
				AppUser user = new AppUser();
				user.setUser_id(rs.getInt("user_id"));
				user.setUsername(rs.getString("username"));
				user.setUserType(rs.getString("userType"));
				user.setOTP(rs.getString("OTP"));
				if (rs.getString("status").equals("1")) {
					user.setStatus("Success");
				} else if (rs.getString("status").equals("2")) {
					user.setStatus("Pending");
				} else {
					user.setStatus("Denied");
				}
				user.setCreatedDate(rs.getDate("created_date"));
				user.setName(rs.getString("name"));
				user.setAddress1(rs.getString("address1"));

				return user;
			}

		});
		if (!CollectionUtils.isEmpty(userlist)) {
			return userlist.get(0);
		}
		return null;

	}

	public int insertType(String name, String status) {
		StringBuilder sb = new StringBuilder(" INSERT INTO `hms`.`itemType`(`typeName`,`status`)VALUES(?,?)");
		return jdbcTemplate.update(sb.toString(), name, status);
	}

	
	public AppUser getUserLogin(String username, String password) {
		Object[] arr = new Object[0];
		String sql = null;

		sql = "SELECT user_id,username,userType,OTP,created_date,status,name from appuser where email = ?  AND  password= ? ";
		arr = new Object[] { username, password };

		List<AppUser> userlist = jdbcTemplate.query(sql, arr, new RowMapper<AppUser>() {

			public AppUser mapRow(ResultSet rs, int rowNum) throws SQLException {
				AppUser user = new AppUser();
				user.setUser_id(rs.getInt("user_id"));
				user.setUsername(rs.getString("username"));
				user.setUserType(rs.getString("userType"));
				user.setOTP(rs.getString("OTP"));
				if (rs.getString("status").equals("1")) {
					user.setStatus("Success");
				} else {
					user.setStatus("Fail");
				}
				user.setName(rs.getString("name"));
				user.setCreatedDate(rs.getDate("created_date"));

				return user;
			}

		});
		if (!CollectionUtils.isEmpty(userlist)) {
			return userlist.get(0);
		}
		return null;

	}

	public int updateUserData(Long userId, String status, Integer routing) {
		String deleteSQL = "UPDATE appuser SET status = ?, routing = ? WHERE user_id =?";
		return jdbcTemplate.update(deleteSQL, status, routing, userId);
	}



	public int delete(int contactId) {
		// TODO Auto-generated method stub
		return 0;
	}



	public int deleteItem(int itemId) {
		// TODO Auto-generated method stub
		return 0;
	}



	public AppUser insertWebUser(AppUser user) {
		// TODO Auto-generated method stub
		return null;
	}
}