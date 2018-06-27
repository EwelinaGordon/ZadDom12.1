import java.util.Random;
import java.util.TreeSet;

public class NumberSetGenerate {
    public static void main(String[] args) {
        TreeSet<Integer> numberSet = numbersSet();


        System.out.println(numberSet);
        //System.out.println(numberSet.toString());
        System.out.println("Najmniejsza z liczb: " + numberSet.first());
        System.out.println("Największa z liczb: " + numberSet.last());
        int sum = sumNumbers(numberSet);
        System.out.println("Średnia z wszystkich liczb: " + sum/numberSet.size());
        TreeSet<Integer> numberSetAboveAvg = numbersBelowAvg(sum, numberSet);
        System.out.println("Wszystkie liczby większe od średniej: " + numberSetAboveAvg);

    }

    static TreeSet<Integer> numbersSet(){
        TreeSet<Integer> treeSet = new TreeSet<>();
        Random random = new Random();
        int index = 0;
        while (index <=50) {
            treeSet.add(random.nextInt(1000));
            index++;
        }
        return treeSet;
    }

    static int sumNumbers(TreeSet<Integer> treeSet) {
        int sum = 0;
        for(Integer nb: treeSet) {
            sum += nb;
        }
        return sum;
    }

    static TreeSet<Integer> numbersBelowAvg(Integer sum, TreeSet<Integer> treeSet){
        TreeSet numbersAboveAvg = new TreeSet<>();
        for(Integer nb: treeSet) {
            if (nb>sum/treeSet.size()) {
                numbersAboveAvg.add(nb);
            }
        }
        return numbersAboveAvg;
    }

}