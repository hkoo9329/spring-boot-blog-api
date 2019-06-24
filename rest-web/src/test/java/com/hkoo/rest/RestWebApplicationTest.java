package com.hkoo.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RestWebApplicationTest {


    @Autowired
    private DataSource ds;

    @Test
    public void testConnection() throws Exception {
        Connection con = ds.getConnection();
        con.close();
    }

    @Test
    public void contextLoads() {
    }
}