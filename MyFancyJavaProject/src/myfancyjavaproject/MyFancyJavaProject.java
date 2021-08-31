/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfancyjavaproject;

/**
 *
 * @author Shourav
 */
class DbConnection{

    private static DbConnection instance=null;

    private DbConnection(String dbUser,String dbPassword,String dbName ) { 
    	SQLConnection connection = new SQLConnection(dbUser, dbPassword, dbName);
   }


	public static DbConnection getDbConnection(String dbUser,String dbPassword,String dbName) {
      if (instance== null ) 
		instance = new DbConnection(dbUser,dbPassword,dbName) ;                           

      return instance;
    }
}

class SQLConnection {
	
	String dbUser;
	String dbPassword;
	String dbName;
	
	public SQLConnection(String dbUser, String dbPassword, String dbName) {
		super();
		this.dbUser = dbUser;
		this.dbPassword = dbPassword;
		this.dbName = dbName;
	}
	

}


public class MyFancyJavaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("MyFancyJavaProject");
        String dbUser="admin";
	String dbPassword="admin";
	String dbName="tesDb";
	DbConnection connection=DbConnection.getDbConnection(dbUser, dbPassword, dbName);
    }
    
}
