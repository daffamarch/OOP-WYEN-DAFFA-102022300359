class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    private Boolean vipcard;
    
    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(Boolean vipCard, Float hargaPerJam, int jumlahKomputer, String namaWarnet) {
        super(hargaPerJam, jumlahKomputer, namaWarnet);
        this.vipCard = vipCard;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 

    @Override
    public void Informasi() {
        // TODO Auto-generated method stub
        super.Informasi();
        if (vipcard){
            System.out.println("Status: VIP");
            System.out.println("Diskon 10% main diatas 3 jam");
            System.out.println("gratis minuman setiap 4 jam bermain");
            System.out.println("prioritas booking komputer gaming");
        }
        else{
            System.out.println("Status: NON VIP");
        }
    }
    
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)

    // To do: Buatlah method Login sesuai dengan ketentuan
    public void Login(String username){
        System.out.println("login dengan username " + username);
        System.out.println("jam + " tambahan jam );
    }
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void bermain(int jam){
        System.out.println("bermain selama" + jam);
    }
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan
    public void bermain(int jam, int menit_tambahan){
        System.out.println("Tambah billing selama" + jam);
    }
    
    
}