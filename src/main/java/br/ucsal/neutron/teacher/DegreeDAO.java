package br.ucsal.neutron.teacher;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.neutron.db.Database;

public class DegreeDAO {

	
	public List<Degree> list() {
		Connection conexao;
		List<Degree> list = null;
		try {
			conexao = Database.getInstacia().conexao();
			Statement statement = conexao.createStatement();
			list = new ArrayList<Degree>();
			ResultSet resultSet = statement.executeQuery(
					"SELECT ID, NAME  FROM DEGREE");
			while (resultSet.next()) {
				Degree degree = new Degree();
				degree.setId(resultSet.getLong("ID"));
				degree.setName(resultSet.getString("NAME"));
				list.add(degree);
			}
			//conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
}
