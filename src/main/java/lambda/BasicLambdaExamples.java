package lambda;
import coreval.Developer;
import coreval.CoreVal;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BasicLambdaExamples {


    public static void  main(String [] args){
        basicExamples();
    }

    /**
     *
     */
    public static void basicExamples(){
        String [] states = CoreVal.states;
        List<String> naijaStates = Arrays.asList(states);

        //old looping

        for (String s: states){
            System.out.println(s);
        }

        // looping using lamda expression and functional operator

        System.out.println("----+++++++++++++++++++++++++++ looping ++++++++++++++++++++++++++++++");
        naijaStates.forEach(x->System.out.println(x));



        System.out.println("----+++++++++++++++++++++++++++ looping using double colon operator ++++++++++++++++++++++++++++++");

        naijaStates.forEach(System.out::println);


    }


    /**
     * using lamda for handling events
     */


    public static void mtdHandlingCode(){

//        btn.setOnAction(new EventHandler<ActionEvent>(){
//            public void handle(ActionEvent event){
//                System.out.println("hello fool");
//            }
//        });
//

        //btn.setOnAction(event->System.out.println("Hello fool"));

    }


    /**
     * writing runnable threads with lambdas
     */


    public static  void threadHandlingWithLambda(){
        //using anonymous innerclass
        Thread thread = new Thread(new Runnable() {
            public void run() {
                System.out.println("Hello fool");
            }

        });

        thread.start();

        // Using Lambda expressions
            new Thread(()-> System.out.println("hello fool"));

        // Using anonymous innerclass
        Runnable race1 = new Runnable(){
            public void run() {
                System.out.println("Hello fool");
            }
        };


        Runnable race2 = ()-> System.out.println("hello fool");
    }


    /**
     * sorting collections with lambda
     *
     */

    public static  void sortCollection(){
        String[] countries = CoreVal.countries;

        Arrays.sort(countries, new Comparator<String>(){
            public int compare(String s1, String s2){
                return s1.compareTo(s2);
            }
        });

        Comparator<String> sortByName = (String s1, String s2)-> s1.compareTo(s2);
        Arrays.sort(countries, sortByName);
    }

}
