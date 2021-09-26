package maulana.relasiclass.percobaan1;

public class Processor {
    private String merk;
    private double cache;

    public Processor() {
    }

    public Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }
    public void setCache(double cache) {
        this.cache = cache;
    }
    public double getCache() {
        return cache;
    }
    public void info() {
        System.out.printf("Merk Processor\t: %s\n", merk);
        System.out.printf("Cache Memory\t: %.2f\n", cache);
    }
}
