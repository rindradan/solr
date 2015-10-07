package com.solr.service.index.impl;

import com.solr.model.Book;
import com.solr.service.index.IndexService;
import com.solr.service.search.SearchContext;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;

import java.io.IOException;
import java.util.List;

public class IndexServiceImpl implements IndexService
{
    private HttpSolrServer solrServer;

    public IndexServiceImpl()
    {
        solrServer = new HttpSolrServer("http://localhost:6080/solr");
    }

    public void indexElements(List<Book> books) throws IOException, SolrServerException
    {
        int i = 0;

        for (Book book : books)
        {
            SolrInputDocument document = new SolrInputDocument();
            document.addField("id", book.getId());
            document.addField("title", book.getTitle());
            document.addField("author", book.getAuthor());
            document.addField("publishedDate", book.getPublishedDate());

            solrServer.add(document);

            if (i % 10 == 0)
                solrServer.commit();

            i++;
        }

        solrServer.commit();

    }

    public List<Book> searchElement(SearchContext sc)
    {
        return null;
    }
}
