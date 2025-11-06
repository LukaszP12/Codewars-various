package codewars6kyu;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class AggregationKata_6kyu {

    public static Map<String, Double> getAverageGradeByDepartment(Stream<Student> students) {
        return students.collect(Collectors.groupingBy(
                Student::getDepartment,
                Collectors.averagingDouble(Student::getGrade)
        ));
    }

    public static void main(String[] args) {
        Student galina = new Student("Galina", 95, "Philology", Student.Gender.FEMALE);
        Student anton = new Student("Anton", 90, "CS", Student.Gender.MALE);
        Student jack = new Student("Jack", 82, "Philology", Student.Gender.MALE);
        Student mike = new Student("Mike", 60, "Philology", Student.Gender.MALE);
        Student jane = new Student("Jane", 65, "CS", Student.Gender.FEMALE);

        Student[] students = {galina, anton, jack, mike, jane};
        System.out.println(getAverageGradeByDepartment(Arrays.stream(students)));
    }
}
