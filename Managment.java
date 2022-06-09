public class Managment {
    protected String warden;
    protected String HostelIncharge;
    public int age;
    public int joining;
    public String messIncharge;
    public String food;
    protected String ContactNo;


    void Managmentname(String warden){
        this.warden = warden;
    }
    void ManagmentHostelIncharge(String hostelIncharge){
        this.HostelIncharge = hostelIncharge;
    }
    void ManagmentAge(int age){
        this.age = age;
    }
    void ManagmentJoining(int joining){
        this.joining = joining;
    }
    void ManagmentMessIncharge(String messIncharge){
        this.messIncharge = messIncharge;
    }
    void Managmentfood(String food){
        this.food = food;
    }
    void ManagmentContactNo(String ContactNo){
        this.ContactNo = ContactNo;
    }

    void displayManagmentDetails(){
        System.out.println("Name of the warden is "+ warden);
        System.out.println("Warden is incharge of  "+ HostelIncharge);
        System.out.println("Age of the warden is "+age);
        System.out.println("Joining of the warden is " + joining);
        System.out.println("Mess Incharge is "+messIncharge);
        System.out.println("Food serve in the mess is "+food);
        System.out.println("Contact No of warden is "+ContactNo);

        
    }

    
}
