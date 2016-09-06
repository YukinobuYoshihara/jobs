package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class FruitDao {
	public ArrayList<String> getFruitList() {
		ArrayList<String> fruitList=null;
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager
					.getConnection("jdbc:sqlite:c:/sqlite/hoge.db");
			Statement stmt = con.createStatement();
			String sql = "SELECT name FROM fruits";
			ResultSet rs = stmt.executeQuery(sql);
			fruitList = new ArrayList<>();
			while (rs.next()) {
				String name = rs.getString("name");
				fruitList.add(name);
				System.out.println(name);
			}
			stmt.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return fruitList;
	}

}
