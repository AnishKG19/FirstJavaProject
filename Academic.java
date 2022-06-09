 class Academic {
    public int holiday; 
    public String midSem;
    public String endSem;
    public int quiz;
    public int viva;
    public int practical;
    public String result;
   public Academic(int holiday , String midSem , String endSem , int quiz  , int viva  , int practical , String result){
    this.holiday = holiday;
    this.midSem = midSem;
    this.endSem = endSem;
    this.quiz = quiz;
    this.viva = viva;
    this.practical =practical;
    this.result = result;
   }
   void AcademicDisplay(){
       System.out.println("No of holiday in session is: " + holiday);
       System.out.println("Mid sem will start on: " + midSem);
       System.out.println("End sem will start on :" + endSem);
       System.out.println("No of quiz will be :"+ quiz);
       System.out.println("practical exam  will start  on :"+ practical);
       System.out.println("Result will display on :"+ result);
   }
   
}
