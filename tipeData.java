public class tipeData { //blok class
    //blok main --> psvm + tab
public static void main(String[] args) {
    //coding

    /*universitas dinamika membutuhkan aplikasi sederhana
    untuk mencatat biodata mahasiswa, apa saja variabel dan tipe
    data yang diperlukan?
    
    NIM --> string
    Nama --> string
    Alamat --> string
    No. HP --> string
    Jenis Kelamin --> string
    Program Studi --> string
    Dosen Wali --> string
    Sisa BOP --> int
    
    int : utk perhitungan/kalkulus angka
    */

    //1. Deklarasi variabel
    String nim = "25410100069";
    String nama = "Luna";
    String alamat = "Sidoarjo";
    String nohp = "085856459597";
    String jeniskelamin = "perempuan";
    String programstudi = "sistem informasi";
    String dosenwali = "Bu Meli";
    Integer sisabop = 500000;


    //2. Print nilai variabel --> sout + tab
    //cara 1: print tanpa teks tambahan
    System.out.println(nim);

    //cara 2: print dengan teks tambahan
    System.out.println("NIM mahasiswa adalah "+nim+ " dengan nama "+ nama+
    " dengan alamat " + alamat+ " dengan nomor hp" + nohp+ " dengan jenis kelamin" + jeniskelamin+
    " dengan program studi" + programstudi+ " dengan dosen wali" + dosenwali );

    //dengan operator \n (utk enter ke baris baru saat diprint)
    System.out.println("NIM : " +nim + "\n Nama : "+ nama +
    "\n Alamat : "+alamat + "\n No. HP : "+nohp + "\n Jenis Kelamin : "+ jeniskelamin+
    "\n Program Studi : "+ programstudi+ "\n Dosen Wali : "+ dosenwali+ "\n Sisa BOP : "+ sisabop);






}
    }