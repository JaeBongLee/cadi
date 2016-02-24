package nhnnext.org.gingeraebi.navercafe.CafeHome;

/**
 * Created by JaeBong on 16. 2. 22..
 */
public class CafeInfo {
    private String logoImageName;
    private String cafeName;

    public CafeInfo(String logoImageName , String cafeName) {
        this.cafeName = cafeName;
        this.logoImageName = logoImageName;
    }

    public String getCafeName() {
        return cafeName;
    }

    public String getLogoImageName() {
        return logoImageName;
    }
}