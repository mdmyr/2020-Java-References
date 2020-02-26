package com.draf;

import java.awt.List;
import java.util.ArrayList;

public class CsvInputDraftBuilder extends CsvInputFileDraft{

	public static void main(String[] args) {
		
		ArrayList<String> ColumnHeader = headerCreator();//once you have list 		
		ArrayList<String> column1Creator = columnValueCreator();//column list creator		
		
		
		CsvInputFileDraft input = new CsvInputFileDraft();
		input.headerList=ColumnHeader;
		input.columnList=column1Creator;
		
				
		input.innerMap.put(ColumnHeader.get(0), column1Creator.get(0));
		System.out.println(" colum values "+column1Creator.get(0));
		System.out.println("Header " +ColumnHeader.get(0));
		System.out.println("Inner Map : "  + input.innerMap.keySet().toString() +  input.innerMap.get("COL1"));
		
		input.outerMap.put(column1Creator.get(0),input.innerMap);// inner map declaration must be in the object type.
		
		System.out.println(input.outerMap.toString());
		
	}

	
	
	
//COLUMN Values creator.
	private static ArrayList<String> columnValueCreator() {
		ArrayList<String> Col1Values = new ArrayList<String>();
			Col1Values.add("VALUE1");
			Col1Values.add("Value2");
			Col1Values.add("VALUE3");
			Col1Values.add("Value4");
	return Col1Values;
	}

	
	
	
	
	
	
	
	
	
	private static ArrayList<String> headerCreator() {
		CsvInputDraftBuilder builder = new CsvInputDraftBuilder();
		ArrayList<String> colheader=new ArrayList<String>();
			//insert the column headers.
			colheader.add("COL1");
			colheader.add("COL2");
	return colheader;
	}
	
// on you have the arraylist created, use this.
	private static void headerCreator(ArrayList<String> String) {
		CsvInputDraftBuilder builder = new CsvInputDraftBuilder();
		ArrayList<String> colheader=new ArrayList<String>();
			//insert the column headers.
			colheader.add("COL1");
			colheader.add("COL2");
	}
}
