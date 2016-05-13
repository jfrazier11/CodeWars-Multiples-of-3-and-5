/**
 * I made this class a singleton to showcase an example of the singleton design pattern
 * This class fins the sum of all multiples of three and five.
 * @author Jeremi Fraziwe
 * @version 1.0
 */
public class Solution {
 
 private static Solution singleton = null; // ensure single instance
 
 public Solution(){
  // default constructor
 }
 /**
  * this method creates a new instance of the class if and only if an instance does not exist for it already.
  * This enables only one instance is instantiated.
  * @return Solution -the single instance of the class
  */
 public static Solution getSingleInstance(){
  if(singleton == null){
    return new Solution();
  }
  return singleton;
 }
 /**
  * this method takes a number input that act as a range [1,number] and finds all the multiples of three and five
  * and calculates the sum of the multiples founded.
  * @param number - the maximum inclusive range
  * @return the collective sum of all multiples in the range
  */
 
 public int solution(int number) {
   int sum = 0;
   for(int i=0; i< number;i++){
     if(i%3 == 0 || i%5 == 0) sum+= i;
   }
   return sum;
  }
}
