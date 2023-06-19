class Student{
    
    int rollno;
    String name;
    double marks;

    //rollno
    public void getRollno(int rollno){
        this.rollno = rollno;
    }
    public void setRollno(){
        System.out.println(rollno);
    }
    
    //name
    public void getname(String name){
        this.name = name;
    }
    public void setname(){
        System.out.println(name);
    }

    //marks
    public void getmarks(double marks){
        this.marks = marks;
    }
    public void setmarks(){
        System.out.println(marks);
    }  
   
    //all in one display
    public void presenter(){
        System.out.println(rollno + " " + name + " " + marks);
    
    }
}

public class students{
    public static void main(String[] args){
        
        Student kid1 = new Student();
        Student kid2 = new Student();
        Student kid3 = new Student();

        kid1.getRollno(101);
        kid1.getname("Dumb Kid");
        kid1.getmarks(69.01);
        
        kid2.getRollno(102);
        kid2.getname("Sigma Kid");
        kid2.getmarks(75.08);

        kid3.getRollno(103);
        kid3.getname("Rooted Kid");
        kid3.getmarks(45.78);

        
        kid1.presenter();
        kid2.presenter();
        kid3.presenter();

    }
}
