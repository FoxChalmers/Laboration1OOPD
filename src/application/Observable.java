package application;

import java.util.ArrayList;
import cars.*;

public interface Observable {
    public void updateObservers();
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
}

// Observable interface used for classes that want to be observed by observers.