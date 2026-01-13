
package core;


public interface Observer {
    void onNotify(ObservableUnit unit, String message, Strength strength);
}
