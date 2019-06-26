package REPLIT;

import java.util.*;
class Main {
  public static void print(Map<String, Integer> map)  {
     if(map.isEmpty()){
        System.out.println("map is empty");
      }else{
        System.out.println(map);
      }
      }
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();
    
      map.put("mango", 10);
      map.put("apple", 30);
      map.put("orange", 20);
      
      print(map);
      map.clear();
      print(map);
  
  }
}