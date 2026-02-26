package bancoDeDados.aplication;

import bancoDeDados.db.DB;

import java.sql.*;

public class jdbcInset {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = DB.getConnection();
            st = con.prepareStatement("INSERT INTO department(Name) VALUES(?)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, "Lucas");
            int result = st.executeUpdate();
            if (result > 0) {
                System.out.println("Quantidade inserida com sucesso! " + result);
                rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Id: " + id);
                }
            } else {
                System.out.println("Nenhum a linha inserida!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
