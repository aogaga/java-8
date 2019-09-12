package lambda;
import coreval.CoreVal;
import coreval.Developer;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExamples {

    List<Developer> developerList = CoreVal.getDevelopers();

    //

    public void sortByAge(){

        //sorting with a comparator
        Collections.sort(developerList, new Comparator<Developer>(){

            public int compare(Developer a, Developer b){
                return a.getAge() - b.getAge();
            }
        });


        //sorting with lambda
        developerList.sort((Developer a, Developer b)-> a.getAge() - b.getAge());

        // lamda with valid, parameter type is otpional

        developerList.sort((a, b)-> a.getAge() - b.getAge());
    }


    public void sortByName(){

        // sorting with a comparator

        Collections.sort(developerList, new Comparator<Developer>(){
            public int compare(Developer a, Developer b){
                return a.getName().compareTo(b.getName());
            }
        });


        // sorting with lambda
        developerList.sort((a, b)-> a.getName().compareTo(b.getName()));

        //lambda with valid, parameter type is optional
        developerList.sort((a, b)-> a.getName().compareTo(b.getName()));
    }


    public void sortBySalary(){

        Collections.sort(developerList, new Comparator<Developer>(){
            public int compare(Developer a, Developer b){
                return a.getSalary().compareTo(b.getSalary());
            }
        });


        // with lambda
        developerList.sort((Developer a, Developer b)-> a.getSalary().compareTo(b.getSalary()));

        // lamda no parameters

        developerList.sort((Developer a, Developer b)->a.getSalary().compareTo(b.getSalary()));
    }
}
