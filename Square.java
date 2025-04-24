package praktic.geometry.shapes; // Deklarasi package dari class square

import praktic.geometry.bases.Shape; // Mengimpor Shape sebagai superclass
import praktic.geometry.interfaces.TwoDimensional; // Mengimpor interface TD

// Mendeklarasikan kelas Sphere yang merupakan turunan dari Shape dan mengimplementasikan interface TD
public class Square extends Shape implements TwoDimensional {
    private double side; // Atribut private sisi persegi

    public Square() { // Konstruktor default tanpa parameter
    }

    // Konstruktor dengan parameter sisi persegi
    public Square(double side) {
        this.side = side;
    }

    // Method untuk menghitung dan mengembalikan nilai dari luas persegi
    @Override
    public double getArea() {
        return side * side;
    }

    // Method untuk menghitung dan mengembalikan nilai dari keliling persegi
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    // Menampilkan informasi tentang persegi
    @Override
    public void printInfo() {
        System.out.println("Name         : Square");
        System.out.printf("Area         : %.2f%n", getArea());
        System.out.printf("Perimeter    : %.2f%n", getPerimeter());
    }

}
