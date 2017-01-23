package com.takatas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DosyaIsleme {

	static String fileSeparator = System.getProperty("file.separator");

	public static void main(String[] args) {

		System.out.println(dosyaOku());

		System.out.println("-------------------------------------");

		dosyaParsEt(dosyaOku());
	}

	private static String dosyaOku() {
		String icerik = "";
		try {
			File file = new File("D:" + fileSeparator + "TTEMEL"
					+ fileSeparator + "sonuclar.txt");
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

			File directory = new File("E:" + fileSeparator + "SONUÇLAR");

			if (!directory.exists()) {
				directory.mkdirs();
			}
			File file = new File("E:" + fileSeparator + "SONUÇLAR"
					+ fileSeparator + "Hasta Sonuçlarý.txt");

			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}

			FileOutputStream fileOutputStream = new FileOutputStream(file, true);
			fileOutputStream.write(metin.getBytes());
			fileOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void dosyaParsEt(String veri) {

		String[] okunanVeri = veri.split("#");

		for (int i = 0; i < okunanVeri.length; i++) {

			String[] hastaBilgisi = okunanVeri[i].split("@");
			String str = "";

			for (int j = 1; j < hastaBilgisi.length; j++) {
				String[] hasta = hastaBilgisi[j].split(":");

				if ((hasta[0].equals("HBG")) || (hasta[0].equals("AG")))
					str += hasta[0] + ",";

				str += hasta[1] + ",";
			}

			String[] sonuclar = str.split(",");
			String ornekNo = sonuclar[0];
			String hastaAdi = sonuclar[1];
			String yas = sonuclar[2];
			String hbg = sonuclar[3];
			String hbgSonuc = sonuclar[4];
			String ag = sonuclar[5];
			String agSonuc = sonuclar[6];

			System.out.println("Örnek No :" + ornekNo + " - Hasta Adý : "
					+ hastaAdi + " - Yaþ : " + yas + " - HBG Sonuç :"
					+ hbgSonuc + " - AG Sonuç : " + agSonuc);
			System.out.println("-------------------------------------");

			String bilgileriYaz = "Örnek No :" + ornekNo + " - Hasta Adý : "
					+ hastaAdi + " - Yaþ : " + yas + " - HBG Sonuç :"
					+ hbgSonuc + " - AG Sonuç : " + agSonuc + "\r\n";
			dosyaYaz(bilgileriYaz, "HastaSonuclari.txt");

		}

	}

}
