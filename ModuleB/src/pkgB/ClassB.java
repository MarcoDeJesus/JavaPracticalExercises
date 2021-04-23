package pkgB;

import pkgA.ClassA;
import pkgC.ClassC;

public class ClassB {

    public static void main(String args[]){
        ClassA test = new ClassA();
        System.out.println(test.yearPublic);
        System.out.println(ClassC.transitiveVar);
    }
}
