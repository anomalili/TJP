package main;

import java.util.Random;

public class Jatekmezok {
    
    int minimum = 0;
    int hajoMeret = 3;
    int mezok= 10;

    public Jatekmezok(int[] mezok) {
        this.mezok = mezok;
    }
    
    
      public int[] mezok;
      
      
      void hajoHelyekKiosztasa(){
      
          Random rnd = new Random();
          
          int  HajoPoz = (int)((Math.random() * (mezok - minimum)) + minimum);

          int lehetsegesPozKezdes = mezok - hajoMeret;
          
          
          for (int i = 0; i < mezok [lehetsegesPozKezdes]; i++) {
              
              
              
          }
          
      
      
      
      }
      
      
    
}
