package praktic.geometry.bases; // Deklarasi package tempat class ini berada

public abstract class CircularShape extends Shape { // Deklarasi class abstrak CircularShape yang merupakan turunan dari
                                                    // class Shape
    private double radius; // Atribut radius yang bersifat private

    // Atribut yang bersifat protected dan digunakan untuk menghitung nilai Phi
    protected final int PI_NUMERATOR = 22;
    protected final int PI_DENOMINATOR = 7;

    public CircularShape() { // Konstruktor CircularShape tanpa parameter / kosongan
    }

    public void setRadius(double inputRadius) { // Method setter untuk mengatur nilai jari - jari
        this.radius = inputRadius;
    }

    public double getRadius() { // Method getter untuk mengambil nilai jari - jari
        return radius;
    }
}
