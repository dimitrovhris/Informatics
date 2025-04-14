package onlinePlatform;

public interface Progressable {
    int MAX_PROGRESS = 100;

    int calculateProgressLevel();
    String getProgramLevel();
}
