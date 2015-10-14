package com.solr.service.index;

import com.solr.model.Book;
import com.solr.service.BaseTest;
import com.solr.service.search.SearchContext;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.joda.time.DateTime;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class SolrIndexServiceTest extends BaseTest
{
    public void testAddDocument() throws IOException, SolrServerException
    {
        List<Book> list = new LinkedList<Book>();

        for (int i = 10 ; i < 20 ; i++)
        {
            Book book = new Book();
            book.setId("book_" + i);
            book.setTitle("Lancelot part " + i);
            DateTime date = DateTime.now();
            date = date.plusDays(i);
            book.setPublishedDate(date.toDate());
            book.setCategory("roman");
//            System.out.println(date.toDate());
            list.add(book);
        }

        indexService.indexElements(list);
    }

    public void testDropIndexes() throws IOException, SolrServerException
    {
        indexService.dropIndex();
    }

    public void testSearchDocument() throws SolrServerException
    {
        SearchContext sc = new SearchContext();
        sc.setQ("*:*");
        sc.getFilters().add("category:adventure");
        sc.setRows(10);

        for (SolrDocument doc : searchService.searchElement(sc))
        {
            System.out.println(doc.toString());
        }
    }
}
