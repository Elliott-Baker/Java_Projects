import java.util.ArrayList;
/**
 *This program creates the class Temperatures and its methods.
 *
 *Activity 06
 *@author Elliott Baker - COMP 1210
 *@version 9/28/2021
 */

public class Temperatures {

   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
   
/**
 *The constructor takes one arraylist parameter. 
 *@param temperaturesIn - parameter of type ArrayList.
 */

   public Temperatures(ArrayList<Integer> temperaturesIn) {
   
      temperatures = temperaturesIn;
   
   }

/**
 *Gets lowest temp. 
 *@return getLowTemp() - returns lowest temp in list.
 */
   
   public int getLowTemp() {
   
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
/**
 *Gets highest temp. 
 *@return getHighTemp() - returns highest temp in list. 
 */

   public int getHighTemp() {
   
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      int high = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) > high) {
            high = temperatures.get(i);
         }
      }
      return high;
   }
/**
 *Checks if lowIn is lower than getLowTemp. 
 *@return lowerMinimum() - returns lowest temp or lowIn.
 *@param lowIn - parameter of type int. 
 */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
/**
 *Checks if highIn is larger than getHighTemp. 
 *@return higherMaximum() - returns highest temp or highIn.
 *@param highIn - parameter of type int. 
 */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
/**
 *Converts to String.
 *@return toString() - returns ArrayList as a String.
 */ 
   public String toString() {
      return "\tTemperatures: " + temperatures
           + "\n\tLow: " + getLowTemp()
           + "\n\tHigh: " + getHighTemp();
   }
}