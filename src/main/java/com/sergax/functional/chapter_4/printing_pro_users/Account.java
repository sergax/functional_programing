package com.sergax.functional.chapter_4.printing_pro_users;

/**
 * @author : sergax
 * @date : 24.05.22
 */
public class Account {
    private String id;
    private String type;

    public Account(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
