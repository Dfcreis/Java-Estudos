package bancoDeDados.aplication;

import bancoDeDados.db.DB;
import bancoDeDados.db.DbIntegrityException;

import java.sql.*;

public class jbdcDelete {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {

        Connection con = null;
        PreparedStatement st = null;

        try {
            con = DB.getConnection();
            st = con.prepareStatement("DELETE FROM seller WHERE Name = ?", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, "Daniel Fernandes");
            int result = st.executeUpdate();

            if (result > 0) {
                System.out.println("Quantidade de items removida com sucesso: " + result);
            } else {
                System.out.println("Nada Apagado!");
            }

        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        }


    }
}
