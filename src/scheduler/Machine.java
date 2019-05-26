package scheduler;

public class Machine implements IMachine{
    Point pos;
    int surplusProcessTime;
    int processTime;
    String name;

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void load() {

    }

    @Override
    public void restart() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Point getPos() {
        return null;
    }

    @Override
    public void unload() {

    }

    @Override
    public int getSurplusProcessTime() {
        return 0;
    }
}
