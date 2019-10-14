package za.ac.cput.sqldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import za.ac.cput.sqldemo.Domain.Topic;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TopicApp
{
   /* @Bean
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    } */

    public static void main( String[] args )
    {
        SpringApplication.run(TopicApp.class, args);



        System.out.println( "Home Run!" );
    //    TopicApp connection = new TopicApp();
      //  connection.createConnection();

    }

    /*public void createConnection()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql//localhost:3306/trialrun", "root", "");

            System.out.println("Connection Successful");
        }
        catch(ClassNotFoundException cnfe){
            System.out.println("Class was not found");
            Logger.getLogger(TopicApp.class.getName()).log(Level.SEVERE, null, cnfe);
        }
        catch(SQLException sqlex)
        {
            System.out.println("SQL error");
            Logger.getLogger(TopicApp.class.getName()).log(Level.SEVERE, null, sqlex);
        }
    }*/
}
