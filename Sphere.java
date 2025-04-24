package praktic.geometry.shapes; // Deklarasi package dari class Sphere

import praktic.geometry.bases.CircularShape; // Mengimpor CircularShape sebagai superclass
import praktic.geometry.interfaces.*; // Mengimpor seluruh interfaces

// Mendeklarasikan class Sphere yang merupakan turunan dari CircularShape dan mengimplementasikan interface TD dan Weight
public class Sphere extends CircularShape implements ThreeDimensional, Weightable {
    private double mass; // Atribut private massa bola

    public Sphere() { // Konstruktor kosong tanpa parameter
    }

    // Konstruktor dengan parameter jari - jari dan massa
    public Sphere(double radius, double mass) {
        setRadius(radius); // Mengatur radius menggunakan setter dari superclass
        this.mass = mass;
    }

    // Method untuk menghitung luas permukaan bola
    @Override
    public double getSurfaceArea() {
        double r = getRadius(); // Mengambil nilai radius menggunakan getter
        return 4 * ((double) PI_NUMERATOR / PI_DENOMINATOR) * r * r; // Rumus luas permukaan bola
    }

    // Method untuk menghitung volume bola
    @Override
    public double getVolume() {
        double r = getRadius(); // Mengambil nilai radius menggunakan getter
        return (4.0 / 3.0) * ((double) PI_NUMERATOR / PI_DENOMINATOR) * r * r * r; // Rumus volume bola
    }

    // Method untuk mendapatkan berat menggunakan massa dan gravitasi
    @Override
    public double getWeight() {
        return mass * g;
    }

    // Menampilkan informasi dari bola
    @Override
    public void printInfo() {
        System.out.println("Name         : Sphere");
        System.out.printf("Surface area : %.2f%n", getSurfaceArea());
        System.out.printf("Volume       : %.2f%n", getVolume());
        System.out.printf("Weight       : %.2f%n", getWeight());
    }

}
