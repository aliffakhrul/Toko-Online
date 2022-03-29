
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class Karyawan implements User {

    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public Karyawan() {
        this.namaKaryawan.add("Alip #4");
        this.alamat.add("Pasuruan");
        this.telepon.add("081259400176");
        this.jabatan.add(0);
    }

    public void setJabatan(int jabatan) {
        this.jabatan.add(jabatan);
    }

    public int getJabatan(int idMember) {
        return this.jabatan.get(idMember);
    }

    public int getJmlKaryawan() {
        return this.namaKaryawan.size();
    }

    @Override
    public void setNama(String namaKaryawan) {
        this.namaKaryawan.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idKaryawan) {
        return this.namaKaryawan.get (idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get (idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get (idKaryawan);
    }

}