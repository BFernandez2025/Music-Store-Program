/*Project Description
One of the biggest forms of entertainment in our world is music and the way we create music
is through our instruments. However, there are many different kinds of instruments and some of
which have different variations, leading to differentiations in the costs of those instruments.
This program is a music instrument store that allows high school teachers to purchase different band
instruments in bulk for their students to play. The teacher will first be prompted to enter their name
to start creating their order kind of like how a cart functions. The teacher will set the number of each instrument
they want. Once the teacher adds their instruments, a list of the instruments tehy bought will be created and shown to them
as well the ability to compare multiple different orders to potentially make different combinations of orders and determine
the best suited price order for them. Lastly of course, the price of each instrument will be calculated and put together into
a total price with variable with taxes accounted for. The final printed result gives a string with the price, total quantity of instruments,
quantity of each instrument and the list of instruments added to the list without their corresponding quantities.

The program contains three classes. The first class is called Instruments which is the class that has the majority of the setters
and getters, which allow the teacher to tell the program how many of each of the available instruments they would like to purchase.
This class also uses methods for overriding equals to see whether two objects have the same teacher, adding selected instruments
to the ArrayList of instruments and calculating the total quantity of instruments set to purchase. The second class called InstrumentCost
extends the class Instruments. This is where the calculations for the pricing based on the instruments the teacher wants to buy is done. 
Additionally, the final toString() method is executed here*/ 

public class ProjectOneTester{
    public static void main (String[] args){
        InstrumentCost teacher1 = new InstrumentCost("Mr.Fernandez");
        InstrumentCost teacher2 = new InstrumentCost("Mr.Fernandez");
        
        teacher1.setQuantityTrumpet(3);
        teacher2.setQuantityTrumpet(2);
        teacher1.setQuantityTrombone(3);
        teacher2.setQuantityTrombone(1);
        teacher1.setQuantityTenorSaxophone(3);
        teacher2.setQuantityAltoSaxophone(2);

        teacher1.instrumentNamesList("Trumpet", teacher1);
        teacher1.instrumentNamesList("Trombone", teacher1);
        teacher1.instrumentNamesList("Tenor Saxophone", teacher1);

        teacher2.instrumentNamesList("Trumpet", teacher2);
        teacher2.instrumentNamesList("Trombone", teacher2);
        teacher2.instrumentNamesList("Alto Saxophone", teacher2);

        teacher1.totalQuantity();
        teacher2.totalQuantity();

        teacher1.trumpetCost();
        teacher2.trumpetCost();
        teacher1.tromboneCost();
        teacher2.tromboneCost();
        teacher1.saxCost("Tenor");
        teacher2.saxCost("Alto");

        teacher1.calculateFees();
        teacher2.calculateFees();
        
        System.out.println(teacher1.cheaperOrder(teacher2).toString());
        System.out.print(teacher1.toString());
    }
}