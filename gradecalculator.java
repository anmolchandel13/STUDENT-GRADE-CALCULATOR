// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class GradeCalculator {
   public GradeCalculator() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the number of subjects: ");
      int var2 = var1.nextInt();
      int var3 = 0;

      for(int var4 = 1; var4 <= var2; ++var4) {
         System.out.print("Enter marks for subject " + var4 + " (out of 100): ");
         var3 += var1.nextInt();
      }

      double var7 = (double)var3 / (double)var2;
      char var6;
      if (var7 >= 90.0) {
         var6 = 'A';
      } else if (var7 >= 75.0) {
         var6 = 'B';
      } else if (var7 >= 50.0) {
         var6 = 'C';
      } else {
         var6 = 'F';
      }

      System.out.println("\nResults:");
      System.out.println("Total Marks: " + var3);
      System.out.println("Average Percentage: " + var7 + "%");
      System.out.println("Grade: " + var6);
      var1.close();
   }
}
