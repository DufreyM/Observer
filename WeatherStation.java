import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observers; 
    private int actualtemperature; 

    public WeatherStation(){
        observers = new ArrayList<>();
    }

    public void setactualtemperature(int temperature){
        this.actualtemperature=temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
       observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
      observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.actualtemperature);
        }
    }
    
}
