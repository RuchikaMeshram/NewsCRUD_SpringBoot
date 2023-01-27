package com.example.news.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.news.model.News;
import com.example.news.repository.NewsRepository;

@Service
public class NewsService {

	@Autowired
	private NewsRepository newsRepository;
	
	public News addNews(News news)
	{
		return newsRepository.save(news);
	}
	
	public boolean deletenews(News news)
	{
		boolean res = false;
		try {
			newsRepository.delete(news);
			res =true;
		}
		catch(Exception e)
		{
			res = false;
			
		}
		
		return res;
	}
	
	public List<News> getAllNews()
	{
		return newsRepository.findAll();
	}
	
	public News getNews(int newsId)
	{
		return newsRepository.findById(newsId).get();
	}
}
