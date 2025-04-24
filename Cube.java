package praktic.geometry.shapes; // Mendeklarasikan package dari class Cube

import praktic.geometry.bases.Shape; // Mengimpor class Shape sebagai superclass
import praktic.geometry.interfaces.*; // Mengimpor semua interface yang ada di package interfaces

// Mendeklarasikan class Cube yang merupakan subclass dari Shape dan mengimplementasikan interface TD dan Weight
public class Cube extends Shape implements ThreeDimensional, Weightable {
    private double edge; // Atribut private dari sisi kubus
    private double mass; // Atribut massa kubus

    public Cube() { // Konstruktor default / kosongan (Tanpa Parameter)
    }

    // Konstruktor yang berisi 2 parameter yaitu sisi kubus dan massa kubus
    public Cube(double edge, double mass) {
        this.edge = edge;
        this.mass = mass;
    }

    // Method untuk menghitung luas permukaan kubus
    @Override
    public double getSurfaceArea() {
        return 6 * edge * edge;
    }

    // Method untuk menghitung volume kubus
    @Override
    public double getVolume() {
        return edge * edge * edge;
    }

    // Menghitung berat menggunakan massa dan gravitasi
    @Override
    public double getWeight() {
        return mass * g;
    }

    // Menampilkan informasi tentang kubus
    @Override
    public void printInfo() {
        System.out.println("Name         : Cube"); // Nama shape
        System.out.printf("Surface area : %.2f%n", getSurfaceArea()); // Luas Permukaan
        System.out.printf("Volume       : %.2f%n", getVolume()); // Volume
        System.out.printf("Weight       : %.2f%n", getWeight()); // Berat
    }

}
