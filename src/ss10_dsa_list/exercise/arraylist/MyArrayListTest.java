package ss10_dsa_list.exercise.arraylist;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
        myArrayList.add(5);
        myArrayList.add(10);
        myArrayList.add(12);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(7);
        myArrayList.add(1);


        System.out.println(myArrayList.indexOf(12)); //2
        System.out.println(myArrayList.indexOf(30)); //-1
        System.out.println(myArrayList.size()); //7
        System.out.println(myArrayList.get(10));

    }
}
