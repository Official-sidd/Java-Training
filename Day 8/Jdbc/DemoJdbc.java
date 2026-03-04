import java.sql.*;
public class DemoJdbc {
    public static void main(String[] args) throws Exception {

        String url="jdbc:postgresql://localhost:5432/demo";
        String uname="postgres";
        String pass="your_password";
//        String sql="select sname from student where sid=1";

        int sid=6;
        String sname="Shanta";
        int marks = 70;

        String sql="insert into student values (?,?,?)"; //write the query you want to run
//        String sql="update student set sname='Max' where sid=5";
//        String sql="delete from student where sid=5";
//        String sql="insert into student values (" + sid + ",'" + sname + "'," + marks +")";

        //this is for making the connection to the database
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");

//        Statement st = con.createStatement();
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,marks);
        st.execute();
//        boolean status = st.execute(sql);
//        System.out.println(status);
//        ResultSet rs= st.executeQuery(sql); //this is used when we want to get data

        //this is for when we want to display single column contents
//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println("Name of the student is "+name);
//        System.out.println(rs.next());

        //this is for when we want to display all the table contents
//        while(rs.next()){
//            System.out.print(rs.getInt(1) + "-");
//            System.out.print(rs.getString(2)+ "-");
//            System.out.println(rs.getInt(3));
//        }



        //this is to close the connection
        con.close();
        System.out.println("Connection Closed");
    }}
