package com.tistory.ospace.test.entity;

import java.time.LocalDateTime;

public class Post {
	private String id;
	private String title;
	private String content;
	private LocalDateTime createAt;
	private LocalDateTime modifyAt;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public LocalDateTime getCreateAt() {
		return createAt;
	}
	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}
	public LocalDateTime getModifyAt() {
		return modifyAt;
	}
	public void setModifyAt(LocalDateTime modifyAt) {
		this.modifyAt = modifyAt;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", content=" + content + ", createAt=" + createAt + ", modifyAt="
				+ modifyAt + "]";
	}
}
