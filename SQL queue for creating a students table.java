CREATE TABLE students (
    student_id INT PRIMARY KEY,
    roll_no INT,
    name VARCHAR(50),
    age INT,
    date_of_birth DATE,
    email_id VARCHAR(100),
    phone_number VARCHAR(15) NOT NULL,
    address VARCHAR(100)
);

INSERT INTO students VALUES
(1, 101, 'Gayathri', 20, '2006-04-22', 'gayathri@gmail.com', '9876543210', 'Bangalore');

INSERT INTO students VALUES
(2, 102, 'Priya', 21, '2005-08-15', 'priya@gmail.com', '9876543211', 'Mysore');

INSERT INTO students VALUES
(3, 103, 'Rahul', 20, '2006-01-10', 'rahul@gmail.com', '9876543212', 'Tumkur');

JAVA CODE 
import java.sql.*;

public class Students {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "password"
            );

            Statement st = con.createStatement();

            st.executeUpdate("CREATE TABLE students (" +
                    "student_id INT PRIMARY KEY, " +
                    "roll_no INT, " +
                    "name VARCHAR(50), " +
                    "age INT, " +
                    "date_of_birth DATE, " +
                    "email_id VARCHAR(100), " +
                    "phone_number VARCHAR(15) NOT NULL, " +
                    "address VARCHAR(100))");

            st.executeUpdate("INSERT INTO students VALUES " +
                    "(1, 101, 'Gayathri', 20, '2006-04-22', 'gayathri@gmail.com', '9876543210', 'Bangalore')");

            st.executeUpdate("INSERT INTO students VALUES " +
                    "(2, 102, 'Priya', 21, '2005-08-15', 'priya@gmail.com', '9876543211', 'Mysore')");

            st.executeUpdate("INSERT INTO students VALUES " +
                    "(3, 103, 'Rahul', 20, '2006-01-10', 'rahul@gmail.com', '9876543212', 'Tumkur')");

            System.out.println("Table created and records inserted successfully");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
