public class Student{
    String Name;

    public int rollNo ;
    public String Department;
    public String Address;
    public String HostelName;
    public int roomNo ;
    public String section;
    public String sports;
    public String club;
    
    void studentName(String name){
        this.Name = name ;
    }

    void studentROllNo(int rollNo){
        this.rollNo = rollNo;
    }
    void student_Department(String Department){
        this.Department = Department;
    }
    void student_address(String Address){
        this.Address = Address;
    } 
    void student_hostel(String HostelName){
        this.HostelName = HostelName;
    }
    void student_room(int roomNo){
        this.roomNo = roomNo;
    }
    void student_section(String section){
        this.section = section;
    }
    void get_sports(String sports){
        this.sports = sports;
    }
    void get_club(String club){
        this.club = club;
    }
    
   

    public void displayOfStudent(){
        System.out.println("Name of the student is "+Name);
        System.out.println("roll no. of student is "+rollNo);
        System.out.println("Departmen of the student is "+ Department);
        System.out.println("Home of the student address is  " + Address);
        System.out.println("Hostel Name in which student stay is "+HostelName);
        System.out.println("Room No of the student is  "+ roomNo);
        System.out.println("Favourite Sports of the Student is  "+ sports);
        System.out.println("Club joined is  "+ club);
    }

}