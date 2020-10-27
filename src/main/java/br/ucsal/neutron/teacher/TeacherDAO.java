package br.ucsal.neutron.teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.neutron.db.Database;

public class TeacherDAO {

	public List<Teacher> list() {
		Connection conexao;
		List<Teacher> list = null;
		try {
			conexao = Database.getInstacia().conexao();
			Statement statement = conexao.createStatement();
			list = new ArrayList<Teacher>();
			ResultSet resultSet = statement.executeQuery(
					"SELECT Teacher.ID, Teacher.NAME, DEGREE.ID as DID, DEGREE.NAME as DNAME  FROM Teacher inner join DEGREE on Teacher.DEGREE_ID = DEGREE.ID");
			while (resultSet.next()) {
				Teacher teacher = new Teacher();
				teacher.setId(resultSet.getLong("ID"));
				teacher.setName(resultSet.getString("NAME"));
				long d = resultSet.getInt("DID");
				Degree degree = new Degree();
				degree.setId(d);
				degree.setName(resultSet.getString("DNAME"));
				teacher.setDegree(degree);
				list.add(teacher);
			}
			//conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	public void save(Teacher teacher) {
		Connection conexao;

		try {
			conexao = Database.getInstacia().conexao();
			String sql = "INSERT INTO Teacher ( \"NAME\", \"DEGREE_ID\" ) VALUES (?,?)";
			PreparedStatement statement = conexao.prepareStatement(sql);
			statement.setString(1, teacher.getName());
			statement.setLong(2, teacher.getDegree().getId());
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
