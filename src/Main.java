public class Main {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Asep", 4, "Siam");
        Burung burung1 = new Burung("Agus", 1, "Biru");

        System.out.println("Detail Hewan");

        kucing1.infoHewan();
        kucing1.suara();
        kucing1.makan();
        kucing1.makan("Whiskas");

        System.out.println();

        burung1.infoHewan();
        burung1.suara();
        burung1.makan();
        burung1.makan("biji");
    }
}