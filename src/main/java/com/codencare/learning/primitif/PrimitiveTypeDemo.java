package com.codencare.learning.primitif;

public class PrimitiveTypeDemo
{
	public static void main(String [] args){
                boolean logikaBenar = true;
                boolean logikaSalah = false;
            
		byte bilanganBulat8BitPositif = 8;
                byte bilanganBulat8BitNegatif = -8;                
		short bilanganBulatPendekPositif = 16;
                short bilanganBulatPendekNegatif = -16;
                int bilanganBulatPositif = 32; 
                int bilanganBulatNegatif = -32;
                long bilanganBulatPanjangPositif = 2147483648L;
                long bilanganBulatPanjangNegtif = -2147483649L;
                char karakter = 'A';
                char bilanganPositif = 65;
                //char bilanganNegatif = -65;//error gak bisa negatif unsigned integer
                
                System.out.println("karakter:"+karakter);
                System.out.println("bilanganPositif:"+bilanganPositif);
                System.out.println("bilanganPositif (short):"+ (short)bilanganPositif);
                
                float bilanganMengambangPresisiTunggal = 3.14285714286F;
                Double bilanganMengambangPresisiDouble = 22.0/7.0;
                
                System.out.println("bilanganMengambangPresisiDouble:"+bilanganMengambangPresisiDouble);
                System.out.println("bilanganMengambangPresisiTunggal:"+bilanganMengambangPresisiTunggal);   
	}
}
