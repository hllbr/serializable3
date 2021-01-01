
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiOku {
    public static void main(String[] args) {
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))){
          
         
            Ogrenci ogrenci = (Ogrenci)in.readObject();
            System.out.println(ogrenci);
            System.out.println("ogrenci sayısı : "+Ogrenci.getOgrenciSayısı());
    
        } catch (FileNotFoundException ex) {
            System.out.println("Okunacak Dosya bulunamadı");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken bir ıoexception meydana geldi");
        } catch (ClassNotFoundException ex) {
            System.out.println("Tür Dönüşümü Hatası ");
            System.out.println("Sınıf(Class) bulunamadı");
        }
    }
    
}
