package com.example.news.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "news")
public class News {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "news_id")
	private int newsId;
	
	@Column(name = "news_title")
	private String newsTitle;
	
	@Column(name = "news_desc")
	private String newsDesc;
	
	@Column(name = "news_Date")
	private Date newsDate;

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getNewsDesc() {
		return newsDesc;
	}

	public void setNewsDesc(String newsDesc) {
		this.newsDesc = newsDesc;
	}

	public Date getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(Date newsDate) {
		this.newsDate = newsDate;
	}

	public News() {
		super();
		// TODO Auto-generated constructor stub
	}

	public News(int newsId, String newsTitle, String newsDesc, Date newsDate) {
		super();
		this.newsId = newsId;
		this.newsTitle = newsTitle;
		this.newsDesc = newsDesc;
		this.newsDate = newsDate;
	}

	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", newsTitle=" + newsTitle + ", newsDesc=" + newsDesc + ", newsDate="
				+ newsDate + "]";
	}
	
	
}
