import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.*;
public class JDBC1{
	public static void main(String[]args){
		try{
			//load class
			Class.forName("com.mysql.cj.jdbc.Driver");

			//creating a connection
			String url = "jdbc:mysql://localhost:3306/youtube";
			String username="root";
			String pass = "0109";
			Connection con =DriverManager.getConnection(url,username,pass);
			if(con.isClosed()){
				System.out.println("Connection is still closed");
			}
			else
			{
				System.out.println("Connection is created");
			}



			// creating a query
			// String q="create table table1(tId int primary key auto_increment not null,tName varchar(100) not null unique,tCity varchar(100) not null)";

			//create statement
			// Statement stmt = con.createStatement();
			// stmt.executeUpdate(q);
			// System.out.println("Created a table..");
			// con.close();




			//inserting data into table

			// String q="insert into table1(tName,tCity) values (?,?)";
			// PreparedStatement s = con.prepareStatement(q);
			
			// // set values to query
			// s.setString(1,"Harmeet" );
			// s.setString(2,"Batala" );

			// s.executeUpdate();

			// System.out.println("Inserted");




			// BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			// System.out.print("Enter name: ");
			// String name = br.readLine();
			// System.out.print("Enter your city: ");
			// String city = br.readLine();

			// String q="insert into table1(tName,tCity) values (?,?)";
			// PreparedStatement s = con.prepareStatement(q);
			
			// // set values to query
			// s.setString(1,name );
			// s.setString(2,city );

			// s.executeUpdate();

			// System.out.println("Inserted");



			//inserting image to database

			// String q ="insert into images(pic) values(?)";
			// PreparedStatement s =con.prepareStatement(q);

			// FileInputStream file=new FileInputStream("download.jfif");

			// s.setBinaryStream(1, file,file.available());
			// s.executeUpdate();
			// System.out.println("inserted image");





			//update data
			// String q ="update table1 set tName=? , tCity=? where tId = ?";
			// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// System.out.print("Enter new name: ");
			// String newName=br.readLine();
			// System.out.print("Enter your city: ");
			// String city=br.readLine();
			// System.out.print("Enter the id : ");
			// int id =Integer.parseInt(br.readLine());

			// PreparedStatement s= con.prepareStatement(q);
			// s.setString(1,newName);
			// s.setString(2,city);
			// s.setInt(3,id);
			// s.executeUpdate();


			// System.out.println("Updated succesfull");


			

			con.close();
			
		}
		catch(Exception e )
		{
			e.printStackTrace();
		}
	}
}