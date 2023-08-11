//// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
//// then press Enter. You can now see whitespace characters in your code.
//public class Main {
//    public static void main(String[] args) {
//        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
//    }
//}

import java.time.LocalDate;

public class Main{
    public static void main(String [] args){
//    byte number = 100;
//    short  theShort = 31_000;
//    int theInt = 1_000_000;
//    long theLong = 2_000_000_000_000L;
//
//    float pi = 3.14f;
//    double doublePi = 3.142;
//
//    boolean isAdult = true;
//    char nameInitial = 'A';
//
//        System.out.println(number);
//        System.out.println(theShort);
//        System.out.println(theInt);
//        System.out.println(theLong);
//        System.out.println(pi);
//        System.out.println(doublePi);
//        System.out.println(isAdult);
//        System.out.println(nameInitial);

        String name = new String("josiah");

        System.out.println(name.toUpperCase());

        LocalDate now = LocalDate.now();

        System.out.println(now);
        System.out.println(now.getMonth());

        Person alex = new Person("alex");
        Person mariam = alex;

        System.out.println(alex.name + "---" + mariam.name);

        mariam.name = "marry";
        System.out.println("after changing name");

        System.out.println(alex.name + "---" + mariam.name);

    }

    static class Person{
        String name ;
        Person( String name){
            this.name = name;
        }
    }
}