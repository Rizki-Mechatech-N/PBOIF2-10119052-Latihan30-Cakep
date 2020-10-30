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
  public static final String NORMAL = "\u001b[0m";
  public static final String BLACK = "\u001b[30m";
  public static final String RED = "\u001b[31m";
  public static final String GREEN = "\u001b[32m";
  public static final String YELLOW = "\u001b[33m";
  public static final String BLUE = "\u001b[34m";
  public static final String MAGENTA = "\u001b[35m";
  public static final String CYAN = "\u001b[36m";
  public static final String WHITE = "\u001b[37m";
  
  public static final String BLINK = "\u001b[5m";
  
  public static void kondisi(String warna){
      if ("Yoi".equals(warna)) {
          System.out.println();
          System.out.println(RED+"Cakep Bener," +MAGENTA+" Good Job");
      }else{
          System.out.println();
          System.out.println(RED+"Tetep cakep sih");
          System.out.println(CYAN+"Sing penting paham konsepnya yee.");
          System.out.println("Keep the code works dude");
      }
  }
  
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        String warna;
        System.out.println(RED+"Kamu"+GREEN+" ngerjain sendiri"+YELLOW+
                "latihan 17 sampe"+BLUE+" latihan 30 ini?");
        System.out.print(BLUE+"Jawab"+RED+" (Yoi/Enggak) : ");
        warna = masuk.next();
        System.out.println();
        kondisi(warna);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Developed By Rizki Dwi Nugraha");
    }
    
}
