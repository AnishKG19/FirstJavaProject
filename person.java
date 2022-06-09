abstract class person {
    public String name;
    public int age;
    public String email;


    void set_name(String name){
        this.name = name;
    }
    void set_age(int age){
        this.age = age;
    }
    void set_email(String email){
        this.email = email;
    }
    void display(){
        System.out.println("Name of the professor is: "+ name);
        System.out.println("Age of the professor is : "+ age);
        System.out.println("email of the professor is : "+ email);
    }
    
}
class professor extends person{
    public String subject;
    public int experience ;
    public String qualification;
    public String contact;
    public int rating;
    void get_subject(String subject ){
        this.subject = subject;
    }
    void get_experience(int experience){
        this.experience = experience;
    }
    void get_qualification(String qualification){
        this.qualification = qualification;
    }
    void get_contact(String contact){
        this.contact = contact;
    }
    void get_rating(int rating){
        this.rating = rating;
    }

    void updateRating(int rating){
        if(rating>9){
            System.out.println("Rating of the professor is best and had good experience");
        }
        else{
            System.out.println("Rating of the professor is average and is decent at teaching");
        }
    }

    void displayDetails(){
        System.out.println("Subject teach by the professor is"+subject);
        System.out.println("Experince of the professor is  "+ experience + " Year");
        System.out.println("Qualification of the professor is "+ qualification);
        System.out.println("Contac number of the professor is " + contact);
    }

}
