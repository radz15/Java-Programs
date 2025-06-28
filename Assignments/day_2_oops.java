import java.util.Arrays;


//step -2 create class
abstract class Student{
    private String Name;
    private int[] Marks;

    // step-3 create constructor
    public Student(String Name, int[] Marks){
        this.Name = Name;
        this.Marks = Marks;
    }

    public abstract void displayDetails();

    // Step -4 encapsulation
    public String getName() {
        return Name;
    }
    public void setName() {
        this.Name = Name;
    } 
    public int[] getMarks() {
        return Marks;
    }
    public void setMarks() {
        this.Marks = Marks;
    }

    // Calculate average
    public double average() {
        int sum = 0;
        for (int mark : Marks)
        {
            sum += mark;
        }
        return (double) sum / Marks.length;
    }

    public char calculateGrade() {
        double avg = average();
        if(avg>=90)
        {
            return 'A';
        }
        else if(avg<90 && avg>=80)
        {
            return 'B';
        }
        else if(avg<80 && avg>=70)
        {
            return 'C';
        }
        else if(avg<70 && avg>=60)
        {
            return 'D';
        }
        else 
        {
            return 'F';
        }
    }
}



class underGraduate extends Student{
    public underGraduate(String Name, int[] Marks){
        super(Name, Marks);
    }
    @Override
    public void displayDetails(){
        System.out.println("Student Name: "+ getName());
        System.out.println("Marks of student: " + Arrays.toString(getMarks()));
        System.out.printf("Average: %.2f\n", average());
        System.out.println("Grade: " + calculateGrade());
    }
} 



// step 1 - main function
public class day_2_oops{
    public static void main(String[] args){
        Student under = new underGraduate("Radhika", new int[]{90, 85, 78, 98, 89});

        under.displayDetails();
        under.average();
        under.calculateGrade();

    }
}