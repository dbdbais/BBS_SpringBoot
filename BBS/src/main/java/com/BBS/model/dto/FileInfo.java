package com.BBS.model.dto;

public class FileInfo {
	private String saveFolder;
	private String originalFile;
	private String saveFile;
	
	public FileInfo() {
		super();
	}
	
	public FileInfo(String saveFolder, String originalFile, String saveFile) {
		super();
		this.saveFolder = saveFolder;
		this.originalFile = originalFile;
		this.saveFile = saveFile;
	}

	public String getSaveFolder() {
		return saveFolder;
	}

	public void setSaveFolder(String saveFolder) {
		this.saveFolder = saveFolder;
	}

	public String getOriginalFile() {
		return originalFile;
	}

	public void setOriginalFile(String originalFile) {
		this.originalFile = originalFile;
	}

	public String getSaveFile() {
		return saveFile;
	}

	public void setSaveFile(String saveFile) {
		this.saveFile = saveFile;
	}

	@Override
	public String toString() {
		return "FileInfo [saveFolder=" + saveFolder + ", originalFile=" + originalFile + ", saveFile=" + saveFile + "]";
	}
	
	
	
	
}
