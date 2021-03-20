package com.awasur.todo.data;

import org.springframework.data.annotation.Id;

//SIMPLE CLASS TO REPRESENT THE TODO OBJECT
public class ToDo {
    @Id //SPRING AUTO GENERATES THE ID FOR US
    private String id;
    private String title;
    private Boolean completed;

    public ToDo(String title, Boolean completed) {
        this.title = title;
        this.completed = completed;
    }

    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public Boolean getCompleted() {
        return completed;
    }
}
