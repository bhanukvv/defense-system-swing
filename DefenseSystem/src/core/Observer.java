
package core;


public interface Observer {
    void onNotify(ObservableUnit, String message, Strength strength);
}
