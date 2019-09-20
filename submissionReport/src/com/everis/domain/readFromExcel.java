package com.everis.domain;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.util.ArrayList;

import java.util.List;

public class readFromExcel {

	public static List<Submission> getSubmissionsFromExcel(String SAMPLE_XLSX_FILE_PATH) {

		List<Submission> data = new ArrayList<>();

		try {

			// Creating a Workbook from an Excel file (.xls or .xlsx)
			Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));
			Sheet sheet = workbook.getSheetAt(0);

			// Create a DataFormatter to format and get each cell's value as String
			DataFormatter dataFormatter = new DataFormatter();

			// 1. You can obtain a rowIterator and columnIterator and iterate over them

			CellStyle style = workbook.createCellStyle(); // Create new style
			style.setWrapText(false); // Set wrap text false
			List<String> ls = new ArrayList<String>();

			for (Row row : sheet) {

				for (Cell cell : row) {

					cell.setCellStyle(style); // Apply style to cell
					String cellValue = dataFormatter.formatCellValue(cell);
					ls.add(cellValue);

				}
				Submission sub = new Submission(ls.get(0), Integer.valueOf(ls.get(1)), ls.get(2), ls.get(3).toString(),
						ls.get(4), ls.get(5), ls.get(6), ls.get(7), ls.get(8), ls.get(9));

				data.add(sub);
			}

			workbook.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return data;
	}

}
