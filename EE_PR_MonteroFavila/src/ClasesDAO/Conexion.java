package ClasesDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class Conexion {
	public static Connection conectar() {
		Connection con = null;
		
		String url = "jdbc:postgresql://localhost:5432/Personaje";
        String user = "favila";
        String password = "qwerty";

        try {
        	 con = DriverManager.getConnection(url, user, password);
        
            // Statement st = con.createStatement();
             //ResultSet rs = st.executeQuery("SELECT VERSION()")) {

            //if (rs.next()) {
             //   System.out.println(rs.getString(1));
            //}

        } catch (SQLException ex) {
        
           System.out.println(ex.getMessage());
        }

		
		
		return con;
	}
}