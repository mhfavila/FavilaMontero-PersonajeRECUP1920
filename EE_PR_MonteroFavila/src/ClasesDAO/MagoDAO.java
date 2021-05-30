package ClasesDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ClasesDTO.MagoDTO;

public class MagoDAO {
	public List<MagoDTO> obtenerListado() {

		List<MagoDTO> registros = new ArrayList<>();

		Statement stm = null;
		Connection con = null;

		// FALTAN LOS ÚLTIMOS PARÁMETROS DE RELLENAR EN EL SQL
		String sql = "select * from mago;";

		try {

			con = Conexion.conectar();

			stm = con.createStatement();
			stm.execute(sql);

			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {

				MagoDTO mago = new MagoDTO();
				mago.setNombre(rs.getString(1));
				mago.setNivel(rs.getInt(2));
				mago.setVida(rs.getInt(3));
				mago.setFuerza(rs.getInt(4));
				mago.setDestreza(rs.getInt(5));
				mago.setConstitucion(rs.getInt(6));
				mago.setInteligencia(rs.getInt(7));
				mago.setOro(rs.getInt(8));
				mago.setTipo(rs.getString(9));
				mago.setBonificacionPiromancia(rs.getInt(10));
				mago.setBonificacionNigromancia(rs.getInt(11));
				mago.setBonificacionIlusion(rs.getInt(12));
				mago.setBonificacionTransmutación(rs.getInt(13));

				mago.getInventario().setPesoMochila(rs.getInt(14));

				mago.getInventario().setPesoMaximo(rs.getInt(15));
				mago.getInventario().setEspacioTotal(rs.getInt(16));
				mago.getInventario().setEspacioOcupado(rs.getInt(17));

				// HAY QUE A:ADIR LO DE LA MOCHILA????????

				// ** añadir los demás campos

				registros.add(mago);
			}

			stm.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Error: Clase ClienteDaoImple, método registrar");
			e.printStackTrace();
		}

		return registros;
	}

	public boolean insertar(MagoDTO mago) {
		boolean registrar = false;

		Statement stm = null;
		Connection con = null;

		// FALTAN LOS ÚLTIMOS PARÁMETROS DE RELLENAR EN EL SQL
		String sql = "insert into Mago(nombre,nivel,vida,fuerza,destreza,constitucion,inteligencia,oro,tipoPersonaje,bonificacionPiromancia,bonificacionNigromancia,bonificacionIlusion,bonificacionTransmutación,pesoMaximo, pesoMochila ,espacioTotal ,espacioOcupado)"
				+ " values ('" + mago.getNombre() + "'," + mago.getNivel() + "," + mago.getVida() + ","
				+ mago.getFuerza() + "," + mago.getDestreza() + "," + mago.getConstitucion() + ","
				+ mago.getInteligencia() + "," + mago.getOro() + ",'" + mago.getTipo() + "',"
				+ mago.getBonificacionPiromancia() + "," + mago.getBonificacionNigromancia() + ","
				+ mago.getBonificacionIlusion() + "," + mago.getBonificacionTransmutación() + ","
				+ mago.getInventario().getPesoMochila() + "," + mago.getInventario().getPesoMaximo() + ","
				+ mago.getInventario().getEspacioTotal() + "," + mago.getInventario().getEspacioOcupado() + ")";

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
	public boolean actualizar(MagoDTO mago) {
		boolean registrar = false;

		Statement stm = null;
		Connection con = null;

		// FALTAN LOS ÚLTIMOS PARÁMETROS DE RELLENAR EN EL SQL
		// falta rellenar el resto de datos

		String sql = "UPDATE Mago SET nivel=" + mago.getNivel() + ", vida =" + mago.getVida() + ", Fuerza ="
				+ mago.getFuerza() + ", Destreza =" + mago.getDestreza() + ", Constitucion ="
				+ mago.getConstitucion() + ", Inteligencia =" + mago.getInteligencia() + ", Oro ="
				+ mago.getOro() + ", Tipopersonaje ='" + mago.getTipo() + "', bonificacionPiromancia ="
				+ mago.getBonificacionPiromancia() + ", bonificacionNigromancia =" + mago.getBonificacionNigromancia()
				+ ", bonificacionTransmutación =" + mago.getBonificacionTransmutación()
				+ ", bonificacionIlusion =" + mago.getBonificacionIlusion() + ", pesoMochila ="
				+ mago.getInventario().getPesoMochila() + ", pesoMaximo ="
				+ mago.getInventario().getPesoMaximo() + ", espacioTotal ="
				+ mago.getInventario().getEspacioTotal() + ", espacioOcupado ="
				+ mago.getInventario().getEspacioOcupado() + "where nombre = '" + mago.getNombre() + "'";

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

	public boolean borrar(MagoDTO mago) {
		boolean registrar = false;

		Statement stm = null;
		Connection con = null;

		// FALTAN LOS ÚLTIMOS PARÁMETROS DE RELLENAR EN EL SQL

		String sql = "DELETE FROM Mago Where nombre ='" + mago.getNombre() + "';";
		
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
