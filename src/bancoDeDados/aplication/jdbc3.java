package bancoDeDados.aplication;

import Excecao.solucao1.model.DomainException;
import bancoDeDados.db.DB;
import bancoDeDados.db.dbExeption;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class jdbc3 {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement("Insert into seller (Name,Email,BirthDate,BaseSalary,DepartmentId) values (?,?,?,?,?)");
            st.setString(1, "Daniel");
            st.setString(2, "dfcreis@gmail");
            st.setDate(3, new java.sql.Date(sdf.parse("08/03/2004").getTime()));
            st.setDouble(4, 1518.00);
            st.setInt(5, 1);
            int linhasAlteradas = st.executeUpdate();
            System.out.println("Done! " + linhasAlteradas);


        } catch (SQLException | ParseException e) {
            throw new dbExeption(e.getMessage());
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
