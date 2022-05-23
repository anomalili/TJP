
package main;


public class TorpedoTeszt {
    public static void main(String[] args) {
           System.out.println("teszt");
           
//           new TorpedoTeszt().teszLoves(4);
//           assert 1 == 2 : "nem jó";
        
    }

    public String tesztLoves(int poz) {
    
        Hajo hajo = new Hajo();
        String t = hajo.tesztLoves(poz);
        assert t.equals("talált"): "a találat ellenőrzése hibás" ;
        
        
    return "";
    }
    
    
}
