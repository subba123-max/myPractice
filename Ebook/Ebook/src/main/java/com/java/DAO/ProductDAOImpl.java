package com.java.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.JDBCutil.Jdbcutil;
import com.java.DTO.ProductDTO;

public class ProductDAOImpl implements ProductDAO {
	public int insertBook(ProductDTO productdto) {
		Connection con = null;
		PreparedStatement ps = null;
		int x = 0;
		try {
			con = Jdbcutil.getConnection();
			String sql = "insert into product values(?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, productdto.getId());
			ps.setString(2, productdto.getName());
			ps.setString(3, productdto.getPrice());
			ps.setString(4, productdto.getDescription());
			ps.setString(5, productdto.getImage());

			x = ps.executeUpdate();
			if (x > 0) {
				System.out.println("book inserted!!");
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				Jdbcutil.cleanup(con, ps);
			} catch (Exception e) {
				e.printStackTrace();
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
			String sql = "select max(id) from product";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				int maxID = rs.getInt(1);
				if (maxID == 0) {
					id = 101;
				} else {
					id = maxID + 1;
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

		return id;
	}

	@Override
	public ArrayList<ProductDTO> getAllBooks() {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ProductDTO productdto = null;
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		;
		try {
			con = Jdbcutil.getConnection();
			String sql = "select * from product";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {

				productdto = new ProductDTO();
				productdto.setId(rs.getInt(1));
				productdto.setName(rs.getString(2));
				productdto.setPrice(rs.getString(3));
				productdto.setDescription(rs.getString(4));
				productdto.setImage(rs.getString(5));
//				System.out.println("From DB:"+productdto);

				list.add(productdto);

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			Jdbcutil.cleanup(con, ps, rs);
		}
//		System.out.println(list+":::list");
		return list;
	}

	@Override
	public ProductDTO getBookById(int bookid) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ProductDTO productdto = null;
		try {
			con = Jdbcutil.getConnection();
			String sql = "select * from product where id=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, bookid);
			rs = ps.executeQuery();
			if (rs.next()) {
				productdto = new ProductDTO();
				productdto.setId(rs.getInt(1));
				productdto.setName(rs.getString(2));
				productdto.setPrice(rs.getString(3));
				productdto.setDescription(rs.getString(4));
				productdto.setImage(rs.getString(5));

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			Jdbcutil.cleanup(con, ps, rs);
		}

		return productdto;
	}

	@Override
	public boolean UpdateBook(ProductDTO productdto) {
		Connection con = null;
		PreparedStatement ps = null;
		boolean status = false;
		try {
			con = Jdbcutil.getConnection();
			String sql = "update product set name=?,price=?,description=? where id=?";
			ps = con.prepareStatement(sql);

			ps.setString(1, productdto.getName());
			ps.setString(2, productdto.getPrice());
			ps.setString(3, productdto.getDescription());
//			ps.setString(4, productdto.getImage());
			ps.setInt(4, productdto.getId());

			int x = ps.executeUpdate();
			if (x > 0) {
				status = true;
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				Jdbcutil.cleanup(con, ps);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return status;
	}

	@Override
	public void DeleteBook(int bookid) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = Jdbcutil.getConnection();
			String sql = "delete from product where id=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, bookid);
			System.out.println(ps);
			int x = ps.executeUpdate();
			if (x > 0) {
//					System.out.println("");
			}

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
