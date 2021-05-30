package ClasesDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import ClasesDTO.InventarioDTO;
import ClasesDTO.ItemDTO;
import ClasesDTO.PersonajeDTO;

public class InventarioDAO {

	public InventarioDTO obtener(PersonajeDTO personaje) {

		InventarioDTO registros = new InventarioDTO();

		Statement stm = null;
		Connection con = null;

		// FALTAN LOS ÚLTIMOS PARÁMETROS DE RELLENAR EN EL SQL
		String sql = "select * from item where nombreMago = '"+personaje.getNombre() + "' or nombrePicaro = '"
				+ personaje.getNombre() + "' or nombreGuerrero = '" + personaje.getNombre() + "' ;";
		
		try {

			con = Conexion.conectar();

			stm = con.createStatement();
			stm.execute(sql);

			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				ItemDTO item = new ItemDTO();
				item.setNombre(rs.getString(1));
				item.setDescripcion(rs.getString(2));
				item.setDefensa(rs.getInt(3));
				item.setAtaque(rs.getInt(4));

				item.setMagico(rs.getInt(5));
				item.setEspacio(rs.getInt(6));
				item.setPrecio(rs.getInt(7));
				item.setPeso(rs.getInt(8));

				personaje.getInventario().getMochila().add(item);
			}

			stm.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Error: Clase ClienteDaoImple, método registrar");
			e.printStackTrace();
		}

		return registros;
	}

	
	  public boolean insertar(ItemDTO item) { boolean registrar = false;
	  
	  Statement stm = null; Connection con = null;
	  
	  // cambiar los valores por los del item 
	  String sql =
	 "insert into item(nombre,descripcion,defensa,ataque,magico,espacio,precio,peso)"
	  + " values ('" + item.getNombre() + "','" +item.getDescripcion() + "'," +
	  item.getDefensa()+ "," + item.getAtaque() + "," +
	  item.getMagico() + "," + item.getEspacio() + "," +
	  item.getPrecio() + "," + item.getPeso()  + ")";
	  
	  try { con = Conexion.conectar(); stm = con.createStatement();
	  stm.executeUpdate(sql); 
	  registrar = true; 
	  stm.close(); 
	  con.close(); 
	  } catch(SQLException e) {
	  System.out.println("Error: Clase ClienteDaoImple, método registrar");
	e.printStackTrace(); } return registrar; }
	 

	public boolean borrar(ItemDTO item) {
		boolean registrar = false;

		Statement stm = null;
		Connection con = null;

		

		String sql = "DELETE FROM Item Where nombre ='" + item.getNombre() + "';";
		System.out.println(sql);
		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			stm.executeUpdate(sql);
			registrar = true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}

}
