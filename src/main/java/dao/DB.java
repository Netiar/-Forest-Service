package dao;

import org.sql2o.Sql2o;



public class DB {
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://ec2-3-231-82-226.compute-1.amazonaws.com:5432/d75j5j922j2u8t", "rdoiuanvzefbhi", "b02f26406f34fce6da99a0e50af317cecc569208d969a24f87937d1dae61d1f4");
//    public static Sql2o sql2o = new  Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "moringa", "access" );

}








