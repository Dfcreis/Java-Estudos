package bancoDeDados.aplication;

import bancoDeDados.db.DB;

import java.sql.*;

public class jdbcUpdate {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement st = null;
        try {
            con = DB.getConnection();
            st = con.prepareStatement("UPDATE seller SET BaseSalary = BaseSalary + ? WHERE DepartmentId = 1", Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, 500);
            int alteracao = st.executeUpdate();
            if (alteracao > 0) {
                System.out.format("%d item atualizado com sucesso !", alteracao);
            } else {
                System.out.println("Sem alteracao!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeConnection();
            DB.closeStatement(st);
        }
    }
}
