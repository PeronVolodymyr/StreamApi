import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person(11, "Vova"),
                new Person(11, "Vova"),
                new Person(19, "Zoxa"),
                new Person(21, "Zoxa"),
                new Person(23, "Denis"),
                new Person(5, "Roma"),
                new Person(5, "Roma"),
                new Person(21, "Olexa"),
                new Person(99, "Petro"),
                new Person(1, "Zoxa"),
                new Person(23, "Zoxa"),
                new Person(23, "Zoxa")
        ));

//        list.stream()
//                .forEach(p->System.out.println(p));
//
//        list.stream()
//                .forEach(System.out::println);

//        list.stream()
//                .filter(p -> p.getAge() > 17)
//                .forEach(System.out::println);

//        list.stream()
////                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
//                .sorted(Comparator.comparing(Person::getName).thenComparing(Person::getAge))
//                .forEach(System.out::println);

//        List<Person> secondList = list.stream()
//                .filter(p->!p.getName().equals("Zoxa"))
//                .collect(Collectors.toList());
//        secondList.stream()
//                .forEach(System.out::println);


//        Map<Boolean, List<Person>> myMap = list.stream()
//                .filter(p -> p.getAge() > 22)
//                .collect(Collectors.groupingBy((Person p) -> p.getName().equals("Zoxa")));
//        System.out.println(myMap);

//        Person person = list.stream()
//                .filter(p->p.getName().equals("Zoxa") && p.getAge() > 22)
//                .findAny()
//                .orElse(null);
//        System.out.println(person);

//            list.stream()
//                    .filter(p->p.getAge()>20)
//                    .map(p->p.getName())
//                    .forEach(System.out::println);

//          List<Person> listWithoutDuplicate = list.stream()
//                .distinct()
//                .collect(Collectors.toList());
//          listWithoutDuplicate.forEach(System.out::println);

//          list.stream()
//                .distinct()
//                .forEach(System.out::println);
//            list.stream()
//                    .map(s -> s + "_1")
//                    .forEach(System.out::println);

//          list.stream()
//                .map(s -> s + "_1")
//                .filter(s -> s.equals("Person{age=11, name='Vova'}_1"))
//                .forEach(System.out::println);

//        list.stream()
//                .forEach(p->p.myFunc());
//        System.out.println(list);

//        list.stream()
//                .limit(3)
//                .forEach(System.out::println);

//        int sumOfYear = list.stream()
//                .mapToInt(p->p.getAge())
//                .sum();
//        System.out.println(sumOfYear);

//       Person p = list.stream()
//                .max(Comparator.comparing(person -> person.getAge()))
//               .get();
//        System.out.println(p);

//        Person person = list.stream()
//                .min(Comparator.comparing(p->p.getName()))
//                .get();
//        System.out.println(person);

//        double averageAge = list.stream()
//                        .mapToInt(p->p.getAge())
//                        .average()
//                        .getAsDouble();
//        System.out.println(averageAge);


    }
}
