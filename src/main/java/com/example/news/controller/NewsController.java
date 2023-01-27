package com.example.news.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.news.model.News;
import com.example.news.service.NewsService;

@RestController
public class NewsController {
	
	@Autowired
	private NewsService newsService;
	
	@PostMapping("/save-news")
	public News addNews(@RequestBody News news)
	{
		return newsService.addNews(news);
	}
	
	@PostMapping("/delete-news")
	public String deleteNews(@RequestBody News news)
	{
		boolean res = newsService.deletenews(news);
		if(res)
		{
			return "Record Deleted Successfully...";
		}
		else 
		{
			return "Record Not deleted...";
		}
	}

	@GetMapping("/news")
	public List<News> getAllNews()
	{
		return newsService.getAllNews();
	}
	
	@GetMapping("/news/{newsId}")
	public News getNews(@PathVariable("newsId") int newsId)
	{
		return newsService.getNews(newsId);
	}
	
}
