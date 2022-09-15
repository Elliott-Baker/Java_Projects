import java.text.DecimalFormat;
 /**
 *This program creates the class DecagonalPrism and its methods.
 *
 *Project 04
 *@author Elliott Baker - COMP 1210
 *@version 9/17/2021
 */
 
public class DecagonalPrism {
   
   // instance variables
   private String label;
   private double edge;
   private double height;
   
   private DecimalFormat df = new DecimalFormat("#,##0.0##");
   
  /**
   *Passes DecagonalPrism three parameters.
   *@param labelIn - The label of the decagonal prism. 
   *@param edgeIn - The length of the edge of the prism. 
   *@param heightIn - The height of the prism.
   */
   public DecagonalPrism(String labelIn, double edgeIn, double heightIn) {
   
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
   
   }
   
   /**
    *Returns label. 
    *@return getLabel() - returns the label value.
    */
   public String getLabel() {
      return label;
   }
   
   /**
    *Sets label.
    *@return setLabel() - returns true if label is not null.
    *@param labelIn - The label of the prism. 
    */
   public boolean setLabel(String labelIn) {
   
      if (labelIn.length() >= 1) {
         label = labelIn.trim();
         return true;
      }
      else 
      {
         return false;
      }
   
   }
   
   /**
    *Returns edge value.
    *@return getEdge() - returns the value of the edge of the prism.
    */
   public double getEdge() {
      return edge;
   }
   
   /**
    *Sets edge value. 
    *@return setEdge() - returns true of the edge value is positive.
    *@param edgeIn - the length of the edge. 
    */
   public boolean setEdge(double edgeIn) {
      if (edgeIn < 0) {
         return false;
      }
      else 
      {
         edge = edgeIn;
         return true;
      }
   }
   
   /**
    *Returns height value. 
    *@return getHeight() - returns the value of height. 
    */
   public double getHeight() {
      return height;
   }
   
   /**
    *Sets height value.
    *@return setHeight() - returns true if height is positive. 
    *@param heightIn - the height of the prism. 
    */
   public boolean setHeight(double heightIn) {
      if (heightIn < 0) {
         return false;
      }
      else {
         height = heightIn;
         return true;
      }
   }
   
   /**
    *Returns the surface area. 
    *@return surfaceArea() - returns the surface area of the prism. 
    */
   public double surfaceArea() {
      return (10 * edge * height) + (5 * edge * edge) 
         * (Math.sqrt(5 + (2 * Math.sqrt(5))));
   }
   
   /**
    *Returns the area of the base. 
    *@return baseArea() - returns the area of the base of the prism.
    */
   public double baseArea() {
      return (2.5 * edge * edge) * (Math.sqrt(5 + (2 * Math.sqrt(5))));
   }
   
   /**
    *Returns lateral surface area. 
    *@return lateralSurfaceArea() - returns the lateral surface area
    */
   public double lateralSurfaceArea() {
      return (10 * edge * height);
   }
   
   /**
    *Returns the volume. 
    *@return volume() - returns the volume of the prism. 
    */
   public double volume() {
      return (2.5 * edge * edge) * (Math.sqrt(5 + (2 * Math.sqrt(5)))) 
         * (height);
   }
   
   /**
    *Returns the object as a String. 
    *@return toString() - returns the object as a string.
    */
   public String toString() {
      String output = "A decagonal prism \"" + label + "\" with edge = "
         + df.format(edge)
         + " units and height = " + df.format(height) + " units, has:";
      output += "\n\tsurface area = " + df.format(surfaceArea())
         + " square units";
      output += "\n\tbase area = " + df.format(baseArea()) + " square units";
      output += "\n\tlateral surface area = " 
         + df.format(lateralSurfaceArea()) + " square units";
      output += "\n\tvolume = " + df.format(volume()) + " cubic units";
      return "\n" + output;
   }
}