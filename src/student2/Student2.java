package student2;
import java.util.Scanner;
/**
 *
 * @author Rich Smith at ZenOfProgramming.com
 */
public class Student2
{
   private int id;
   private String name;
   //LL

   /**
    * @param args the command line arguments
    */
   public static void main (String[] args)
   {




      Student2 s = new Student2();
      Student2[] list = new Student2[5];
//        list[0].id=10;
//        list[0].name="Megha";
      Scanner in = new Scanner(System.in);

      for (int i = 0; i <= list.length - 1; i++) {
         list[i] = new Student2();
         System.out.print("Enter student id: ");
         list[i].id = in.nextInt();
         System.out.print("Enter student name: ");
         list[i].name = in.next();

      }

      for (int i = 0; i <= list.length - 1; i++) {
         System.out.print("student id: " + list[i].id + "student name:" + list[i].name + "\n");

      }

   }

   public void setId (int id)
   {
      this.id = id;
   }

   public void setName (String name)
   {
      this.name = name;
   }

   public int getId ()
   {
      return id;
   }

   public String getName ()
   {
      return name;
   }
}
