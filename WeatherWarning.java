public class WeatherWarning implements Observer {

    //El umbral es mayor a 30 para una advertencia del calor, menor a 15 para una con frio y entre estos dos no existe advertencia;
    @Override
    public void update(int temperature) {
        if (temperature > 30) {
            System.out.println("El clima es demasiado caliente! Temperatura: " + temperature);
        } else if (temperature < 15) {
            System.out.println("Esta haciendo demasiado frio! Temperatura: " + temperature);
        }
    }
}
