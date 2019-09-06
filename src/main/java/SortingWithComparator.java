import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithComparator {

    public static  void main(String [] args){
        List<Developer> developerList = Developer.getDevelopers();

        System.out.println("before sort");

        for(Developer d : developerList){
            System.out.println(d.toString());
        }

        // Sort by age

       sortBySalary(developerList);

        System.out.println("=======================================================");
        System.out.println("After sort");

        for(Developer d : developerList){
            System.out.println(d.toString());
        }
    }

    private static void sortByAge(List<Developer> developerList) {
        Collections.sort(developerList, new Comparator<Developer>(){
            public int compare(Developer o1, Developer o2){
                return o1.getAge() - o2.getAge();
            }
        });
    }

    private static void sortByName(List<Developer> developerList){
        Collections.sort(developerList, new Comparator<Developer>(){

            public int compare(Developer o1, Developer o2){
                return o1.getName().compareTo(o2.getName());
            }
        });

    }

    private  static void sortBySalary(List<Developer> developerList){
        Collections.sort(developerList, new Comparator<Developer>(){

            public int compare(Developer o1, Developer o2){
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });
    }

}
