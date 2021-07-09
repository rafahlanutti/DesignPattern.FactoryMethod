package com.br.estudos.db;

import com.br.estudos.DataBase;
import com.br.estudos.oracle.OracleFactory;
import com.br.estudos.sql.SqlFactory;

// Abstract Creator
public abstract class DbFactory {
    // Factory Method
    public abstract DbConnector createConnector(String connectionString);

    public static DbFactory database(DataBase dataBase) throws Exception {
        if (dataBase == DataBase.SqlServer)
            return new SqlFactory();
        if (dataBase == DataBase.Oracle)
            return new OracleFactory();

        throw new Exception("Banco de dados não reconhecido.");
    }
}