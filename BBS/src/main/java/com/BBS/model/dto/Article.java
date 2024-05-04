package com.BBS.model.dto;

import java.util.List;

public class Article {
	private int atricle_no;
	private int view;
	private String registerTime;
	private String title;
	private String content;
	private List<FileInfo> fileInfos;
	
	public Article() {
		super();
	}

	public Article(int atricle_no, int view, String registerTime, String title, String content,
			List<FileInfo> fileInfos) {
		super();
		this.atricle_no = atricle_no;
		this.view = view;
		this.registerTime = registerTime;
		this.title = title;
		this.content = content;
		this.fileInfos = fileInfos;
	}



	public int getAtricle_no() {
		return atricle_no;
	}



	public void setAtricle_no(int atricle_no) {
		this.atricle_no = atricle_no;
	}



	public int getView() {
		return view;
	}



	public void setView(int view) {
		this.view = view;
	}



	public String getRegisterTime() {
		return registerTime;
	}



	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public List<FileInfo> getFileInfos() {
		return fileInfos;
	}



	public void setFileInfos(List<FileInfo> fileInfos) {
		this.fileInfos = fileInfos;
	}



	@Override
	public String toString() {
		return "Article [atricle_no=" + atricle_no + ", view=" + view + ", registerTime=" + registerTime + ", title="
				+ title + ", content=" + content + ", fileInfos=" + fileInfos + "]";
	}
	
	
	
}
