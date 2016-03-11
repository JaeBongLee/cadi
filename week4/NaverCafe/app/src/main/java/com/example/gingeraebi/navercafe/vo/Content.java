package com.example.gingeraebi.navercafe.vo;

/**
 * Created by GingerAebi on 2016. 3. 5..
 */
public class Content {
    private String title;
    private String name;
    private String time;
    private String viewCount;
    private String content;

    public Content(String title, String name, String time, String viewCount, String content) {
        this.title = title;
        this.name = name;
        this.time = time;
        this.viewCount = viewCount;
        this.content = content;
    }

    public Content(String title, String name, String time, String viewCount) {
        this(title, name, time, viewCount, null);
    }


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
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", viewCount='" + viewCount + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
