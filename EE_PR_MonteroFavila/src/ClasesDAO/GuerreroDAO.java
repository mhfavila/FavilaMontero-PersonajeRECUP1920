package ClasesDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ClasesDTO.GuerreroDTO;

public class GuerreroDAO {

	public List<GuerreroDTO> obtenerListado() {

		List<GuerreroDTO> registros = new ArrayList<>();

		Statement stm = null;
		Connection con = null;

		// FALTAN LOS ÚLTIMOS PARÁMETROS DE RELLENAR EN EL SQL
		String sql = "select * from guerrero;";

		try {

			con = Conexion.conectar();

			stm = con.createStatement();
			stm.execute(sql);

			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {

				GuerreroDTO guerrero = new GuerreroDTO();
				guerrero.setNombre(rs.getString(1));
				guerrero.setNivel(rs.getInt(2));
				guerrero.setVida(rs.getInt(3));
				guerrero.setFuerza(rs.getInt(4));
				guerrero.setDestreza(rs.getInt(5));
				guerrero.setConstitucion(rs.getInt(6));
				guerrero.setInteligencia(rs.getInt(7));
				guerrero.setOro(rs.getInt(8));
				guerrero.setTipo(rs.getString(9));
				guerrero.setModoBerserker(rs.getInt(10));
				guerrero.setBonificacionArmaligera(rs.getInt(11));
				guerrero.setBonificacionArmapesada(rs.getInt(12));
				guerrero.getInventario().setPesoMochila(rs.getInt(13));

				guerrero.getInventario().setPesoMaximo(rs.getInt(14));
				guerrero.getInventario().setEspacioTotal(rs.getInt(15));
				guerrero.getInventario().setEspacioOcupado(rs.getInt(16));

				// HAY QUE A:ADIR LO DE LA MOCHILA????????

				// ** añadir los demás campos

				registros.add(guerrero);
			}

			 stm.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Error: Clase ClienteDaoImple, método registrar");
			e.printStackTrace();
		}

		return registros;
	}

	public boolean insertar(GuerreroDTO guerrero) {
		boolean registrar = false;

		Statement stm = null;
		Connection con = null;

		// FALTAN LOS ÚLTIMOS PARÁMETROS DE RELLENAR EN EL SQL
		String sql = "insert into Guerrero(nombre,nivel,vida,fuerza,destreza,constitucion,inteligencia,oro,tipoPersonaje,modoBerserker,bonificacionArmaligera,bonificacionArmapesada,pesoMaximo, pesoMochila ,espacioTotal ,espacioOcupado)"
				+ " values ('" + guerrero.getNombre() + "'," + guerrero.getNivel() + "," + guerrero.getVida() + ","
				+ guerrero.getFuerza() + "," + guerrero.getDestreza() + "," + guerrero.getConstitucion() + ","
				+ guerrero.getInteligencia() + "," + guerrero.getOro() + ",'" + guerrero.getTipo() + "',"
				+ guerrero.getModoBerserker() + "," + guerrero.getBonificacionArmaligera() + ","
				+ guerrero.getBonificacionArmapesada() + "," + guerrero.getInventario().getPesoMochila() + ","
				+ guerrero.getInventario().getPesoMaximo() + "," + guerrero.getInventario().getEspacioTotal() + ","
				+ guerrero.getInventario().getEspacioOcupado() + ")";

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

	// HAY QUE CAMBIAR LAS CONSULTAS
	public boolean actualizar(GuerreroDTO guerrero) {
		boolean registrar = false;

		Statement stm = null;
		Connection con = null;

		// FALTAN LOS ÚLTIMOS PARÁMETROS DE RELLENAR EN EL SQL
		// falta rellenar el resto de datos

		String sql = "UPDATE Guerrero SET nivel=" + guerrero.getNivel() + ", vida =" + guerrero.getVida() + ", Fuerza ="
				+ guerrero.getFuerza() + ", Destreza =" + guerrero.getDestreza() + ", Constitucion ="
				+ guerrero.getConstitucion() + ", Inteligencia =" + guerrero.getInteligencia() + ", Oro ="
				+ guerrero.getOro() + ", Tipopersonaje ='" + guerrero.getTipo() + "', modoBerserker ="
				+ guerrero.getModoBerserker() + ", bonificacionArmaligera =" + guerrero.getBonificacionArmaligera()
				+ ", bonificacionArmapesada =" + guerrero.getBonificacionArmapesada() + ", pesoMochila ="
				+ guerrero.getInventario().getPesoMochila() + ", pesoMaximo ="
				+ guerrero.getInventario().getPesoMaximo() + ", espacioTotal ="
				+ guerrero.getInventario().getEspacioTotal() + ", espacioOcupado ="
				+ guerrero.getInventario().getEspacioOcupado() + "where nombre = '" + guerrero.getNombre() + "'";

		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}

	public boolean borrar(GuerreroDTO guerrero) {
		boolean registrar = false;

		Statement stm = null;
		Connection con = null;

		// FALTAN LOS ÚLTIMOS PARÁMETROS DE RELLENAR EN EL SQL

		String sql = "DELETE FROM Guerrero Where nombre ='" + guerrero.getNombre() + "';";
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
