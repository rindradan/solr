package com.solr.service.search;

public class SearchContext
{
    private String q;
    private String sort;
    private int start;
    private int stop;

    public String getQ()
    {
        return q;
    }

    public void setQ(String q)
    {
        this.q = q;
    }

    public String getSort()
    {
        return sort;
    }

    public void setSort(String sort)
    {
        this.sort = sort;
    }

    public int getStart()
    {
        return start;
    }

    public void setStart(int start)
    {
        this.start = start;
    }

    public int getStop()
    {
        return stop;
    }

    public void setStop(int stop)
    {
        this.stop = stop;
    }
}
