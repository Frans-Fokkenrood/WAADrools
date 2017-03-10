package com.fokkenrood.drools;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class VertaalTabelLezer {
	private static FileInputStream	xlsFile		= null;
	private static HSSFWorkbook		workbook	= null;
	private static Date				dateToday	= null;
	private static boolean			verbose		= false;
	
	public String zoekFeit(String tabblad, String sleutel) {
		HSSFSheet sheet = workbook.getSheet(tabblad);
		if (sheet == null) {
			if (verbose) {
				System.out.println("- Tabblad '" + tabblad + "' komt niet voor in het werkboek!");
			}	// end if
			return null;
		}
		
		for (int i=1; i<=sheet.getLastRowNum(); i++) {
			HSSFRow row = sheet.getRow(i);
			if (dateToday.before(row.getCell(1).getDateCellValue()))				{ continue; }
			if (dateToday.after(row.getCell(2).getDateCellValue()))					{ continue; }
			if (row.getCell(0).getStringCellValue().equals(sleutel)) {
				String vertaling = row.getCell(3).getStringCellValue();
				if (verbose) {
					System.out.println("- Feit '" + sleutel + "' wordt vertaald als '" + vertaling + "'...");
				}	// end if
				return vertaling;
			}	// end if
		}	// end for
		
		if (verbose) {
			System.out.println("- Feit '" + sleutel + "' wordt NIET vertaald!");
		}	// end if
		return sleutel;
	}	// end zoekFeit
	
	
	public void openWerkboek(String bestand, Calendar TODAY, boolean VERBOSE) {
        try {             
        	xlsFile		= new FileInputStream(new File(bestand));
        	workbook	= new HSSFWorkbook(xlsFile); 
        	dateToday	= TODAY.getTime();
        	verbose		= VERBOSE;
        } catch (Exception ex) {             
        	ex.printStackTrace(); 
        }
		if (verbose) {
	       	System.out.println("- Werkboek '" + bestand + "'"
	       			+ " geopend op '" + new SimpleDateFormat("dd-MM-yyyy").format(dateToday) + "'");
		}	// end if
	}	// end openWerkboek
	
	public void sluitWerkboek() {
		try {
			workbook.close();
			xlsFile.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		if (verbose) {
			System.out.println("- Werkboek afgesloten!");
		}	// end if
	}	// end sluitWerkboek

}	// end class
