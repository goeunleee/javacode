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
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("로드 실패");
		}

		// 2 connection 생성

		Connection conn = null;
		try {
			String url = "jdbc:oracle:thin:@localhost:1521/XE";
			String id = "hr";
			String pw = "hr";
			conn = DriverManager.getConnection(url, id, pw);

			System.out.println(conn);
			// 3 sql 구문 생성
			String sql = "select first_name, salary from employees where employee_id=103";
			// 4 statement 객체 생성
			PreparedStatement stmt = conn.prepareStatement(sql);
			// 5 쿼리문 실행
			ResultSet rs = stmt.executeQuery();

			// 6 결과
			if (rs.next()) {
				String name = rs.getString(1);
				int salary = rs.getInt(2);
				System.out.println(name + " : " + salary);
			} else {
				System.out.println("데이터 없음 .");
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
			}//너정말웃기지도않아 
		}

	}
}
