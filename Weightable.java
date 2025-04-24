package praktic.geometry.interfaces; // Deklarasi packkage tempat interface berada

// Deklarasi interface yang merepresentasikan berat dari objek
public interface Weightable {

    // Konstanta dari gravitasi untuk menghitung berat dari massa
    double g = 9.8;

    // Method untuk menghitung berat
    double getWeight();
}
