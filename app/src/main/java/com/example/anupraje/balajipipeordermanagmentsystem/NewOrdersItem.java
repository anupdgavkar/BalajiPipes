package com.example.anupraje.balajipipeordermanagmentsystem;

public class NewOrdersItem  {
    private String ordernumber;
    private String order_title_price;
    private String order_dispatch_date;
    private String order_date;
    private String order_customer_name;
    private String order_address;
    private String order_customer_gst_no;
    private String order_customer_mo_no;

    public NewOrdersItem(String ordernumber, String order_title_price, String order_dispatch_date, String order_date, String order_customer_name, String order_address, String order_customer_gst_no, String order_customer_mo_no)
    {
        this.ordernumber = ordernumber;
        this.order_title_price = order_title_price;
        this.order_dispatch_date = order_dispatch_date;
        this.order_date = order_date;
        this.order_customer_name = order_customer_name;
        this.order_address = order_address;
        this.order_customer_gst_no = order_customer_gst_no;
        this.order_customer_mo_no = order_customer_mo_no;
    }

    public NewOrdersItem() {
    }


    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getOrder_title_price() {
        return order_title_price;
    }

    public void setOrder_title_price(String order_title_price) {
        this.order_title_price = order_title_price;
    }

    public String getOrder_dispatch_date() {
        return order_dispatch_date;
    }

    public void setOrder_dispatch_date(String order_dispatch_date) {
        this.order_dispatch_date = order_dispatch_date;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getOrder_customer_name() {
        return order_customer_name;
    }

    public void setOrder_customer_name(String order_customer_name) {
        this.order_customer_name = order_customer_name;
    }

    public String getOrder_address() {
        return order_address;
    }

    public void setOrder_address(String order_address) {
        this.order_address = order_address;
    }

    public String getOrder_customer_gst_no() {
        return order_customer_gst_no;
    }

    public void setOrder_customer_gst_no(String order_customer_gst_no) {
        this.order_customer_gst_no = order_customer_gst_no;
    }

    public String getOrder_customer_mo_no() {
        return order_customer_mo_no;
    }

    public void setOrder_customer_mo_no(String order_customer_mo_no) {
        this.order_customer_mo_no = order_customer_mo_no;
    }






}
