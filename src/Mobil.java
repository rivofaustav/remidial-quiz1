
/**
 *
 * @author Rivo
 */
public class Mobil {
    private String jenis;
    private int harga;
    private String merk;

    Mobil(String jenis, int harga, String merk) {
        this.jenis = jenis;
        this.harga = harga;
        this.merk = merk;
    }

    public int getHarga() {
        return harga;
    }
    
    public String info(){
        String info = "";
        info +="Jenis Mobil : " + this.jenis + "\n";
        info +="Merk Mobil : " + this.merk + "\n";
        info +="Harga : " + this.harga + "\n";
        return info;
    }
}
