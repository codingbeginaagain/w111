package org.zerock.w1.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.zerock.w111.todo.domain.Person;
import org.zerock.w111.todo.domain.TodoVO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {

    @Test
    public void connectiontest() throws Exception {
        Class.forName("org.mariadb.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/webdb",
                "webuser",
                "bitc5600"
        );
        Assertions.assertNotNull(conn);

        conn.close();
    }
    @Test
    public void persontest() throws Exception {
        Person person = new Person.PersonBuilder("John","Doe")
                .withAge(30)
                .withAddr("busan")
                .withPhoneNumber("123-4567")
                .build();

        System.out.println(person);

    }
}
