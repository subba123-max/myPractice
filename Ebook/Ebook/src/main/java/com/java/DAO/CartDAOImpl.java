package com.java.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.JDBCutil.Jdbcutil;
import com.java.DTO.CartDTO;

public class CartDAOImpl implements CartDAO {

	@Override
	public int AddToCart(CartDTO cartdto) {
		Connection con = null;
		PreparedStatement ps = null;
		int x = 0;
		try {
			con = Jdbcutil.getConnection();
			String sql = "insert into cart values(?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, cartdto.getId());
			ps.setInt(2, cartdto.getBookid());
			ps.setInt(3, cartdto.getUserid());
			ps.setString(4, cartdto.getBookName());
			ps.setDouble(5, cartdto.getPrice());
			ps.setDouble(6, cartdto.getTotalprice());

			x = ps.executeUpdate();
			if (x > 0) {

				System.out.println("inserted to cart");
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				Jdbcutil.cleanup(con, ps);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		return x;
	}

	@Override
	public int getNextUserid() {
		int id = 0;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = Jdbcutil.getConnection();
			String sql = "select max(id) from cart";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				int maxID = rs.getInt(1);
				if (maxID == 0) {
					id = 1001;
				} else {
					id = maxID + 1;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				Jdbcutil.cleanup(con, ps, rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return id;
	}

	@Override
	public ArrayList<CartDTO> getAllCartItemsbyUserID(int userid) {

		Connection con = null;
		PreparedStatement ps = null;
		ArrayList<CartDTO> cartItems = new ArrayList<>();
		;
		ResultSet rs = null;
		CartDTO cartdto = null;
		try {
			con = Jdbcutil.getConnection();
			String sql = "select * from cart where userid=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, userid);

			rs = ps.executeQuery();
			while (rs.next()) {
				cartdto = new CartDTO();

				cartdto.setId(rs.getInt(1));
				cartdto.setBookid(rs.getInt(2));
				cartdto.setUserid(rs.getInt(3));
				cartdto.setBookName(rs.getString(4));
				cartdto.setPrice(rs.getDouble(5));
				cartdto.setTotalprice(rs.getDouble(6));
				cartItems.add(cartdto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				Jdbcutil.cleanup(con, ps, rs);
			} catch (Exception e) {
			}

		}

		return cartItems;

	}

	@Override
	public void deleteItem(int itemid, int userid) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = Jdbcutil.getConnection();
			String sql = "delete from cart where id=? and userid=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, itemid);
			ps.setInt(2, userid);
			int x = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				Jdbcutil.cleanup(con, ps);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
