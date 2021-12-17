package com.java.DAO;

import com.java.DTO.ProductDTO;
import com.java.DTO.UsersDTO;

import java.sql.*;

import com.JDBCutil.*;

public class DAOImpl implements DAO {

	@Override
	public int userRegistration(UsersDTO usersdto) {
		Connection con = null;
		PreparedStatement ps = null;
		int x = 0;
		try {
			con = Jdbcutil.getConnection();
			String sql = "insert into users2 values(?,?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, usersdto.getUserid());
			ps.setString(2, usersdto.getFullname());
			ps.setString(3, usersdto.getEmail());
			ps.setLong(4, usersdto.getPhone());
			ps.setString(5, usersdto.getDob());
			ps.setString(6, usersdto.getGender());
			ps.setString(7, usersdto.getUsername());
			ps.setString(8, usersdto.getPassword());
			x = ps.executeUpdate();
			if (x > 0) {
				System.out.println("record inserted");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				Jdbcutil.cleanup(con, ps);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return x;
	}

	@Override
	public int getNextUserid() {
		int userid = 0;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = Jdbcutil.getConnection();
			String sql = "select max(userid) from users2";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				int maxID = rs.getInt(1);
				if (maxID == 0) {
					userid = 1;
				} else {
					userid = maxID + 1;
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				Jdbcutil.cleanup(con, ps, rs);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		return userid;
	}

	@Override
	public UsersDTO verifyUser(String username, String password) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		UsersDTO usersdto = null;
		try {
			con = Jdbcutil.getConnection();
			String sql = "select * from users2 where username=? and password=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				usersdto = new UsersDTO();
				usersdto.setUserid(rs.getInt(1));
				usersdto.setFullname(rs.getString(2));
				usersdto.setEmail(rs.getString(3));
				usersdto.setPhone(rs.getLong(4));
				usersdto.setDob(rs.getString(5));
				usersdto.setGender(rs.getString(6));
				usersdto.setUsername(rs.getString(7));
//				usersdto.setPassword(rs.getString(8));
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				Jdbcutil.cleanup(con, ps, rs);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return usersdto;
	}

	@Override
	public UsersDTO getuserbyuserid(int userid) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		UsersDTO userdto = null;
		try {
			con = Jdbcutil.getConnection();
			String sql = "select * from users2 where userid=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, userid);
			rs = ps.executeQuery();
			if (rs.next()) {
				userdto = new UsersDTO();
				userdto.setUserid(rs.getInt(1));
				userdto.setFullname(rs.getString(2));
				userdto.setEmail(rs.getString(3));
				userdto.setPhone(rs.getLong(4));
				userdto.setDob(rs.getString(5));
				userdto.setGender(rs.getString(6));
				userdto.setUsername(rs.getString(7));
				userdto.setPassword(rs.getString(8));

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			Jdbcutil.cleanup(con, ps, rs);
		}

		return userdto;
	}

	@Override
	public boolean updateprofile(UsersDTO userdto) {
		Connection con = null;
		PreparedStatement ps = null;
		boolean status = false;
		try {
			con = Jdbcutil.getConnection();
			String sql = "update users2 set fullname=?,email=?,phone=?,username=? where userid=?";

			ps = con.prepareStatement(sql);
			ps.setString(1, userdto.getFullname());
			ps.setString(2, userdto.getEmail());
			ps.setLong(3, userdto.getPhone());
			ps.setString(4, userdto.getUsername());
			ps.setInt(5, userdto.getUserid());
			int x = ps.executeUpdate();
			if (x > 0) {
				status = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				Jdbcutil.cleanup(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return status;
	}

}
