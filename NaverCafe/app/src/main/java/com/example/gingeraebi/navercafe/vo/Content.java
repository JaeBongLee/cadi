package com.example.gingeraebi.navercafe.vo;

/**
 * Created by GingerAebi on 2016. 3. 5..
 */
public class Content {
    private int id;
    private String title;
    private String name;
    private String time;
    private String viewCount;
    private String content;

    public Content(int id, String title, String name, String time, String viewCount, String content) {
        this.id =id;
        this.title = title;
        this.name = name;
        this.time = time;
        this.viewCount = viewCount;
        this.content = content;
    }

    public Content(String title, String name, String time, String viewCount, String content) {
        this(0, title, name, time, viewCount, content);
    }

    public Content(String title, String name, String time, String viewCount) {
        this(title, name, time, viewCount, null);
    }

    public int getId() { return id; }


    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getViewCount() {
        return viewCount;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id='" + id + '\'' +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", viewCount='" + viewCount + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
