package com.example.pc_amr.retrofit_1;

/**
 * Created by PC-Amr on 15/09/2017.
 */

public class User {

    private String incomplete_results;

    private Items[] items;

    private String total_count;

    public String getIncomplete_results ()
    {
        return incomplete_results;
    }

    public void setIncomplete_results (String incomplete_results)
    {
        this.incomplete_results = incomplete_results;
    }

    public Items[] getItems ()
    {
        return items;
    }

    public void setItems (Items[] items)
    {
        this.items = items;
    }

    public String getTotal_count ()
    {
        return total_count;
    }

    public void setTotal_count (String total_count)
    {
        this.total_count = total_count;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [incomplete_results = "+incomplete_results+", items = "+items+", total_count = "+total_count+"]";
    }
}
