package ClasesDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ClasesDTO.PicaroDTO;

public class PicaroDAO {
	public List<PicaroDTO> obtenerListado() {

		List<PicaroDTO> registros = new ArrayList<>();

		Statement stm = null;
		Connection con = null;

		// FALTAN LOS ÚLTIMOS PARÁMETROS DE RELLENAR EN EL SQL
		String sql = "select * from picaro;";

		try {

			con = Conexion.conectar();

			stm = con.createStatement();
			stm.execute(sql);

			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {

				PicaroDTO picaro = new PicaroDTO();
				picaro.setNombre(rs.getString(1));
				picaro.setNivel(rs.getInt(2));
				picaro.setVida(rs.getInt(3));
				picaro.setFuerza(rs.getInt(4));
				picaro.setDestreza(rs.getInt(5));
				picaro.setConstitucion(rs.getInt(6));
				picaro.setInteligencia(rs.getInt(7));
				picaro.setOro(rs.getInt(8));
				picaro.setTipo(rs.getString(9));
				picaro.setEsconder(rs.getInt(10));
				picaro.setAbrirCerradura(rs.getInt(11));
				picaro.setAtaqueFurtivo(rs.getInt(12));
				picaro.getInventario().setPesoMochila(rs.getInt(13));

				picaro.getInventario().setPesoMaximo(rs.getInt(14));
				picaro.getInventario().setEspacioTotal(rs.getInt(15));
				picaro.getInventario().setEspacioOcupado(rs.getInt(16));

				// HAY QUE A:ADIR LO DE LA MOCHILA????????

				// ** añadir los demás campos

				registros.add(picaro);
			}

			stm.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Error: Clase ClienteDaoImple, método registrar");
			e.printStackTrace();
		}

		return registros;
	}

	public boolean insertar(PicaroDTO picaro) {
		boolean registrar = false;

		Statement stm = null;
		Connection con = null;

		// FALTAN LOS ÚLTIMOS PARÁMETROS DE RELLENAR EN EL SQL
		String sql = "insert into Picaro(nombre,nivel,vida,fuerza,destreza,constitucion,inteligencia,oro,tipoPersonaje,Esconder,abrirCerradura,ataqueFurtivo,pesoMaximo, pesoMochila ,espacioTotal ,espacioOcupado)"
				+ " values ('" + picaro.getNombre() + "'," + picaro.getNivel() + "," + picaro.getVida() + ","
				+ picaro.getFuerza() + "," + picaro.getDestreza() + "," + picaro.getConstitucion() + ","
				+ picaro.getInteligencia() + "," + picaro.getOro() + ",'" + picaro.getTipo() + "',"
				+ picaro.getEsconder() + "," + picaro.getAbrirCerradura() + ","
				+ picaro.getAtaqueFurtivo() + "," + picaro.getInventario().getPesoMochila() + ","
				+ picaro.getInventario().getPesoMaximo() + "," + picaro.getInventario().getEspacioTotal() + ","
				+ picaro.getInventario().getEspacioOcupado() + ")";

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
	public boolean actualizar(PicaroDTO picaro) {
		boolean registrar = false;

		Statement stm = null;
		Connection con = null;

		// FALTAN LOS ÚLTIMOS PARÁMETROS DE RELLENAR EN EL SQL
		// falta rellenar el resto de datos

		String sql = "UPDATE Picaro SET nivel=" + picaro.getNivel() + ", vida =" + picaro.getVida() + ", Fuerza ="
				+ picaro.getFuerza() + ", Destreza =" + picaro.getDestreza() + ", Constitucion ="
				+ picaro.getConstitucion() + ", Inteligencia =" + picaro.getInteligencia() + ", Oro ="
				+ picaro.getOro() + ", Tipopersonaje ='" + picaro.getTipo() + "', Esconder ="
				+ picaro.getEsconder() + ", abrirCerradura =" + picaro.getAbrirCerradura()
				+ ", ataqueFurtivo =" + picaro.getAtaqueFurtivo() + ", pesoMochila ="
				+ picaro.getInventario().getPesoMochila() + ", pesoMaximo ="
				+ picaro.getInventario().getPesoMaximo() + ", espacioTotal ="
				+ picaro.getInventario().getEspacioTotal() + ", espacioOcupado ="
				+ picaro.getInventario().getEspacioOcupado() + "where nombre = '" + picaro.getNombre() + "'";

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

	public boolean borrar(PicaroDTO picaro) {
		boolean registrar = false;

		Statement stm = null;
		Connection con = null;

		// FALTAN LOS ÚLTIMOS PARÁMETROS DE RELLENAR EN EL SQL

		String sql = "DELETE FROM Picaro Where nombre ='" + picaro.getNombre() + "';";
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
