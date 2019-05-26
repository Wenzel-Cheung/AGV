package scheduler;

import java.util.ArrayList;

public interface IRoute {
    void addPoint(Point pos);
    void deleteFirstPoint();
    Point getFirstPoint();
    String getRouteNumber();
    void setRouteName();
}
