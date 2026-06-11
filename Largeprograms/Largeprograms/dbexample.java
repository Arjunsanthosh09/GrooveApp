
create database student;
use student;
create table details(
    id int primary key,
    name varchar(20)
);
insert into details values(1,'Arjun');
insert into details values(2,'Gowtham');


import java.sql.*;
public class dbexample {
    public static void main(String []arg){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
            System.out.println("Connection succesfull");
            String select="select * from details";
            PreparedStatement p=con.prepareStatement(select);
            ResultSet rs=p.executeQuery();
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                System.out.println("Id = "+id);
                System.out.println("Name ="+name);
            }
            String insert="insert into details values(?,?)";
            PreparedStatement p1=con.prepareStatement(insert);
            p1.setInt(1, 6);
            p1.setString(2, "Arjun Santhosh");
            p1.executeUpdate();
            System.out.println("Executed succesfully");
            
            String delete="delete from details where id =3";
            PreparedStatement p2=con.prepareStatement(delete);
            p2.executeUpdate();
            System.out.println("Deleted succesfully");
            
            String update="update details set name=Gowtham thulasi where id =2";
            PreparedStatement p3=con.prepareStatement(update);
            p3.executeUpdate();
            System.out.println("Update succesfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
