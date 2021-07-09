package com.br.estudos.sql;

import com.br.estudos.Connection;
import com.br.estudos.db.DbConnector;

// Concrete Product
public class SqlServerConnector extends DbConnector {

    public SqlServerConnector(String connectionString) {
        super(connectionString);
    }

    @Override
    public Connection connect() {
        System.out.println("Conectando ao banco SQL Server...");
        var connection = new Connection(connectionString);
        connection.open();

        return connection;
    }
}
