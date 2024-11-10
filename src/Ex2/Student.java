package Ex2;

public class Student {

    private String name;
    private int [] grades;
    public Student(String n, int [] gs) {
        name = n;
        grades=gs;
    }
    public double getAverage(){
        int sum=0;
        for (int grade: grades) {
            sum += grade;
        }
            return sum/grades.length;

    }
    public void printStudent(){
        String line=String.format("%-15s ", name);
        for (int grade: grades) {
            line += String.format("%-10s ", grade);
        }
            line+=String.format("%8.2f ", getAverage());

            System.out.println(line);

    }
    public String getName(){
        return name;
    }
    public int[] getGrades(){
        return grades;
    }
    public void setName(String n){
        name = n;
    }
    public void setGrades(int[] gs){
        grades=gs;
    }

}
