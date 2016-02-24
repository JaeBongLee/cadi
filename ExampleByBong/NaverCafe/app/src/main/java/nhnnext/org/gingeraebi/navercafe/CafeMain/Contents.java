package nhnnext.org.gingeraebi.navercafe.CafeMain;

/**
 * Created by JaeBong on 16. 2. 22..
 */
public class Contents {
    private String title;
    private String name;
    private String time;
    private int viewCount;

    public Contents(String title,  String name, String time, int viewCount) {
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