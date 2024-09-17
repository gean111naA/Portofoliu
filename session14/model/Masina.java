package ro.siit.session14.model;

public class Masina implements Comparable<Masina>{
    private String marca;
    private int anFabricatie;
    private double km;

    public Masina(String marca, int anFabricatie, double km) {
        this.marca = marca;
        this.anFabricatie = anFabricatie;
        this.km = km;
    }

    // @Override
    public int compareTo(Masina altaMasina) {
        return this.marca.compareToIgnoreCase(altaMasina.marca);
    }

    public Integer getAnFabricatie() {
        return anFabricatie;
    }

    public double getKm() {
        return km;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", km=").append(km);
        sb.append('}');
        return sb.toString();
    }
}
