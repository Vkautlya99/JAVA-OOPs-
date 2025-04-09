public class MethodOverride {
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();

        f.property(); // Father's property
        s.property(); // This is Son Property
        Father f1 = new Son();
        f1.property(); // This is Son Property
        // f1.property(); // This is Son Property
        // Son s1 = new Father(); // Compile time error
        
    }
}


class Father{
    void property(){
        System.out.println("Father's property");
    }
}
class Son extends Father{
    @Override
    void property(){
        System.out.println("This is Son Property ");
    }
}



