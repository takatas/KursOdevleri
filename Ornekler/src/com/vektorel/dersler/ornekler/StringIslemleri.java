package com.vektorel.dersler.ornekler;

import java.util.Scanner;

public class StringIslemleri {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Mesaj Giriniz :");
		
		Scanner scanner = new Scanner(System.in); 
		
		String giris = scanner.nextLine();
		
		stringIslemleriTest(giris);
		
		System.out.println("Uygulama Kapandý..");
	}
	
	
	public static void stringIslemleriTest(String parametre) {
		System.out.println("Harf Saýyýs :" + parametre.length());
		
		System.out.println("A içeriyor mu? :" + parametre.contains("A"));
		
		System.out.println("Son Karakteri :" + parametre.charAt(parametre.length()-1));
		
		System.out.println("Ýlk A harifinin indisi :" + parametre.indexOf("A"));
		
		System.out.println("3,4,5,6. Karakterleri : "+ parametre.substring(3,7));
		
		System.out.println("@ Ýþaretine göre Ýlk parça : "+ parametre.split("@")[0]);
	}

}

/**
 * 
 Ödev
@PatNo:234562@Pat:Taner TEMEL@Age:45@HBG:23@AG:45@$
@PatNo:234563@Pat:Kemal TEMEL@Age:34@HBG:23@AG:45@$
@PatNo:234564@Pat:Cemal TEMEL@Age:23@HBG:23@AG:45@$
@PatNo:234565@Pat:Ayþe TEMEL@Age:5@HBG:23@AG:45@$
@PatNo:234566@Pat:Fatma TEMEL@Age:75@HBG:23@AG:45@$
@PatNo:234562@Pat:Taner TEMEL@Age:45@HBG:23@AG:45@$
@PatNo:234563@Pat:Kemal TEMEL@Age:34@HBG:23@AG:45@$
@PatNo:234564@Pat:Cemal TEMEL@Age:23@HBG:23@AG:45@$
@PatNo:234565@Pat:Ayþe TEMEL@Age:5@HBG:23@AG:45@$
@PatNo:234566@Pat:Fatma TEMEL@Age:75@HBG:23@AG:45@$
 * 
 * 
 * 
 * 
 * */
