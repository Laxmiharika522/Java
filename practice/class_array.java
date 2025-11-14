class Student{
    String name;
    int rollno;
    int marks;
}
public class class_array {
    public static void main(String a[]){
        Student s1=new Student();
        s1.name="harika";
        s1.rollno=1;
        s1.marks=99;

        Student s2=new Student();
        s2.name="Santhu";
        s2.rollno=10;
        s2.marks=100;

        Student s3=new Student();
        s3.name="laxmi";
        s3.rollno=11;
        s3.marks=99;

        //System.out.println(s1);//it will give address
        //System.out.println(s1.name)//it will give harika

        //int nums[]=new int[3];
        //we are not creating 3 student objects we are creating an array which can hold 3 student references
        //it wont create objects itself.We have manually create the objects and assign to an array 
        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        //the use of students array is we can print all the students data at a time

        
        // for(int i=0;i<students.length;i++){
        //     System.out.println(students[i].name + " : "+ students[i].rollno + " : "+ students[i].marks); //concatination happens
        // }

        //enhanced for loop
        for(Student n: students){//here data type is Student
            System.out.println(n.name + " : " + n.rollno + " : " + n.marks);

        }
    }
}
