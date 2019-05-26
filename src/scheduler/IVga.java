package scheduler;

public interface IVga {
    void start();
    void stop();
    void pause();
    void goNext();
    void turnLeft(int degree);
    void turnRight(int degree);
    void goCharge();
    Point getPos();
    String getName();
    int getElevQuatity();
    void setVelocity(int velocity);
}
