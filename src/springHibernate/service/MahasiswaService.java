package springHibernate.service;

/**
 *
 * @author Asus
 */

import springHibernate.model.Mahasiswa;
import java.util.List;

public interface MahasiswaService {
    public void save(Mahasiswa mahasiswa);
    public void update(Mahasiswa mahasiswa);
    public void delete(Mahasiswa mahasiswa);
    public Mahasiswa getMahasiswa(String npm);
    public List<Mahasiswa> getMahasiswas();
}
