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

			// 1. You can obtain a rowIterator and columnIterator and iterate over them

			CellStyle style = workbook.createCellStyle(); // Create new style
			style.setWrapText(false); // Set wrap text false

			for (Row row : sheet) {

				Submission sub = new Submission();

				sub.setSender(row.getCell(0).toString());
				sub.setSubmissionId(row.getCell(1).toString());
				sub.setApplicationNumber(row.getCell(2).toString());
				sub.setFormType(row.getCell(3).toString());
				sub.setCurrentStates(row.getCell(4).toString());
				sub.setReceivingTime(row.getCell(5).toString());
				sub.setStateTimestamp(row.getCell(6).toString());
				sub.setComment(row.getCell(7).toString());
				sub.setTeam(row.getCell(8).toString());
				sub.setStatus(row.getCell(9).toString());

				data.add(sub);
			}

			workbook.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return data;
	}

}
