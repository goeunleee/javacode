package customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SimpleJDBC {
	public static void main(String[] args) {
		// 1 driver load
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("�ε� ����");
		}

		// 2 connection ����

		Connection conn = null;
		try {
			String url = "jdbc:oracle:thin:@localhost:1521/XE";
			String id = "hr";
			String pw = "hr";
			conn = DriverManager.getConnection(url, id, pw);

			System.out.println(conn);
			// 3 sql ���� ����
			String sql = "select first_name, salary from employees where employee_id=103";
			// 4 statement ��ü ����
			PreparedStatement stmt = conn.prepareStatement(sql);
			// 5 ������ ����
			ResultSet rs = stmt.executeQuery();

			// 6 ���
			if (rs.next()) {
				String name = rs.getString(1);
				int salary = rs.getInt(2);
				System.out.println(name + " : " + salary);
			} else {
				System.out.println("������ ���� .");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}//���������������ʾ� 
		}

	}
}
