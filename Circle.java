package praktic.geometry.shapes; // Deklarasi package tempat class Circle berada

import praktic.geometry.bases.CircularShape; // Mengimpor class CircularShape
import praktic.geometry.interfaces.TwoDimensional; // Mengimpor interface Twodimensional

// Class Circle merupakan turunan dari CircularShape dan mengimplementasikan interface TwoDimensional
public class Circle extends CircularShape implements TwoDimensional {
    public Circle() { // Konstruktor default / kosongan (Tanpa parameter)
    }

    // Konstruktor dengan parameter radius untuk mengatur nilai radius
    public Circle(double radius) {
        setRadius(radius);
    }

    @Override
    public double getArea() {
        double r = getRadius(); // Mengambil nilai radius menggunakan getter dari superclass
        return ((double) PI_NUMERATOR / PI_DENOMINATOR) * r * r; // Rumus luas lingkaran
    }

    @Override
    public double getPerimeter() {
        double r = getRadius(); // Mengambil nilai radius menggunakan getter dari superclass
        return 2 * ((double) PI_NUMERATOR / PI_DENOMINATOR) * r; // Rumus keliling lingkaran
    }

    @Override
    // Implementasi method printInfo dari superclasss
    public void printInfo() {
        System.out.println("Name      : Circle"); // Menampilkan nama dari shape
        System.out.printf("Area      : %.2f%n", getArea()); // Menampilkan luas dari lingkaran
        System.out.printf("Perimeter : %.2f%n", getPerimeter()); // Menampilkan keliling dari lingkaran
    }
}
