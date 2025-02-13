package singleton;

public class SingletonMain {

    public static void main(String[]arg){
/*
        MongoDBClient mongoDBClient = MongoDBClient.getClient();
        System.out.println(mongoDBClient.getData());
        MongoDBClient mongoDBClient2 = MongoDBClient.getClient();
        System.out.println(mongoDBClient2.getData());
        MongoDBClient mongoDBClient3 = MongoDBClient.getClient();
        System.out.println(mongoDBClient3.getData());

*/


        MySqlSingleton mySqlSingleton = (MySqlSingleton) MySqlSingleton.getConnection();
        System.out.println(mySqlSingleton.getConnection());

        MySqlSingleton mySqlSingleton2 = (MySqlSingleton) MySqlSingleton.getConnection();
        System.out.println(mySqlSingleton2.getConnection());

    }
}
