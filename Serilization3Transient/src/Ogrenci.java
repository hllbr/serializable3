
import java.io.Serializable;


public class Ogrenci implements Serializable{
    private String isim ;
    private int id ;
    private String bolum ;
    private static int ogrenciSayısı = 0;//static özellikler classa ait bir özellik olarak karşımıza çıkıyorlar

    public static int getOgrenciSayısı() {
        return ogrenciSayısı;
    }

    public static void setOgrenciSayısı(int ogrenciSayısı) {
        Ogrenci.ogrenciSayısı = ogrenciSayısı;
    }
    /*buradaki bir yapıyı serileştirmek istemiyorsak bunu Transient anahtar kelimesi ile ifade etmemiz gerek.
    Eğer bir özelliğe Transient ifadesini eklerseniz bu özellik Serileştirilmiyor.Bu özelliğiniz içine hiçbir değer eklememişsiniz gibi varsayılan bir değerle başlıyor.
    inetegerların varsayılan değerleri 0 ...
    aynı durum Stringler içinde geçerli burada da null bir referans ile başlamış oldu
    private transient int id ;
    private transient String bolum ;
    
    private static int ogrenciSayısı = 0;// yapısı ise başında sanki transient anahtar kelimesi varmış gibi çalışıyor ve yaptığımız işlemler mantıksal olarak boşa çıkıyor.
    bu yapı bize 0 referansı dönüyor.Güncelleme yapılamadı*/
    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        
        //return "Ogrenci{" + "isim=" + isim + ", id=" + id + ", bolum=" + bolum + '}';
        String bilgiler = "Ogrenci ismi : "+ isim+"\nOgrenci id : "+id+"\nOgrenci Bolum :"+bolum;
        return bilgiler;
    }
    
}
