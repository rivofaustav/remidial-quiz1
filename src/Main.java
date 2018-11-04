
/**
 *
 * @author Rivo
 */
public class Main {
    public static void main(String[] args){
        Service S = new Service("Cuci Wax", 100000);
        Mobil M = new Mobil("Small", 100000, "Brio");
        Pegawai P = new Pegawai("Robert", "Pencuci");
        Transaksi T = new Transaksi(M, S, P);
        
        T.print();
    }
}
