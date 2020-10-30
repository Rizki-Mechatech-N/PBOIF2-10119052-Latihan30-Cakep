package pboif2.pkg10119052.latihan30.cakep;
import java.util.Scanner;
/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * program cakep
 * 
 */
public class PBOIF210119052Latihan30Cakep {
  public static final String normal = "\u001b[0m";
  public static final String hitam = "\u001b[30m";
  public static final String merah = "\u001b[31m";
  public static final String hijau = "\u001b[32m";
  public static final String kuning = "\u001b[33m";
  public static final String biru = "\u001b[34m";
  public static final String magenta = "\u001b[35m";
  public static final String cyan = "\u001b[36m";
  public static final String putih = "\u001b[37m";
  
  public static final String blink = "\u001b[5m";
  
  public static void kondisi(String warna){
      if ("Yoi".equals(warna)) {
          System.out.println();
          System.out.println(merah+"Cakep Bener," +magenta+" Good Job");
      }else{
          System.out.println();
          System.out.println(merah+"Tetep cakep sih");
          System.out.println(cyan+"Sing penting paham konsepnya yee.");
          System.out.println("Keep the code works dude");
      }
  }
  
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        String warna;
        System.out.println(merah+"Kamu"+hijau+" ngerjain sendiri"+kuning+
                "latihan 17 sampe"+biru+" latihan 30 ini?");
        System.out.print(biru+"Jawab"+merah+" (Yoi/Enggak) : ");
        warna = masuk.next();
        System.out.println();
        kondisi(warna);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Developed By Rizki Dwi Nugraha");
    }
    
}
