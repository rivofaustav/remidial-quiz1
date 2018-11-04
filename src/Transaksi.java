
/**
 *
 * @author Rivo
 */
public class Transaksi {
    private Mobil mobil;
    private Service service;
    private Pegawai pegawai;

    Transaksi(Mobil mobil, Service service, Pegawai pegawai) {
        this.mobil = mobil;
        this.service = service;
        this.pegawai = pegawai;
    }
    
    public int totalBiaya(){
        return service.gerHarga() + mobil.getHarga();
    }
    
    public void print(){
        System.out.println(pegawai.info());
        System.out.println(mobil.info());
        System.out.println(service.info());
        System.out.println("Total Biaya : " + totalBiaya());
    }
    
    
}
