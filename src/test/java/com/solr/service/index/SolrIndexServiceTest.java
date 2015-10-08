package com.solr.service.index;

import com.solr.model.Book;
import com.solr.service.BaseTest;
import com.solr.service.search.SearchContext;
import org.apache.solr.client.solrj.SolrServerException;
import org.joda.time.DateTime;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class SolrIndexServiceTest extends BaseTest
{
    public void testAddDocument() throws IOException, SolrServerException
    {
        List<Book> list = new LinkedList<Book>();

        for (int i = 0 ; i < 100 ; i++)
        {
            Book book = new Book();
            book.setId("book_" + i);
            book.setTitle("The Legend of the Hobbit part " + i);
            DateTime date = DateTime.now();
            date = date.plusDays(i);
            book.setPublishedDate(date.toDate());
//            System.out.println(date.toDate());
            list.add(book);
        }

        indexService.indexElements(list);
    }

    public void testDropIndexes() throws IOException, SolrServerException
    {
        indexService.dropIndex();
    }

    public void testSearchDocument()
    {
        SearchContext sc = new SearchContext();

    }
}
