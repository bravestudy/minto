package org.bravestudy.minto.front.controller;

public class Top2 {
private String title;
private String content;
private String imageUrl;
private Integer limitCnt;


public Top2(String title, String content, String imageUrl, Integer limitCnt) {
	super();
	this.title = title;
	this.content = content;
	this.imageUrl = imageUrl;
	this.limitCnt = limitCnt;
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
public String getImageUrl() {
	return imageUrl;
}
public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}
public Integer getLimitCnt() {
	return limitCnt;
}
public void setLimitCnt(Integer limitCnt) {
	this.limitCnt = limitCnt;
}



}
