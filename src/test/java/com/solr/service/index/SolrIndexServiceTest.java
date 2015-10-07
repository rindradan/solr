package com.solr.service.index;

import com.solr.model.Book;
import com.solr.service.BaseTest;
import org.apache.solr.client.solrj.SolrServerException;

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
            list.add(book);
        }

        indexService.indexElements(list);
    }
}
