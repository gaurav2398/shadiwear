package com.shadiwear.Models;

import java.util.Arrays;

public class MainProductListModel {
    private double product_id;
    private String product_cover_image;
    private String[] product_images;
    private String product_name;
    private String product_city;
    private String product_availability;
    private int product_rent;
    private String product_description;
    private int product_category;

    public MainProductListModel(double product_id, String product_cover_image, String[] product_images, String product_name, String product_city, String product_availability, int product_rent, String product_description, int product_category) {
        this.product_id = product_id;
        this.product_cover_image = product_cover_image;
        this.product_images = product_images;
        this.product_name = product_name;
        this.product_city = product_city;
        this.product_availability = product_availability;
        this.product_rent = product_rent;
        this.product_description = product_description;
        this.product_category = product_category;
    }

    public double getProduct_id() {
        return product_id;
    }

    public void setProduct_id(double product_id) {
        this.product_id = product_id;
    }

    public String getProduct_cover_image() {
        return product_cover_image;
    }

    public void setProduct_cover_image(String product_cover_image) {
        this.product_cover_image = product_cover_image;
    }

    public String[] getProduct_images() {
        return product_images;
    }

    public void setProduct_images(String[] product_images) {
        this.product_images = product_images;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_city() {
        return product_city;
    }

    public void setProduct_city(String product_city) {
        this.product_city = product_city;
    }

    public String getProduct_availability() {
        return product_availability;
    }

    public void setProduct_availability(String product_availability) {
        this.product_availability = product_availability;
    }

    public int getProduct_rent() {
        return product_rent;
    }

    public void setProduct_rent(int product_rent) {
        this.product_rent = product_rent;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public int getProduct_category() {
        return product_category;
    }

    public void setProduct_category(int product_category) {
        this.product_category = product_category;
    }

    @Override
    public String toString() {
        return "MainProductListModel{" +
                "product_id=" + product_id +
                ", product_cover_image='" + product_cover_image + '\'' +
                ", product_images=" + Arrays.toString(product_images) +
                ", product_name='" + product_name + '\'' +
                ", product_city='" + product_city + '\'' +
                ", product_availability='" + product_availability + '\'' +
                ", product_rent=" + product_rent +
                ", product_description='" + product_description + '\'' +
                ", product_category=" + product_category +
                '}';
    }
}
