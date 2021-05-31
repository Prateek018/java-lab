import java.sql.*;

class database {
        public static void main(String[] args){
            try {
            String dbUrl="jdbc:mysql://localhost:3306/student";

            String username =  "root";
            String password = "Prateek$2001";
            Connection myConnection = DriverManager.getConnection(dbUrl, username , password);

            Statement myStatement = myConnection.createStatement();
            
            ResultSet myResultSet = myStatement.executeQuery("select * from students");

            
            while (myResultSet.next()){
                System.out.println("Student Full Name: " + myResultSet.getString("firstname")+" "+myResultSet.getString("lastname"));}

            }
            catch (Exception e) {
            System.out.println(e.getMessage());}
        }
}
