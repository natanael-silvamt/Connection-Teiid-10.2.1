package br.ufc.qxd.test;

import java.sql.SQLException;

import br.ufc.qxd.connection.ConnectionFactory;

public class TestConnection {
	public static void main(String[] args) {
		
		ConnectionFactory connection = new ConnectionFactory();
		try {
			connection.execute();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
