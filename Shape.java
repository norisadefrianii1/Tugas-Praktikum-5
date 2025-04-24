package praktic.geometry.bases; // Deklarasi package tempat kelas ini berada

// Deklarasi class abstrak shape yang merupakan base class untuk semua bentuk shape
public abstract class Shape {
    private String name; // Atribut private untuk menyimpan nama dari shape

    public Shape() { // Konstruktor kosong atau tanpa parameter
    }

    public void setName(String inputName) { // Method setter untuk mengantur nama dari shape
        this.name = inputName;
    }

    public String getName() { // Method getter untuk mengambil nilai nama
        return name;
    }

    // Method abstrak yang diimplementasikan oleh semua subclass untuk mencetak
    // informasi mengenai shape
    public abstract void printInfo();
}
