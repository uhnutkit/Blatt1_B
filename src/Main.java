// visibility of the class is ensured by the public-modifier
public class Main {
    // array is part of the type declaration, not the variable name, therefore it should be next to the type (here String)
    public static void main(String[] args){
        // order of variables within the object, needs to be the same as in the constructor "Person"
        //the object declaration starts with the name of the class; more information in Task A
        Person person = new Person("Maxi Mustermann", 42, 176);
        // in order to print something on the cosole, the entire syntax needs to be written down
        // Strings need to be put in quotation marks within the print-statement
        System.out.println(person.name + " is " + person.height + " cm tall.");
        // a block is marked within curly brackets
    }
}
