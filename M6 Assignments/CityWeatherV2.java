public class CityWeatherV2 {
    private String[] months;
    private double[] temps;
    private double[] precipitation;

    public CityWeatherV2(String[] a, double[] b, double[] c) {
        months = a;
        temps = b;
        precipitation = c;
    }

    public void setMonths(String a, int i) {
        months[i] = a;
    }

    public void setTemps(double a, int i) {
        temps[i] = a;
    }

    public void setPrecipitation(double a, int i) {
        precipitation[i] = a;
    }

    public String getMonths(int a) {
        return months[a];
    }

    public double getTemps(int a) {
        return temps[a];
    }

    public double getPrecipitation(int a) {
        return precipitation[a];
    }

    
    public double averageTemp() {
        double tempTotal = 0.0;
        for (int i = 0; i<temps.length; i++) {
            tempTotal += temps[i];
        }
        return (tempTotal / temps.length);
    }
      
    public double precipTotal() {
        double total = 0.0;
        for (int i = 0; i<precipitation.length; i++) {
            total += precipitation[i];
        }
        return total;
    }

    public void convertCelsius() {
        double tempValue = 0.0;
        for (int i = 0; i<temps.length; i++) {
            tempValue = temps[i];
            temps[i] = ((tempValue - 32.0) * (5.0/9.0));
        }
    }
    
    public void convertCentimeters() { 
        double tempValue = 0.0;
        for (int i = 0; i<precipitation.length; i++) {
            tempValue = precipitation[i];
            precipitation[i] = (tempValue * 2.54);
        }
    }


}