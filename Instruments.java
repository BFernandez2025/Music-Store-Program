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

import java.util.ArrayList; //we import ArrayList collection here

public class Instruments { //this is the decleration of the class Instruments
    /*This is the section of the program that declares all our instance variables.
    All instance variable are of private as we can not have other classes altering/changing
    the values associated with these variables unless we make changes in this specific class
    */
    private String teacher;
    private ArrayList<String> instrumentNameList;
    private int quantityTrumpet;
    private int quantityTrombone;
    private int quantityTuba;
    private int quantityAltoSaxophone;
    private int quantityTenorSaxophone;
    private int quantityBariSaxophone;
    private int quantityOtherSaxophone;
    private int quantityClarinet;
    private int quantityOboe;
    private int quantityBGuitar;
    private int quantityEGuitar;
    private int quantityDrums;
    private int quantityPiano;
    private int quantityGeneral;
    private int totalQuantity;
    
    /*Here we have our two constructors which demonstrate our constructor overloading process
    The first constructor take in an argument of type String called name and declares the instance variable 
    teacher with that name. The second constructor assumes no argument and therefore, will assign the value
    of teacher to Anonymous in the event the teacher doesn't want to input their name. This is here so that the
    teacher may have an option in not having their name be known in the store if they don't want it to be on record
    online neccessarily. These constructors also initialize the ArrayList variable and totalQuantity variable to 0. */
    public Instruments(String name){
        teacher = name;
        instrumentNameList = new ArrayList<String>();
        totalQuantity = 0;
    }

    public Instruments(){
        teacher = "Anonymous";
        instrumentNameList = new ArrayList<String>();
        totalQuantity = 0;
    }

    /*For redundancy purposes, all accessors and mutators functionality will be described here. 
    These accessor and mutator methods are used to set the quantity for each individual instrument and get
    the values of each individual instruments whenever needed. The majority of the mutators use the this keyword
    in order to distinguish between the instance variable and the arguments of the method. The accessors just return
    the value associated with the given instance variable. */
    public void setTeacher(String name){teacher = name;}

    public void setQuantityTrumpet(int quantityTrumpet){this.quantityTrumpet = quantityTrumpet;}

    public void setQuantityTrombone(int quantityTrombone){this.quantityTrombone = quantityTrombone;}

    public void setQuantityTuba(int quantityTuba){this.quantityTuba = quantityTuba;}

    public void setQuantityAltoSaxophone(int quantityAltoSaxophone){this.quantityAltoSaxophone = quantityAltoSaxophone;}

    public void setQuantityTenorSaxophone(int quantityTenorSaxophone){this.quantityTenorSaxophone = quantityTenorSaxophone;}

    public void setQuantityBariSaxophone(int quantityBariSaxophone){this.quantityBariSaxophone = quantityBariSaxophone;}

    public void setQuantityOtherSaxophone(int quantityOtherSaxophone){this.quantityOtherSaxophone = quantityOtherSaxophone;}

    public void setQuantityClarinet(int quantityClarinet){this.quantityClarinet = quantityClarinet;}

    public void setQuantityOboe(int quantityOboe){this.quantityOboe = quantityOboe;}

    public void setQuantityBGuitar(int quantityBGuitar){this.quantityBGuitar = quantityBGuitar;}
    
    public void setQuantityEGuitar(int quantityEGuitar){this.quantityEGuitar = quantityEGuitar;}

    public void setQuantityDrums(int quantityDrumKits){quantityDrums = quantityDrumKits;}

    public void setQuantityPiano(int quantityPiano){this.quantityPiano = quantityPiano;}

    public void setQuantityGeneral(int quantityGeneral){this.quantityGeneral = quantityGeneral;}

    public String getTeacher(){return teacher;}

    public int getQuantityTrumpet(){return quantityTrumpet;}

    public int getQuantityTrombone(){return quantityTrombone;}

    public int getQuantityTuba(){return quantityTuba;}

    public int getQuantityAltoSaxophone(){return quantityAltoSaxophone;}

    public int getQuantityTenorSaxophone(){return quantityTenorSaxophone;}

    public int getQuantityBariSaxophone(){return quantityBariSaxophone;}

    public int getQuantityOtherSaxophone(){return quantityOtherSaxophone;}

    public int getQuantityClarinet(){return quantityClarinet;}

    public int getQuantityOboe(){return quantityOboe;}

    public int getQuantityBGuitar(){return quantityBGuitar;}
    
    public int getQuantityEGuitar(){return quantityEGuitar;}

    public int getQuantityDrums(){return quantityDrums;}

    public int getQuantityPiano(){return quantityPiano;}

    public int getQuantityGeneral(){return quantityGeneral;}

    /*This method overrides the equals functionality. It first checks if the two objects are the same
    in which case it returns true. If the argument object is null or the classes between the two objects are not
    the same, we return false. Otherwise we case the argument Obj to the class Instruments and then compare the 
    two by the teacher names associated with them. This is done to that in the ArrayList method, we can make sure
    that items and instrument quantities are not altered unless it is the correct person altering them. */
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        else if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        Instruments other = (Instruments) obj;

        return this.teacher.equals(other.teacher); //comparing to see if the teachers namse are the same
    }

    /*This method is called Instrument list and takes in arguments of type String and type Object. This
    method is used to add the inputte instrument to the ArrayList of Instruments that the teacher wants to purchase.
    This is done so that the teacher can look and make sure they purchased each specific instrument they needed. Example:
    The teacher may have wanted to buy a trumpet but if it was never inputted into the ArrayList after adding it to the pricing,
    the teacher may think they had forgotten to purchase it. The method does a quick verification using the equals
    method checking to make sure the same teacher is still accessing this cart, and if this is true,
    the instrument name is added to the ArrayList. */
    public void instrumentNamesList(String instrument, Object obj){ //This method adds the specific type of instrument the teacher had bought without quantity to they can visualize to see they have bought every type of instrument they need
        if(this.equals(obj) == true){
            instrumentNameList.add(instrument); //uses arraylist add method to make a list of the different instruments that were bought in the list
        }
    }
    
    /*This method simply calculates the total quantity of instruments in the cart by adding the individual
    quantities of all the instruments. It does not return anything but rather is simply alters our instance variable totalQuantity
    for later purposes. This value is calculated here to be used later in the toString() method when printing out the purchase
    information. */
    public void totalQuantity(){ //this methods calculates the total number of instruments to make sure the teacher knows their total is correct
        totalQuantity = quantityTrumpet + quantityTrombone + quantityTuba + quantityAltoSaxophone
        + quantityTenorSaxophone + quantityBariSaxophone + quantityOtherSaxophone + quantityOboe +
        quantityClarinet + quantityBGuitar + quantityEGuitar + quantityDrums + quantityPiano + quantityGeneral;
    }

    /* This method simply just returns the ArrayList instrumentNameList */
    public ArrayList<String> getInstrumentNamesList(){
        return instrumentNameList;
    }

    /* This method returns the totalQuantity of instruments */
    public int getTotalQuantity(){
        return totalQuantity;
    }

}
