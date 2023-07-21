package com.pakage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CustomReportGenerator {
	private String reportFilePath; 
	public CustomReportGenerator(String reportFilePath) 
	{ 
		this.reportFilePath = reportFilePath; 
		
	}
	public void generateReport(String testCaseName, String status) 
	{ 
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(reportFilePath, true)))
		{ 
			String report = "Test Case: " + testCaseName + ", Status: " + status; writer.write(report); writer.newLine(); 
		} catch (IOException e) { 
			e.printStackTrace(); }
		
	}

}
