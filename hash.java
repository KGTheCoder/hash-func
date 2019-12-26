public class hash {

  /** method to convert string to ascii,
      then calculates a hash value
  **/
 public void hash_func(String a_string, int table_size) {
   int sum = 0;
   for (int i = 0; i < a_string.length(); i++) {
      char c = a_string.charAt(i);
      int value = a_string.charAt(i);
      
      sum = sum + value;
   }
   
   System.out.print(sum % table_size);
 }
 
 public static void main(String[] args) {
   hash h = new hash();
   
   String cat = "cat";
   int table_size = 11;
   
   h.hash_func(cat, table_size);
 }
}