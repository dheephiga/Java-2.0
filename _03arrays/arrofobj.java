class Student
{
    int rollno;
    String name;
    int marks;
}

public class arrofobj {
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.rollno=1;
        s1.name="Navin";
        s1.marks=88;

        Student s2=new Student();
        s2.rollno=2;
        s2.name="Harsh";
        s2.marks=67;

        Student s3=new Student();
        s3.rollno=3;
        s3.name="Kiran";
        s3.marks=97;

        System.out.println(s1.name + ":"+ s1.marks);

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
//we are creating an array
        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].name+":"+students[i].marks);
        }
    }
}