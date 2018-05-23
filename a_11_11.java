import java.util.HashSet;
import java.util.Set;

public class a_11_11 {

    /*
    11. Write a method called symmetricSetDifference that accepts two Sets as parameters and returns a new Set containing
    their symmetric set difference (that is, the set of elements contained in either of the two sets but not in both).
    For example, the symmetric difference between the sets [1, 4, 7, 9] and [2, 4, 5, 6, 7] is [1, 2, 5, 6, 9].
     */

    public static void main(String[] args) {

        Set<Integer> testSet1 = new HashSet<>();
        Set<Integer> testSet2 = new HashSet<>();

        testSet1.add(1);
        testSet1.add(4);
        testSet1.add(7);
        testSet1.add(9);

        testSet2.add(2);
        testSet2.add(4);
        testSet2.add(5);
        testSet2.add(6);
        testSet2.add(7);

        System.out.println("Result should be: \n[1, 2, 5, 6, 9]");
        System.out.println("Result is: \n" + symmetricSetDifference(testSet1, testSet2));


    }

    public static Set<Integer> symmetricSetDifference(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> returnSet = new HashSet<>(set1);

        returnSet.addAll(set2);

        for (Integer i : set1) {

            if (set2.contains(i)) {

                returnSet.remove(i);
            }
        }

        return returnSet;
    }
}
