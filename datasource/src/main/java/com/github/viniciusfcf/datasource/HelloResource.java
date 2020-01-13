package com.github.viniciusfcf.datasource;

import java.sql.SQLException;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.agroal.api.AgroalDataSource;
import io.quarkus.agroal.DataSource;

@Path("/hello")
public class HelloResource {

    @Inject
    AgroalDataSource defaultDataSource;

    @Inject
    @DataSource("banco2")
    AgroalDataSource dataSource2;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws SQLException {
        // Pegar uma conexao
        // Connection connection = defaultDataSource.getConnection();
        // Executar uma query.
        // java.sql.ResultSet resultset = connection.createStatement().executeQuery("select * from tabela");
        return "hello";
    }
}