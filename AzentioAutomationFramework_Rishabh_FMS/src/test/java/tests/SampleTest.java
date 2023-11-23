package tests;

import java.util.HashMap;
import java.util.Map;

import dataProvider.ExcelData;

public class SampleTest {

	public static void main(String[] args) {

		String path = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
		// FacilitiesManagement //DataSet ID
		Map<String, String> testData = new HashMap<>();
		ExcelData facilityManagementData = new ExcelData(path, "FacilitiesManagement", "DataSet ID");
		testData = facilityManagementData.getTestdata("AT_FM_010_D1");
		System.out.println(testData.get("DataSet ID"));
	}

}
