package praktic.geometry.mains; // Deklarasi package tempat kelas ini berada

import java.util.Scanner; // Import class scanner untuk input dari pengguna
import praktic.geometry.interfaces.*; // Import semua interface dari package interfaces
import praktic.geometry.shapes.*; // Import semua class shape dari package shapes

/* Norisa Defriani - 245150707111038
  /|    / / //   ) ) //   ) )    / /    //   ) )  // | | 
   //|   / / //   / / //___/ /    / /    ((        //__| | 
  // |  / / //   / / / ___ (     / /       \\     / ___  | 
 //  | / / //   / / //   | |    / /          ) ) //    | | 
//   |/ / ((___/ / //    | | __/ /___ ((___ / / //     |
         
*/

public class ShapeCalculator {// Deklarasi main class
    // Atribut untuk mencetak warna dari kode
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String WHITE = "\u001B[37m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner untuk menerima input dari user

        // Header dari program ini
        System.out.println(RED + "===================================" + RESET); // Merupakan garis pemisah berwarna
                                                                                 // merah
        System.out.println("Shape Calculator");
        System.out.println("Norisa Defriani ");
        System.out.println("245150707111038");
        System.out.println(RED + "===================================" + RESET);

        // 2D Circle
        System.out.println(BLUE + "2D Circle" + RESET); // Mencetak '2D Circle' yang merupakan nama dari shape lingkaran
        System.out.println(RED + "===================================" + RESET);
        // Mencetak 'enter radius' untuk meminta user memasukkan nilai radius dari
        // lingkaran
        System.out.print("Enter radius : ");
        double radius = input.nextDouble();
        System.out.println(RED + "===================================" + RESET);
        // Membuat objek Circle dengan radius dari inputan user dan menampilkan info
        // mengenai Circle
        Circle circle = new Circle(radius);
        circle.printInfo();

        // 2D Square
        System.out.println(RED + "===================================" + RESET);
        System.out.println(BLUE + "2D Square" + RESET); // Mencetak '2D Square' yang merupakan nama dari shape persegi
        System.out.println(RED + "===================================" + RESET);
        // Mencetak 'enter side' untuk meminta user memasukkan nilai sisi dari persegi
        System.out.print("Enter side : ");
        double side = input.nextDouble();
        System.out.println(RED + "===================================" + RESET);
        // Membuat objek Square dengan sisi dari inputan user dan menampilkan info dari
        // persegi
        Square square = new Square(side);
        square.printInfo();

        // 3D Cube
        System.out.println(RED + "===================================" + RESET);
        System.out.println(BLUE + "3D Weightable Cube" + RESET); // Mencetak '3D Weightable Cube' yang merupakan nama
                                                                 // dari shape kubus
        System.out.println(RED + "===================================" + RESET);
        // Mencetak 'enter edge' untuk meminta user memasukkan nilai dari tepi sisi
        // kubus
        System.out.print("Enter edge : ");
        double edge = input.nextDouble();
        // Mencetak 'enter mass' untuk meminta user memasukkan nilai massa dari kubus
        System.out.print("Enter mass : ");
        double cubeMass = input.nextDouble();
        System.out.println(RED + "===================================" + RESET);
        // Membuat objek Cube dengan sisi dan massa dari kubus
        Cube cube = new Cube(edge, cubeMass);
        // Menampilkan informasi mengenai kubus
        cube.printInfo();

        // 3D Sphere
        System.out.println(RED + "===================================" + RESET);
        System.out.println(BLUE + "3D Weightable Sphere" + RESET); // Mencetak 'Sphere' yang merupakan nama dari shape
                                                                   // bola
        System.out.println(RED + "===================================" + RESET);
        // Mencetak 'Enter Radius' untuk meminta user memasukkan nilai radius dari bola
        System.out.print("Enter radius : ");
        double sphRadius = input.nextDouble();
        // Mencetak 'Enter mass' untuk meminta user memasukkan nilai massa dari bola
        System.out.print("Enter mass   : ");
        double sphMass = input.nextDouble();
        System.out.println(RED + "===================================" + RESET);
        // Membuat objek Sphere dengan radius dan massa dari bola
        Sphere sphere = new Sphere(sphRadius, sphMass);
        sphere.printInfo();

        // Polimorfisme
        System.out.println(RED + "===================================" + RESET);
        // Menampilkan header dari polimorfisme yang menjelaskan bahwa volume dan weight
        // itu dihitung menggunakan referensi dari interface
        System.out.println(BLUE + "Volume of Cube and Sphere" + RESET);
        System.out.println(BLUE + "POLYMORPHISM: INTERFACE" + RESET);
        System.out.println(RED + "===================================" + RESET);

        // Meminta user untuk memasukkan nilai dari tepi sisi kubus, jari jari bola, dan
        // massa untuk kedua shape
        System.out.print("Enter edge    : ");
        double e = input.nextDouble();
        System.out.print("Enter radius  : ");
        double r = input.nextDouble();
        System.out.print("Enter mass    : ");
        double m = input.nextDouble();

        ThreeDimensional tdCube = new Cube(e, m); // Membuat objek Cube dan disimpan dalam interface ThreeDimensional
        ThreeDimensional tdSphere = new Sphere(r, m); // Membuat objek Sphere dan disimpan dalam interface
                                                      // ThreeDimensional
        Weightable wSphere = new Sphere(r, m); // Membuat objek Sphere dan disimpan dalam interface Weightable

        // Menampilkan hasil perhitungan
        System.out.println(RED + "===================================" + RESET);
        System.out.printf("Cube's volume    : %.2f%n", tdCube.getVolume()); // getVolume untuk kubus yang dipanggil dari
                                                                            // interface ThreeDimensional
        System.out.printf("Sphere's volume  : %.2f%n", tdSphere.getVolume()); // getVolume untuk sphere yang dipanggil
                                                                              // dari interface ThreeDimensional
        System.out.printf("Weight           : %.2f%n", wSphere.getWeight()); // getWeight yang dipanggil dari interface
                                                                             // Weightable
        System.out.println(RED + "===================================" + RESET);

        input.close(); // Menutup objek scanner
    }
}
