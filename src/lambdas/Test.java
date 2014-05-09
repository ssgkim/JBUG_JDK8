/*
 * Copyright (c) 2014. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package lambdas;
import java.util.List;

/**
 * Created by gon on 2014. 5. 9..
 */
public class Test {
    public static void printPersonsOlderThan(List<Person> roster, int age) {
            for (Person p : roster) {
                if (p.getAge() >= age) {
                    p.printPerson();
                }
            }
        }
        public static void main(String[] args) {
            List<Person> roster = Person.createRoster();
            printPersonsOlderThan(roster, 10);
        }
}
