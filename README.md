# Features
### scanRestaurantFile Method 
- We made this method to scan the restaurants and their data from the file, create a restaurant object with that data, and add it to the array list.
- We made a new file object with the file name of our data passed as an argument
- We created a new scanner object to scan the data and changed its delimiter to an apostophe so that it would interperet our data in the correct way
- We used a loop to scan the data and instantiate variables with that data
- We used an if statement to make rating variables with inaccurate ratings more obvious
- We created a new restaurant object with those variables and added it to our array list

### printRandomRestaurant Method
- We made this method to choose a random restaurant from the array list and print it to the console
- We made a new random object to call
- We created a numRestaurants varaible and used the list.size() method to instantiate it
- We created a randomIndex variable and instantiated it by using our random object to call the nextInt() method in order to pick a random number from that list
- We used our list object to call the get() and passed our randomIndex variable so that the restaurant corresponding to the that random number in the list would be retrieved and printed
