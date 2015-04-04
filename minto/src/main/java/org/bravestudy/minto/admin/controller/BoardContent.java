package org.bravestudy.minto.admin.controller;

import org.apache.ibatis.type.Alias;

@Alias("board.BoardContent")
public class BoardContent {
private String content;
private String subject;
private String imgUrl;
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getImgUrl() {
	return imgUrl;
}
public void setImgUrl(String imgUrl) {
	this.imgUrl = imgUrl;
}



}
