package com.yi.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ProjectVO {
	private int project_no;
	private String project_name;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date start_date;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date end_date;
	private String progress;
	
	public ProjectVO() {
		// TODO Auto-generated constructor stub
	}

	public ProjectVO(int project_no, String project_name, Date start_date, Date end_date, String progress) {
		this.project_no = project_no;
		this.project_name = project_name;
		this.start_date = start_date;
		this.end_date = end_date;
		this.progress = progress;
	}

	public int getProject_no() {
		return project_no;
	}

	public void setProject_no(int project_no) {
		this.project_no = project_no;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	@Override
	public String toString() {
		return String.format("ProjectVO [project_no=%s, project_name=%s, start_date=%s, end_date=%s, progress=%s]",
				project_no, project_name, start_date, end_date, progress);
	}
	
	
}
