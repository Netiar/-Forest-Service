package dao;

import org.sql2o.Sql2o;


//use this to connect to the database
public class DB {
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://", "", "");

}