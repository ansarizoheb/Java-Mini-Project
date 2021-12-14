
import java.util.Scanner;
import java.sql.*; public
class Student
{
    private int rollno; //secure
    private String name; //secure
    private float marks; //secure
    public int getRollNo()
    {
        return rollno;
    }
    public void setRollNo(int rollno)
    {
        this.rollno=rollno;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String myname)
    {
        name=myname;
    }
    public float getMarks()
    {
        return marks;
    }
    public void setMarks(float mymarks)
    {
        marks=mymarks;
    }
    public void addFaculty()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
            System.out.println("Connecting database...");
            Scanner sc=new Scanner(System.in);
            PreparedStatement stmt=con.prepareStatement("insert into student_table values(?,?,?)");
            System.out.println("Enter Faculty Data");
            System.out.println("Enter Roll no:");
            int rollno=sc.nextInt();
            System.out.println("Enter Name:");
            String name=sc.next();
            System.out.println("Enter Marks:");
            float marks=sc.nextFloat();
            stmt.setInt(1,rollno);//1 specifies the first
            // parameter in the query
            stmt.setString(2,name);
            stmt.setFloat(3,marks);
            int i=stmt.executeUpdate();
            System.out.println(i+" Records inserted");
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
    public void displayFaculty()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from student_table");
            while(rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
            con.close();
        }catch(Exception e){
            System.out.println(e);
            System.out.println("I think Database is OFF");
        }
    }
    public void deleteFaculty()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
            Scanner sc=new Scanner(System.in);
            PreparedStatement stmt=con.prepareStatement("delete from student_table where rollno=?");
            System.out.println("Enter Faculty Rollno");
            int rollno=sc.nextInt(); stmt.setInt(1,rollno);
            int i=stmt.executeUpdate();
            System.out.println(i+" Records Deleted");
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        Student s=new Student();
        System.out.println("Choose Database Operations");
        System.out.println("1------>Insert Data");
        System.out.println("2------>Display Data");
        System.out.println("3------>Delete Data");
        System.out.println("4------>Update Data");
        ch=sc.nextInt();
        if(ch==1)
            s.addFaculty();
        if(ch==2)
            s.displayFaculty();
        if(ch==3)
            s.deleteFaculty();
    }
}