
create database student;
use student;
create table details(
    id int primary key,
    name varchar(20)
);
insert into details values(1,'Jefin');
insert into details values(2,'Aromal');

import java.sql.*;
import java.util.Scanner;
public class dbexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student",
                    "root",
                    "");
            System.out.println("Connection Successful");

            String select = "SELECT * FROM details";
            PreparedStatement ps = con.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            System.out.println("\nCurrent Records:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " +rs.getString("name"));
            }
            System.out.print("\nDo you want to insert a record? (yes/no): ");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("yes")) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                String insert = "INSERT INTO details VALUES(?, ?)";
                PreparedStatement p1 = con.prepareStatement(insert);
                p1.setInt(1, id);
                p1.setString(2, name);
                p1.executeUpdate();
                System.out.println("Record Inserted Successfully");
            }
            System.out.print("\nDo you want to update a record? (yes/no): ");
            choice = sc.next();
            if (choice.equalsIgnoreCase("yes")) {
                System.out.print("Enter ID to update: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter New Name: ");
                String name = sc.nextLine();
                String update = "UPDATE details SET name=? WHERE id=?";
                PreparedStatement p2 = con.prepareStatement(update);
                p2.setString(1, name);
                p2.setInt(2, id);
                p2.executeUpdate();
                System.out.println("Record Updated Successfully");
            }
            System.out.print("\nDo you want to delete a record? (yes/no): ");
            choice = sc.next();
            if (choice.equalsIgnoreCase("yes")) {
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();
                String delete = "DELETE FROM details WHERE id=?";
                PreparedStatement p3 = con.prepareStatement(delete);
                p3.setInt(1, id);
                p3.executeUpdate();
                System.out.println("Record Deleted Successfully");
            }
            System.out.println("\nFinal Records:");
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
