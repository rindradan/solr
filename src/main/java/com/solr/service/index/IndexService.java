package com.solr.service.index;

import com.solr.model.Book;
import com.solr.service.search.SearchContext;
import org.apache.solr.client.solrj.SolrServerException;

import java.io.IOException;
import java.util.List;

public interface IndexService
{
    void indexElements(List<Book> bookList) throws IOException, SolrServerException;
    List<Book> searchElement(SearchContext sc);
}
