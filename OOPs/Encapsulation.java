public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Vikram Kautlya");
        System.out.println("Student name is: " + s1.getName());
        
    }
}

class Student {
    private String name ;


    public void setName(String newName) {
        this.name = newName;
    }
    public String getName(){
        return name ;
    }
}





