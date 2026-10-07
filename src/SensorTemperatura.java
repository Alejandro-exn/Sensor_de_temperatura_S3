public class SensorTemperatura {
    private String idSensor;
    private double valorActual;
    private String unidad;

    public String getIdSensor() {
        return idSensor;
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }

    public double getValorActual() {
        return valorActual;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void mostrarLectura(){
        System.out.println("Sensor "+ idSensor +":"+ valorActual +" "+unidad);
    }

}
