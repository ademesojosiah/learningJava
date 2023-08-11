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


import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

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
//
//        String name = "josiah";
//
//        System.out.println(name.toUpperCase());
//
//        LocalDate now = LocalDate.now();
//
//        System.out.println(now);
//        System.out.println(now.getMonth());
//
//        Person alex = new Person("alex");
//        Person mariam = alex;
//
//        System.out.println(alex.name + "---" + mariam.name);
//
//        mariam.name = "marry";
//        System.out.println("after changing name");
//
//        System.out.println(alex.name + "---" + mariam.name);
//
//    }
//
//    static class Person{
//        String name ;
//        Person( String name){
//            this.name = name;
//        }
//    }
//        System.out.println(Math.abs(-10));
//        System.out.println(Math.max(3.6,10.11));
//        System.out.println(Math.min(6,10));
//        System.out.println((int) Math.pow(5,2));
//        System.out.println((int) Math.sqrt(25));
//
//        System.out.println(isAdult || isStudent);

//        int age = 17;
//        String message = age >= 18 ? "hooray... I am an adult" :" I am not an Adult";
//        System.out.println(message);

//        switch (message.toUpperCase()) {
//            case "FEMALE" -> System.out.println("I am a female");
//            case "MALE" -> System.out.println("I am a male");
//            default -> System.out.println("i prefer not  to speak");
//        }





//        String [] names = {"Anna", "Ali", "Bob", "Mike"};

//        for(String name : names){
//            if(name.equals("Bob")){
//                break;
//            }
//            System.out.println(name);
//        }
//
//
//
//
//        for(String name : names){
//            if(name.startsWith("A")){
//                continue;
//            }
//            System.out.println(name);
//        }

//        int count = 100;
//
//        while(count <= 20){
//            System.out.println("count" + count);
//            count++;
//        }
//
//        do{
//            System.out.println("count" + count);
//            count++;
//        }while (count <= 20);

        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("you were born in " + year);

    if(age< 18){
        System.out.println("you are not an Adult :(");
    }else{
        System.out.println("you are an Adult :)");
    }


        }
}