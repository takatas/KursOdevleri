package com.takatas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DosyaIslemleri2 {
	
	static String fileSeparator = System.getProperty("file.separator");
	static String path = "G:"+fileSeparator+"vpn.txt";
	
	
	public static void main(String[] args) {
		
		
		try {
			dosyaOku(path);
		} catch (IOException e) {

			e.printStackTrace();
		}

		
	}
	
	private static void dosyaOku(String dosyaYolu) throws IOException {
		
		File file = new File(dosyaYolu);
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));
        String satir = reader.readLine();
 
            while (satir!=null) {
                System.out.println(satir);
                satir = reader.readLine();
            }

	}

}
