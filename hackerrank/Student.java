import java.util.*;

class Student extends Person{
 private int[] testScores;
 private int id;
 Student(String firstName,String lastName,int id,int[] scores){
     super(firstName,lastName,id);
     this.testScores=scores;     
 }
 
 public char calculate(){
     int ave=0;
     int len=testScores.length;
     for(int i=0;i<len;i++)
         ave+=testScores[i];
     ave /=len;
     
     char grade;
     
     if(ave <40)
         grade='T';
     else
     {
         if(ave<55)
             grade='D';
         else{
             if(ave<70)
                 grade='P';
             else{
                 if (ave<80)
                     grade='A';
                 else{
                     if(ave<90)
                         grade='E';
                     else
                     {
                         grade='O';
                     }//90
                 }//80
             }//70
                 
         }//55
             
     }//else ,40
      return grade;   
 }//calculate
 
 
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  String firstName = scan.next();
  String lastName = scan.next();
  int id = scan.nextInt();
  int numScores = scan.nextInt();
  int[] testScores = new int[numScores];
  for(int i = 0; i < numScores; i++){
   testScores[i] = scan.nextInt();
  }
  scan.close();
  
  Student s = new Student(firstName, lastName, id, testScores);
  s.printPerson();
  System.out.println("Grade: " + s.calculate());
 }
}//class