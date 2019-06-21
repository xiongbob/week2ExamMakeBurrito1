import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class MakeBurrito1 {

    // Drive Function
    public static void main(String[] args)
    {
        double price = 0.0;
        int numberOfElements;

        List<String> list = new ArrayList<String>();
        list.add("white rice");
        list.add("brown rice");
        list.add("no rice");
        list.add("chicken");
        list.add("steak");
        list.add("carnidas");
        list.add("chorizo");
        list.add("sofritas");
        list.add("veggies");
        list.add("pinto beans");
        list.add("black beans");
        list.add("no beans");
        list.add("mild salsa");
        list.add("medium salsa");
        list.add("hot salsa");
        list.add("no salsa");
        list.add("all salsa");
        list.add("lettuce");
        list.add("fajita veggies");
        list.add("no veggies");
        list.add("all veggies");
        list.add("cheese");
        list.add("no cheese");
        list.add("guac");
        list.add("no guac");
        list.add("queso");
        list.add("no queso");
        list.add("sour cream");
        list.add("no sour cream");

        System.out.println("All menu ingredients: \n" + list);
        System.out.println();

        MakeBurrito1 obj = new MakeBurrito1();
        //System.out.println(obj);

        //Random randEle = new Random();
        //numberOfElements = randEle.nextInt(9)+ 1;

        int i = 1;
        while (i <= 25) {
            Random randEle = new Random();
            numberOfElements = randEle.nextInt(2-1)+ 1;
            //numberOfElements = Math.abs(randEle.nextInt());
            //numberOfElements = Math.abs(randEle.nextInt(9)+ 1);


            System.out.println();
            System.out.println("Burrito " +i +": "+obj.getRandomElement(list, numberOfElements));
            System.out.print("The price for the burrito is:");
            price = getPrice(numberOfElements);
            System.out.print("$" + price);
            System.out.println();

            i++;
        }
    }

    // Function select an element base on index and return
    // an element
    public List<String> getRandomElement(List<String> list, int totalItems)
    {
        Random rand = new Random();

        // create a temporary list for storing
        // selected element
        List<String> newList = new ArrayList<String>();
        for (int i = 0; i < totalItems; i++) {

            // take a raundom index between 0 to size
            // of given List
            int randomIndex = rand.nextInt(list.size());

            // add element in temporary list
            newList.add(list.get(randomIndex));

            // Remove selected element from orginal list
            list.remove(randomIndex);
        }
        return newList;
    }

    public static double getPrice(int totalItems){
        return (3.00 + 0.50 * (double) totalItems);
    }

}
