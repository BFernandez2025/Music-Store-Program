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

/*This is our child class InstrumentCost with extends Instruments and implements the interface Comparable on the class InstrumentCost */
public class InstrumentCost extends Instruments implements Comparable<InstrumentCost>{ 
    /*This is the declaration of the instance variable needed to calculate price in this class*/
    private int cost;
    private double priceFinal;

    /*This is where we define our two constructors with overloading utilized in the same way
    as with the constructors in class Instruments. We call the constructor from the super class
    for each constructor and have one with the argument of name and another with no argument name
    inputted mimicking the choice given to the user in class Instruments. Both constructors define
    cost and priceFinal to 0 so they have a value to start building on. */
    public InstrumentCost(String name){
        super(name);
        cost = 0;
        priceFinal = 0;
    }

    public InstrumentCost(){
        super();
        cost = 0;
        priceFinal = 0;
    }

    /*This method called saxCost takes in an input SaxType. It then uses the SaxType to determine
    which type of Saxophone the user is trying to calculate a cost for. The reason for this method
    is because there are man different types of saxophones, each of which have a different price tag. 
    We account for those different prices using this method. Once the saxophone type if identified, we calculate
    the price by doing the given price of the saxophone defined by the variable price multiplied by the quantity
    of that saxopone from the super class and then adding the total price to the private cost instance variable */
    public void saxCost(String SaxType){
        if (SaxType.equals("Alto")){
            int price = 2000;
            int priceTotal = price * super.getQuantityAltoSaxophone();
            cost += priceTotal;
        }

        else if (SaxType.equals("Tenor")){
            int price = 2500;
            int priceTotal = price * super.getQuantityTenorSaxophone();
            cost += priceTotal;
        }

        else if (SaxType.equals("Bari")){
            int price = 3000;
            int priceTotal = price * super.getQuantityBariSaxophone();
            cost += priceTotal;
        }

        else {
            int price = 4000;
            int priceTotal = price * super.getQuantityOtherSaxophone();
            cost += priceTotal;
        }
    }

    /*For redundancy purposes, all cost methods will be described here. Similar to how the saxophone
    method calculated the cost, there an idenetical cost calculation method for each instrument. It tales
    the predefined price of the instrument from variable price and then calculate the price of the number of that
    specific instrument by doing price multiplied by the quantity of that instrument from the super class.
    Finally, that priceTotal quantity is added to the private instance variable cost. This is done to add to the 
    total price that the teacher must pay to purchase these instrumenst. */
    public void trumpetCost(){
        int price = 800;
        int priceTotal = price * super.getQuantityTrumpet();
        cost += priceTotal;
    }

    public void tromboneCost(){
        int price = 1000;
        int priceTotal = price * super.getQuantityTrombone();
        cost += priceTotal;
    }

    public void tubaCost(){
        int price = 2000;
        int priceTotal = price * super.getQuantityTuba();
        cost += priceTotal;
    }


    public void clarinetCost(){
        int price = 1300;
        int priceTotal = price * super.getQuantityClarinet();
        cost += priceTotal;
    }

    public void oboeCost(){
        int price = 2500;
        int priceTotal = price * super.getQuantityOboe();
        cost += priceTotal;
    }

    public void BGuitarCost(){
        int price = 3000;
        int priceTotal = price * super.getQuantityBGuitar();
        cost += priceTotal;
    }

    public void EGuitarCost(){
        int price = 6000;
        int priceTotal = price * super.getQuantityEGuitar();
        cost += priceTotal;
    }

    public void drumsCost(){
        int price = 9000;
        int priceTotal = price * super.getQuantityDrums();
        cost += priceTotal;
    }

    public void pianoCost(){
        int price = 10000;
        int priceTotal = price * super.getQuantityPiano();
        cost += priceTotal;
    }

    public void generalInstrumentsCost(){
        int price = 4500;
        int priceTotal = price * super.getQuantityGeneral();
        cost += priceTotal;
    }

    /*This method just returns the value of the cost variable*/
    public int getCost(){
        return cost;
    }

    /*This method calculateFees() is used to determine the final price stamp for the teachers purchase.
    This is done so that the taxes on the purchase can be accounted for easily. Firstly we cast the variable cost 
    to type double which is now used under variable cost1 in this method. Then we do a basic calculation to
    calculate the GST and provincial tax on the cost itself. Finally, we alter our priceFinal varialbe by adding
    cost1, GST and provincialTax together */
    public void calculateFees(){  //This method calculates all fees with the cost of the instruments
        double cost1 = (double) cost;
        double GST = 0.08 * cost1; //**Fill in rest later*** */
        double provincialTax = 0.05 * cost1;
        priceFinal = cost1 + GST + provincialTax;
    }

    /*This is the usage of our interface Comparable by defining our compareTo method.
    The purpose of this method is to be used in the next method cheaperOrder to determine 
    which order has a higher and lower price. we define an integer variable higherQuantityInstruments
    which is determined by comparing two double values, the price final of the first order and the price
    final of the second order from the argument of other. we simply return that integer value no matter what it is. */
    public int compareTo(InstrumentCost other){ //Lets the teacher know which order has less overall price so they can evaluate pricing choices
        int higherQuantityInstruments = Double.compare(this.priceFinal, other.priceFinal);
        return higherQuantityInstruments;
    }

    /*This method cheaperOrder returns a string indicating to the teacher which order between
    two potential orders is a cheaper price. This allows the teacher to maybe alter an order or choose
    a different order if they are on more of a budget. if the compareTo method returns 1, then order 1
    from the keyword this is more expensive than order 2. If it returns -1, then the contrary to the previous
    statement is true. If 0 is returned, then they are the same price.*/
    public String cheaperOrder(InstrumentCost other){
        if (this.compareTo(other) > 0){
            return "Your second order is cheaper than the first.";
        }

        else if (this.compareTo(other) < 0){
            return "Your first order is cheaper than the second.";
        }

        return "Both order are the same price.";
    }

    /*Finally, we have our overriden toString() method. This method is used to finalize the teachers
    purchase and give them an overview of what their purchase details are. These string returns the information for
    the final price to two decimal places, the ArrayList of the instruments altered in class instruments, the total
    quantity of instruments purchased and the quatity of each individual instrument purchased. It then ends with a friendly
    thank you for shopping with us method.*/

    public String toString(){ 
        //our String should contain:
        //1. final price to two decimal places
        //2. our arrayList containing the instrument which specific instruments were actually bought (not including quantity)
        //3. our total quantity of instruments 
        //4. quantity of each instrument 
        return String.format("Here is your receipt of your purchase\nFinal Price (With tax) = $%.2f \nThe List of instruments you bought (without quantity) = %s \nTotal Quantity of Instruments Purchased = %d \nQuantity of each instrument purchased: \nTrumpet = %d \nTrombone \nTuba = %d \nAlto sax = %d \nTenor sax = %d \nBari sax = %d \nOther sax = %d \nClarinet = %d \nOboe = %d \nBass Guitar = %d \nElectric Guitar = %d \nDrums = %d \nPiano = %d \nGeneral Instruments = %d \nThank you for shoppng with us %s and have a great day!", 
        priceFinal, super.getInstrumentNamesList(), super.getTotalQuantity(), super.getQuantityTrumpet(), super.getQuantityTrombone(), super.getQuantityTuba(), super.getQuantityAltoSaxophone(), super.getQuantityTenorSaxophone(),
        super.getQuantityOtherSaxophone(), super.getQuantityClarinet(), super.getQuantityOboe(), super.getQuantityBGuitar(), super.getQuantityEGuitar(), super.getQuantityDrums(), super.getQuantityPiano(), super.getQuantityGeneral(), super.getTeacher());
    }

    
}
