package com.codencare.learning.persistance.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iman
 */
public class MetadataJdbcDemo {

    Connection conn;

    public static void main(String[] args) throws SQLException {
        MetadataJdbcDemo app = new MetadataJdbcDemo();

        app.bukaKoneksi();
        app.tulisBacaDb();
    }

    public void bukaKoneksi() throws SQLException {
        // -------------------------------------------
        // format koneksi-String "jdbc:<db>:address 
        // -------------------------------------------
        String dbUrl = "jdbc:derby:memory:demo;create=true";
        conn = DriverManager.getConnection(dbUrl);
    }

    public void tulisBacaDb() throws SQLException {
        Statement stmt = conn.createStatement();

        // hapus table jika dibutuhkan
        // stmt.executeUpdate("Drop Table users");
        // buat table
        stmt.executeUpdate("Create table siswa (id int primary key, nama varchar(30))");

        // masukkan 2 rows
        stmt.executeUpdate("insert into siswa values (1,'ucrit')");
        stmt.executeUpdate("insert into siswa values (2,'unyil')");

        // query
        ResultSet rs = stmt.executeQuery("SELECT * FROM siswa");
        ResultSetMetaData meta = rs.getMetaData();
        int i = 0;
        // tampilkan ke layar
        while (rs.next()) {
            System.out.printf("%d (%s) \t%s (%s) \n", rs.getInt("id"),
                    meta.getColumnTypeName(1),
                    rs.getString("nama"),
                    meta.getColumnTypeName(2));
        }
    }
}
