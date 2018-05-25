package br.ufc.qxd.connection;

import java.sql.*;
import java.sql.Connection;

public class ConnectionFactory {
	 public void execute() throws SQLException, ClassNotFoundException {
	        String url = "jdbc:teiid:test-vdb@mm://localhost:31000";
	        String sql = "select firstName from user";
	        
	        Class.forName("org.teiid.jdbc.TeiidDriver");
	        Connection connection = null;
	        try{
	            connection = DriverManager.getConnection(url, "user", "password");
	            Statement statement = connection.createStatement();
	            ResultSet results = statement.executeQuery(sql);

	            while(results.next()) {
	              System.out.println(results.getString(1));
	            }
	            results.close();
	            statement.close();
	        } catch (SQLException e){
	            e.printStackTrace();
	            throw e;
	        } finally {
	            try{
	              connection.close();
	            }catch(SQLException e1){
	              e1.printStackTrace();
	            }              
	        }
	    }
}