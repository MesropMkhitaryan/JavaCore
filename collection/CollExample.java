package homework.collection;

import chapters.chapter3.Array;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
import java.util.function.UnaryOperator;

public class CollExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Grape");
        list.add("Banana");
        list.add("Potato");
        list.add("Kivi");
        list.add("Waatermelon");
        List<Integer> listint = new ArrayList<>();
        listint.add(11);
        listint.add(12);
        listint.add(2);
        listint.add(1);
        listint.add(148);
        listint.add(148);
        listint.add(148);
//        printFirstFive(list);
        reverseNumbers(listint);


    }

   // մեթոդը գրել այնպես, որ կանչենք, ու իրան ստրինգների մասիվ տանք, ինքը վերադարձնի նույն էլեմենտներով ArrayList
    static List<String> arrayToList(String[] values) {

        return new ArrayList<>(Arrays.asList(values));
    }

    //մեթոդը գրել այնպես, որ կանչենք ու տանք ինչ որ լիստ, ու ինդեքս, ինքը ջնջե էդ ինդեքսի տակ գտնվող էլեմենտը, ու վերադարձնե նույն լիստը, առանց էդ էլեմենտի։
    static List<String> removeById(List<String> list, int index) {

        list.remove(index);
        return list;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած String-ների լիստ, վերադարձնի նույն արժեքներով HashSet
    static Set<String> listToSet(List<String> list) {
        return  new HashSet<>(list);
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նույն արժեքներով LinkedList-ի օբյեկտ։
    static LinkedList<Integer> listToLinkedList(List<Integer> list) {

        return new LinkedList<>(list);
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նոր լիստ, որի մեջ էլեմենտները կլինեն հակառակ հերթականությամբ։
    static List<Integer> reverseNumbers(List<Integer> list) {

        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.println(list.get(i));;
        }
        return list;
    }
//
//    // մեթոդը գրել այնպես, որ ինչ մեծությամբ լիստ էլ տանք էս մեթոդին, ինքը տպե մենակ սկզբի 5 հատը։
    static void printFirstFive(List<String> list) {
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
//
//    // մեթոդը գրել այնպես, որ ինչ list տանք վերադարձնի թե քանի էլեմենտ կա էդ լիստ-ի մեջ
    static int sizeOfList(List<String> list){
        return list.size();
    }

}

