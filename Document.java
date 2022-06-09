public class Document extends Student  {
    public int classX;
    public int classXII;
    public int JEERank;
    public String JEEApplicationNo;

    void get_classX(int classX){
        this.classX = classX;
    }
    void get_classXII(int classXII){
        this.classXII =  classXII;
    }
    void get_JEERank(int JEERank){
        this.JEERank = JEERank;
    }
    void get_JEEApplicationNo(String jEEApplicationNo){
        this.JEEApplicationNo = jEEApplicationNo;
    }

    void display(){
        System.out.println(" Percentage in class X is "+ classX);
        System.out.println(" Percentage in class XII is "+ classXII);
        System.out.println("JEE rank is "+ JEERank);
        System.out.println("Application Number in JEE is : "+ JEEApplicationNo);
    }
    
}

