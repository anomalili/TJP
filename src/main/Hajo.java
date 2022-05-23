package main;

import java.util.Scanner;

public class Hajo {

    public Hajo(int[] pozicio) {
        this.pozicio = pozicio;
    }

    private int[] pozicio;

    static void talalat(int poz) {
        
        
//        Hajo hajo = new Hajo([2,3,4]);
        int []pozicio = {2,3,4};
        

        String talalat;
        int jatekosTipp;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Játékos tippje:");
            jatekosTipp = sc.nextInt();
            System.out.println(jatekosTipp);

            
            for (int j = 0; j < 10; j++) {
                
            if (jatekosTipp == pozicio[j]) {
                
                talalat = "talált";
                System.out.println(talalat);
                
            }else {
            
                talalat = "mellé";
                System.out.println(talalat);
                    
            
            }
                
            }
            

        }
    }
}

//
//    static void talalat() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//
//    public String talalat(int poz){
////        int pozicio = 4;
////      int poz;
//        
//        for (int j = 0; j < 10 && pozicio[j] == poz) {
//            
//            return null;
//            
//        }
//    return "";

