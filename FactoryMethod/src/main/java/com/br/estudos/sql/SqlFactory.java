package com.br.estudos.sql;

import com.br.estudos.db.DbConnector;
import com.br.estudos.db.DbFactory;

// Concrete Creator
public class SqlFactory extends DbFactory {
    // Factory Method
    @Override
    public DbConnector createConnector(String connectionString) {
        return new SqlServerConnector(connectionString);
    }
}
