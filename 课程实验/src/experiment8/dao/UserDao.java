package experiment8.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import experiment8.model.Reader;

/**
 * �û�ע����Ϣ
 * @author admin
 *
 */
public class UserDao {
	/**
	 * �û�ע��
	 * @param con
	 * @param reader
	 * @return
	 * @throws Exception
	 */
	public int register(Connection con,Reader reader) throws Exception{
		String sql = "insert into reader values(?,?,?,?)";
		PreparedStatement pstmt = (PreparedStatement)con.prepareStatement(sql);
		pstmt.setInt(1, reader.getReader_id());
		pstmt.setString(2, reader.getReader_name());
		pstmt.setString(3, reader.getReader_phone());
		pstmt.setString(4, reader.getReader_password());
		return pstmt.executeUpdate();
	}
	/**
	 * �û���Ϣ����,�����ã��û�id������ͬ
	 * @param con
	 * @param reader
	 * @return
	 * @throws Exception
	 */
	public Reader login(Connection con,Reader reader) throws Exception{
		Reader resultUser = null;
		String sql ="select * from reader where reader_name=? and reader_password=?";
		PreparedStatement pstmt = (PreparedStatement)con.prepareStatement(sql);
		pstmt.setString(1, reader.getReader_name());
		pstmt.setString(2, reader.getReader_password());
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			resultUser = new Reader();
			resultUser.setReader_id(rs.getInt("reader_id"));
			resultUser.setReader_name(rs.getString("reader_name"));
			resultUser.setReader_phone(rs.getString("reader_phone"));
			resultUser.setReader_password(rs.getString("reader_password"));
		}
		return resultUser;
	}
	/**
	 * ͨ���û�Id��ѯ�û�������Ϣ
	 * @param con
	 * @param readerId
	 * @return
	 * @throws Exception
	 */
	public ResultSet query(Connection con, int readerId)throws Exception{
		String sql = "select * from reader where reader_id = ?";
		PreparedStatement pstmt = (PreparedStatement)con.prepareStatement(sql);
		pstmt.setInt(1, readerId);
		return pstmt.executeQuery();
	}
	/**
	 * ɾ���û�
	 * @param con
	 * @param readerId
	 * @return
	 * @throws Exception
	 */
	public int delete(Connection con, int readerId)throws Exception{
		String sql = "delete from reader where reader_id = ?";
		PreparedStatement pstmt = (PreparedStatement)con.prepareStatement(sql);
		pstmt.setInt(1, readerId);
		return pstmt.executeUpdate();
	}
}
