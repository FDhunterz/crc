package crc;
import java.util.zip.* ;
import java.util.Scanner;

public class CRCMaker {
   public static void main( String[] args ) {
	  System.out.println("Masukkan HEXDECIMAL");
	  Scanner inputan = new Scanner(System.in);
      String toBeEncoded = new String(inputan.nextLine()) ;
      CRC32 myCRC = new CRC32() ;
      myCRC.update( toBeEncoded.getBytes()) ;
      System.out.println( "The CRC-32 value is : " + Long.toHexString( myCRC.getValue() ) + " !" ) ;
   }
}