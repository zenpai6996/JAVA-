class Counting {

    static int Counter = 0;


    Counting() {

        Counter++;
    }


    static int count() {
        return Counter;
    }
}

public class Maincounter {
    public static void main(String[] args) {

        @SuppressWarnings("unused")
		Counting obj1 = new Counting();
        @SuppressWarnings("unused")
		Counting obj2 = new Counting();
        @SuppressWarnings("unused")
		Counting obj3 = new Counting();


        System.out.println("Number of objects created: " +Counting.count());
    }
}