package Ex2;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class TestStudent {
    public static void main(String[] args) {
        String [] names={"Jack","Daniel","Amy"};

        int numGrades=Integer.parseInt(JOptionPane.showInputDialog("How many grades?"));

        Random random=new Random();
        Student[] classroom=new Student[names.length];

        for (int i=0;i<classroom.length;i++)
        {
            int [] grades=new int[numGrades];

            for (int j=0;j<numGrades;j++)
            {
                grades[j]=random.nextInt(40,101);
            }
            classroom[i]=new Student(names[i],grades);
        }
         print(classroom);
        sort(classroom);
        print(classroom);
        }
        public static void print(Student[] c1){
        for (int i=0;i<c1.length;i++)
            c1[i].printStudent();
        }

        public static void sort(Student[] classroom){
        for (int i=0;i<classroom.length;i++) {
            Student CurrentMin = classroom[i];

            int currentMinIndex = i;
            for (int j=i+1;j<classroom.length;j++) {
                if(classroom[j].getAverage()<CurrentMin.getAverage())
                {
                    CurrentMin=classroom[j];
                    currentMinIndex=j;
                }
            }
            if (currentMinIndex != i)
            {
                classroom[currentMinIndex]=classroom[i];
                classroom[i]=CurrentMin;
            }
        }
    }
}

