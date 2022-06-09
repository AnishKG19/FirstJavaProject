public class runfile {
    public static void main(String args[]){


    System.out.println("########################################");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    Student st = new Student();
    st.studentName("Anish Gupta");
    st.studentROllNo(11234);
    st.student_Department("Mathematics Science");
    st.student_address("Gorakhkpur");
    st.student_hostel("DhanrajGir");
    st.student_room(504);
    st.student_section("BA");
    st.get_sports("Cricket");
    st.get_club("FMC");
    st.displayOfStudent();
System.out.println();
System.out.println();
System.out.println();
    System.out.println("##############################33################################");
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("Displaying the Details of Studen Document");

    Document doc = new Document();
    doc.get_classX(98);
    doc.get_classXII(89);
    doc.get_JEERank(1275);
    doc.get_JEEApplicationNo("211240284633");
    doc.display();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("###################################################################");
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
        System.out.println("Professor Details:");

        professor pr = new professor();
        pr.set_name("Rajdeep Gupta");
        pr.set_age(45);
        pr.set_email("rajdeep213@gmail.com");
        pr.get_rating(10);
        pr.updateRating(10);
        pr.display();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("######################################################");

        System.out.println("############################");
        System.out.println();
        System.out.println();
        System.out.println();
        pr.get_subject("Maths");
        pr.get_experience(21);
        pr.get_qualification("Ph.D in Mathematics");
        pr.get_contact("937393023");
        pr.displayDetails();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("##################################################################");
        System.out.println();
        System.out.println();
        System.out.println();

        Academic ac = new Academic(15, "15 may to 22 may ", "23 july to 28 july", 5, 3, 7, "30 July");
        ac.AcademicDisplay();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("###################################################");

        System.out.println();
        System.out.println();
        System.out.println();

        Managment ma = new Managment();
        ma.Managmentname("Rajeev Singh");
        ma.ManagmentHostelIncharge("SN Bose");
        ma.ManagmentJoining(2008);
        ma.ManagmentMessIncharge("Raju Srivastav");
        ma.ManagmentAge(54);
        ma.Managmentfood("Pure Veg with Milk");
        ma.ManagmentContactNo("9453454573");
        ma.displayManagmentDetails();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("#########################################################");
    }

}
