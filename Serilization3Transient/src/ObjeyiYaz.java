
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiYaz {
    public static void main(String[] args) {
        //objeyi serileştirmek için objectoutputstream'e ihtiyacımız var
        Ogrenci ogrenci = new Ogrenci("hllbr", 1234, "EEM");
        Ogrenci ogrenci1 = new Ogrenci("h2lbr", 125, "ENGİNEER");
        Ogrenci ogrenci2 = new Ogrenci("PRİNCE", 1235, "DEVELOPER");
       
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))){
            //class ismi ile ögrencisayısını güncelliyoruz bu alanda
            Ogrenci.setOgrenciSayısı(100);
        out.writeObject(ogrenci);
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya Bulunamadı");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken bir sorun meydana geldi");
        }
    }
}
