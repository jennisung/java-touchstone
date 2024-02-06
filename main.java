// Since I'm using the "java.util.Scanner", I need to import it. I can import "java.util.*" to import the scanner (and other collection of frameworks). 
import java.util.*;

public class Main {
  public static void main(String[] args) {

// Initialize a new instance of the "Scanner" class, to set up the tool for use.
 Scanner scan = new Scanner(System.in);

// Declaring a new variable called "total". This will keep track of the user's input.
    int total = 0;


    System.out.println("Enter your name to get started");
// Declaring a variable called 'name' to store user's name, so it can be used later.
    String name = scan.nextLine();



    System.out.println("Hello " + name + " ." + "Let's get started with the quiz." + "Enter home or cook");
// Declaring a variable called 'homeFood' to store user's input.
    String HomeFood = scan.nextLine();

    
    System.out.println("Enter the name of a fast-food place you're craving or like. For example: Chipotle, Mcdonalds, etc. Or just enter fast-food");
// Declaring a variable called 'fastFood' to store user's input of a fast-food place.
    String fastFood = scan.nextLine();

    
    System.out.println("Enter the name of restaurant you're caving or just enter restaurant");
// Declaring a variable called 'restaurantFood' to store user's input of a restaurant.
  String restaurantFood = scan.nextLine();




//Users will be prompted with 4 questions.

// User prompted with first question.
     System.out.println(name + "How much can you spend?Enter: 1 for 'little', 2 for 'Around $5 to $15', 3 for 'Money is not a issue' ");
// User input to question one is store in the variable 'questionOne'. And the 'scan.nextInt()' reads the next line.
    int questionOne = scan.nextInt();
// This line keeps track of the user input and tallies up the score.
    total += questionOne;  
    // System.out.println(questionOne);


    
// User prompted with second question.
       System.out.println(name + "Do you already have ingredients at home?Enter: 1 for 'My fridge is stocked and I can make a meal', 2 for 'I have some ingredients in my fridge', 3 for 'My fridge is empty' ");
// User input to question two is store in the variable 'questionTwo'.
    int questionTwo = scan.nextInt();
    // This line keeps track of the user input and tallies up the score.
     total += questionTwo;

// User prompted with third question.
    System.out.println(name + "How quickly do you want to have your meal? Enter: 1 for 'something quick, under 15', 2 for 'something under 30 minutes', 3 for 'I have some time' ");
// User input to question three is store in the variable 'questionThree'.
    int questionThree = scan.nextInt();
// This line keeps track of the user input and tallies up the score.
    total += questionThree;


// User prompted with fourth question.
    System.out.println(name + " How tired are you? Enter: 1 for 'I don't mind cooking', 2 for 'I rather not cook, but can', 3 for 'I would like someone to serve me food' ");
// User input to question four is store in the variable 'questionFour'.
    int questionFour = scan.nextInt();
// This line keeps track of the user input and tallies up the score.
    total += questionFour;




// Initialize a variable called 'outPut' as an empty string, which will store the output response with the recommendation for the user.
    String outPut = "";

// For this 'If else' statement, if the 'total' cumulative is between 4 to 6 (or 4 or 6), the output response would suggest to the user to eat at home. If the 'total' cumulative total is between 7 to 9 (or 7 or 9), the output response would suggest to the user to eat at a fast-food place. If the 'total' is between 10 and 12 (or 10 or 12), then the output would suggest to the user to eat at a restaurant. 
    if(total >= 4 && total <= 6){
      outPut = name + " go eat at " + HomeFood + ".";
    } else if(total >= 7 && total <= 9) {
      outPut = name + " go eat at " + fastFood + ".";
    } else if(total >= 10 && total <= 12) {
      outPut = name + " go eat at " + restaurantFood + ".";
  }  



    // The output will be a prompt, which will suggest to the user whether to eat at home, at a fast-food place, or at a restaurant.
    System.out.println(name + "Based on your answers, we suggest you go eat at " + outPut + ".");


    
  }
    
}