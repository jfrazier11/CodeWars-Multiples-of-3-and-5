public class Solution {
 private static Solution singleton = null;
 
 public Solution(){
 
 }
 
 public static Solution getSingleInstance(){
  if(singleton == null){
    return new Solution();
  }
  return singleton;
 }
 
 public int solution(int number) {
   int sum = 0;
   for(int i=0; i< number;i++){
     if(i%3 == 0 || i%5 == 0) sum+= i;
   }
   return sum;
  }
}
