package Restaurant.Main;

import Restaurant.Restaurant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Restaurant> restaurants = new ArrayList<>();

        try {
            scanRestaurantFile(restaurants);
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        printRandomRestaurant(restaurants);
    }

    public static void scanRestaurantFile(ArrayList<Restaurant> list) throws FileNotFoundException {
        File file = new File("src/restaurants.txt");
        Scanner scan = new Scanner(file);
        scan.useDelimiter(",");

        while (scan.hasNext()) {

            String name = scan.next();
            int waitTime = scan.nextInt();
            double rating = scan.nextDouble();
            double avgPrice = scan.nextDouble();
            double distance = scan.nextDouble();
            String hoursOpen = scan.next();

            if (rating>5) {
                rating = -1;
            }
            Restaurant restaurant = new Restaurant(name, waitTime, rating, avgPrice, distance, hoursOpen);

            list.add(restaurant);
        }


    }

    /**
     * Chooses a random restaurant from an arrayList and prints it
     * @param list ArrayList of Restaurants
     */
    public static void printRandomRestaurant(ArrayList<Restaurant> list) {
        Random randy = new Random();
        int numRestaurants = list.size();
        int randIndex = randy.nextInt(numRestaurants - 1);
        System.out.println(list.get(randIndex));

    }
}