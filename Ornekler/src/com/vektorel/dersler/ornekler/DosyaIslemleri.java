package com.vektorel.dersler.ornekler;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class DosyaIslemleri {

	static String fileSeparator = System.getProperty("file.separator");

	public static void main(String[] args) {
		System.out.println("-------------------------------------");
		
		System.out.println(dosyaOku());		
		
		System.out.println("-------------------------------------");
		System.out.println("Dosyaya Yazýlacak Metin Giriniz :");
		Scanner scanner=new Scanner(System.in);
		
		String kullaniciGirisi = scanner.nextLine();
		dosyaYaz(kullaniciGirisi, "Ahmet.bat");
		
		System.out.println("-------------------------------------");
	}

	private static String dosyaOku() {
		String icerik = "";
		try {
			File file = new File("D:" + fileSeparator + "soner"+ fileSeparator + "test.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				icerik += scanner.nextLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return icerik;
	}

	private static void dosyaYaz(String metin, String dosyaAdi) {
		try {
			String rootPath = "E:" + fileSeparator + "TTEMEL" + fileSeparator;
			File file = new File(rootPath + dosyaAdi);

			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			fileOutputStream.write(metin.getBytes());
			fileOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
