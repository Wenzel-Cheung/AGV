package scheduler;

public interface IMachine {
    void start();
    void stop();
    void pause();
    void load();
    void restart();
    String getName();
    Point getPos();
    void unload();
    int getSurplusProcessTime();
}
