import java.util.List;

public class SortingWithLambda {
    public static void  main(String [] args){
        List<Developer> developerList = Developer.getDevelopers();

        System.out.println("before sort");

        for(Developer d : developerList){
            System.out.println(d.toString());
        }

        System.out.println("=======================================================");
        System.out.println("After sort");

        //sorting with lamda expressions


        sortByName(developerList);

        sortBySalary(developerList);

        // print list with lambda

        developerList.forEach(developer -> System.out.println(developer.toString()));

    }

    private static void sortBySalary(List<Developer> developerList) {
        developerList.sort((Developer x, Developer y)-> x.getSalary().compareTo(y.getSalary()));
    }

    private static void sortByName(List<Developer> developerList) {
        developerList.sort((Developer x, Developer y)-> {return x.getName().compareTo(y.getName());});
    }

    private static void sortByAge(List<Developer> developerList) {
        developerList.sort((Developer x, Developer y)-> x.getAge() - y.getAge());
    }


}
