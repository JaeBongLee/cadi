package nhnnext.org.gingeraebi.myapplication;

/**
 * Created by JaeWon on 2016-02-20.
 */
public class Contents {
    private String title;
    private String name;
    private String time;
    private int viewCount;

    public Contents(String name, String time, String title, int viewCount) {
        this.name = name;
        this.time = time;
        this.title = title;
        this.viewCount = viewCount;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getTitle() {
        return title;
    }

    public int getViewCount() {
        return viewCount;
    }
}