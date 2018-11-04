
/**
 *
 * @author Rivo
 */
public class Service {
    private String layanan;
    private int harga;

    Service(String layanan, int harga) {
        this.layanan = layanan;
        this.harga = harga;
    }
    
    public int gerHarga(){
        return harga;
    }
    
    public String info(){
        String info = "";
        info +="Layanan yang diberikan : " + this.layanan + "\n";
        info +="Harga : " + this.harga + "\n";
        return info;
    }
    
}
