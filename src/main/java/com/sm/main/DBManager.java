package com.sm.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {
	public static Connection connect() throws SQLException {

		// �ǿ�
		String url = "jdbc:oracle:thin:@URJ817BYXD912F6F_high?TNS_ADMIN=C:/JGW/Wallet_URJ817BYXD912F6F";
		
		// ����
		//String url = "jdbc:oracle:thin:@URJ817BYXD912F6F_high?TNS_ADMIN=C:/Wallet_URJ817BYXD912F6F";
		
		// ���
		//String url = "jdbc:oracle:thin:@URJ817BYXD912F6F_high?TNS_ADMIN=/Users/jeon-yong-gyu/Documents/Wallet_URJ817BYXD912F6F";
		
		// ����
		//String url = "jdbc:oracle:thin:@URJ817BYXD912F6F_high?TNS_ADMIN=D:/lhb/semi3tWorkspace/Wallet/Wallet_URJ817BYXD912F6F";
		
		String user="YGG";
		String password="Soldesk802!!";
		System.out.println(url);
		return DriverManager.getConnection(url, user, password);
		
	}

	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}