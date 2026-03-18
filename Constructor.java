public class Constructor {

    /*There are three types of constructors. 1.no parameter, 2.Parameterized, 3, Copy Constructor
      When implimented copy constructor the objects are just reffers thats shallow copy, we need to implement 
      different approch for deep copy them */
      public static void main(String[] args) {
        

        Student s1 = new Student();
        Student s2 = new Student("Sifar", 1);
        s2.marks[0] = 70;
        s2.marks[1] = 80;
        s2.marks[2] = 90;
        Student s3 = new Student(2);
        Student s4 = new Student(s2);
        s2.marks[2] = 100;

        // marks changed because of shallow copying. When use deep copy marks doesn't changed 
        for(int i=0; i<s4.marks.length;i++)
        {
            System.out.println(s4.marks[i]);
        }
        
      }
}

class Student{
    String name;
    int roll;
    int marks[];

    Student(){
        System.out.println("No parameter is constructed");
    }

    // Parameterized Constructor
    Student(String name, int roll){
        marks = new int[3];
        this.name = name;
        this.roll = roll;

    }

    Student(int roll){
        this.roll = roll;
    }

    // Copy Constructor
    //shallow copy
    // Student(Student s1){ 
    //     this.marks = s1.marks;
    //     this.name = s1.name;
    //     this.roll = s1.roll;

    //     for(int i=0; i<marks.length;i++){
    //         System.out.print(marks[i]+" ");
    //     }
    //     System.out.println();
    // }

    // Deep copy
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        marks = new int[3];

        for(int i=0; i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }
}