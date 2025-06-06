package co.edu.uco.pathorder;

import co.edu.uco.pathorder.crosscutting.excepciones.PathOrderException;
import java.sql.Connection;
import java.sql.DriverManager;

public class PruebaConexion {

    public static void main(String[] args) throws PathOrderException {
        // URL adaptada para conexión segura a Neon (requiere SSL)
        String url = "jdbc:postgresql://ep-square-butterfly-a8qzh9rh-pooler.eastus2.azure.neon.tech:5432/pathorder_db?sslmode=require";
        String usuario = "pathorder_db_owner";
        String clave = "npg_n0LwiyVuk1dq";

        try (Connection conexion = DriverManager.getConnection(url, usuario, clave)) {
            System.out.println("Conexión exitosa a la base de datos de PostgreSQL alojada en Neon");
        } catch (Exception exception) {
            System.out.println("Error al conectar:");
            exception.printStackTrace();
        }
    }
}
