//visibility of the class is ensured by the public-modifier
public class Person {
    // String has to start with a capital "S"
    String name;
    // at the end of every statement, a semicolon is required
    int age;// age in years
    int height; // height in centimeter


    // data type of height needs to be named
    // to ensure compiling of the program, a constructor is needed; void is not the correct syntax of a constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        // == is the conventional equals symbol, while = assigns the value to the variable
        this.height = height;
    }
}
