package singleton.lazyInstantiation;

import java.sql.*;

public class DBManager {
    private static  DBManager dbManager;
    private static Connection connection;

    private DBManager(){}

    public static DBManager getInstance() {
        if(dbManager==null)
            dbManager = new DBManager();
        return dbManager;
    }

    public Connection getConnection() throws SQLException {
        connection=null;
        if(connection==null){
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcExample","root","root_sk");
        }
        return connection;
    }

    public int insert(int id, String name, String pass) throws SQLException {
        int count=0;
        PreparedStatement ps=null;
        try {
            connection=this.getConnection();
            ps=connection.prepareStatement("insert into userdata(uid,uname,upassword)values(?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, pass);
            count=ps.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            if (ps!=null)
                ps.close();
            if(connection!=null)
                connection.close();
        }
        return count;
    }

    public  void view() throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection=this.getConnection();
            ps=connection.prepareStatement("select * from userdata order by uid");
            rs=ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int colCount=rsmd.getColumnCount();
            for(int i=1;i<=colCount;i++)
                System.out.print(rsmd.getColumnLabel(i)+"\t\t");
            System.out.println();
            while (rs.next()) {
                for(int i=1;i<=colCount;i++)
                    System.out.print(rs.getString(i)+"\t\t");
                System.out.println();
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally{
            if(rs!=null)
                rs.close();
            if (ps!=null)
                ps.close();
            if(connection!=null)
                connection.close();
        }
    }

}

