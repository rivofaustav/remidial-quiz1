

/**
 *
 * @author Rivo
 */
public class Pegawai {
    private String nama;
    private String pekerjaan;

    Pegawai(String nama, String pekerjaan) {
        this.nama = nama;
        this.pekerjaan = pekerjaan;
    }
    
    public String info(){
        String info = "";
        info +="Nama : " + this.nama + "\n";
        info +="Pekerjaan : " + this.pekerjaan + "\n";
        return info;
    }
    
    
}
