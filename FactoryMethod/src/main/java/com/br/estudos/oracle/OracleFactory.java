package com.br.estudos.oracle;

import com.br.estudos.db.DbConnector;
import com.br.estudos.db.DbFactory;

// Concrete Creator
public class OracleFactory extends DbFactory {
    // Factory Method
    @Override
    public DbConnector createConnector(String connectionString) {
        return new OracleDbConnector(connectionString);
    }
}