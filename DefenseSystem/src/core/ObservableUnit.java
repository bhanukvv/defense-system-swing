package core;

public interface ObservableUnit {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String message);

    String getUnitName();
    Strength getStrength();
    void setStrength(Strength s);

    int getSoldiers();
    int getAmmo();

    void receiveBroadcast(String from, String message, Strength globalStrength);
}
