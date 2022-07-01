package experiment8.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	Connection con;
	/**
	 * @return
	 */
	public Connection loding() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e1){
			e1.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_admin?serverTimezone=UTC","root","123456");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
	/**
	 * @param con
	 * @throws Exception
	 */
	public void closeCon (Connection con)throws Exception {
        if(con!=null){
            con.close();
        }
    }
}