package exercise1;

import static exercise1.Card.SUITS;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks
 * the user to pick a card. It then searches the array of cards for the match to
 * the user's card. To be used as starting code in Exercise
 *
 * @author YUVRAJ SINGH
 * @author YUVRAJ SINGH OCT 03, 2022
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] hand = new Card[7];
        
for( int i=0;i<hand.length;i++)
        {
            Card card = new Card();
            card.setValue((int)(Math.random()*13)+1);//use a method to generate random *13
            card.setSuits(SUITS[(int)(Math.random()*3)]);//random method suit 
           hand[i]=card;
           System.out.println(card.getValue()+" "+card.getSuits()); 
        }

            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        
        Scanner obj = new Scanner(System.in);
        System.out.print("enter any number from 1 to 10: ");
        int num = obj.nextInt();

        Scanner mysc = new Scanner(System.in);
        System.out.print("Enter any suit: ");
        String suit = mysc.nextLine();

        Card luckyCard = new Card();             // Hard coded object luckyCard
        luckyCard.setValue(7);
        
        luckyCard.setSuits("clubs");

        boolean key = false;
        for (Card hand1 : hand) {
            if (suit.equalsIgnoreCase(hand1.getSuits()) && num == hand1.getValue()) {
                System.out.println("Card is found");
                key = true;
            }
        }
        if (!key) {
            System.out.println("Card not found");
        }
    }
    // insert code to ask the user for Card value and suit, create their card
    // and search the hand here. 
    // Hint: You can ask for values 1 to 10, and then
    //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
    //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
    // 
    // Then loop through the cards in the array to see if there's a match.


    // If the guess is successful, invoke the printInfo() method below.
    
    
    
    /**
 * A simple method to print out personal information. Follow the instructions to
 * replace this information with your own.
 *
 *
 */
    public static void printInfo() {
    
        System.out.println("Congratulations, you have estimated right!");
        System.out.println();
        
        System.out.println("My name is yuvraj, but you can call me yuvi");
        System.out.println();
        
        System.out.println("My career ambitions: SINGER");
        System.out.println("-- Be frequentely active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies: s");
        System.out.println("-- singing");
        System.out.println("-- writing");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my jet");

        System.out.println();
        
    
        }

}

