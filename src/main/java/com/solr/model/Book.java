package com.solr.model;

import java.util.Date;

public class Book
{
    private String id;
    private String title;
    private String author;
    private Date publishedDate;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public Date getPublishedDate()
    {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate)
    {
        this.publishedDate = publishedDate;
    }
}
