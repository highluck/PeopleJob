package com.peoplejob.dto.board;

public class BoardPagingFilter {

	private int columnNumber;
	private int columnIndex;
	private int jobStatus;

	public int getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(int jobStatus) {
		this.jobStatus = jobStatus;
	}

	public int getColumnIndex() {
		return columnIndex;
	}

	public void setColumnIndex(int columnIndex) {
		this.columnIndex = columnIndex;
	}

	public int getColumnNumber() {
		return columnNumber;
	}

	public void setColumnNumber(int columnNumber) {
		this.columnNumber = columnNumber;
	}


}
