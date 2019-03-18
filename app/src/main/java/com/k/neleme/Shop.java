package com.k.neleme;

/**
 * Created by MaxChanger on 2019/3/14.
 */

public class Shop {
    private String name;
    private int imageId;
    private int nextId;

    public Shop(String name, int imageId, int nextId) {
        this.name = name;
        this.imageId = imageId;
        this.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public int getNextId() {
        return nextId;
    }
}
