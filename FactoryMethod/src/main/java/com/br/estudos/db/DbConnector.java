package com.br.estudos.db;

import com.br.estudos.Connection;

public abstract class DbConnector {
    protected DbConnector(String connectionString) {
        this.connectionString = connectionString;
    }

    protected String connectionString;

    public abstract Connection connect();
}
