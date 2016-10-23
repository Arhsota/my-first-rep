/**
 * Andrey Sevastyanov, author 23/10/2016 homework  for lesson6, Java 1
 * point 1 (concating) and 2 (finding substring)
 */
import java.io.*;

public class Lesson6 {
    public static void main(String[] args) {
        new Lesson6().work();
    }

     public void work() {
       String file1 = "";
       String file2 = "";
       String total;
       String file_name1 = "C:\\Users\\master\\IdeaProjects\\Lesson6\\src\\Test.java";
       String file_name2 = "C:\\Users\\master\\IdeaProjects\\Lesson6\\src\\TicTacToe.java";
       String myFind = "class";    // point 2 of Homework, searching for word

       total = rdFile(file_name1);
       total = total + rdFile (file_name2);   //Homework point 1, concating two files
       System.out.print (total);
       if (total.contains(myFind)) {
           System.out.println ("There is such a word : " + myFind);
       }
       else {
           System.out.println ("There is NO such a word : " + myFind);
       }
     }

      String rdFile(String flName){
          String fileN = "";
         try {
             FileInputStream reader = new FileInputStream(flName);
             int x = -1;
             do {
                 x = reader.read();
                 fileN += String.valueOf((char) x);
             } while(x != -1);
         } catch(IOException e) { e.printStackTrace(); }
           return fileN;
     }
    }


