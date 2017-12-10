package com.vv.batch.writers;

public class ExcelBean {
	private String header;
	private String footer;
	private String fileName;
	
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getFooter() {
		return footer;
	}
	public void setFooter(String footer) {
		this.footer = footer;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public String toString() {
		return "ExcelBean [header=" + header + ", footer=" + footer + ", fileName=" + fileName + "]";
	}
	
}
