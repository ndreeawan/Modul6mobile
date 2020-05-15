package com.example.modul6;

public class konfigurasi {
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String
            URL_ADD="https://ndreeawan1616.000webhostapp.com/prakModul6/insert.php";
    public static final String URL_GET_ALL =
            "https://ndreeawan1616.000webhostapp.com/prakModul6/read.php";
    public static final String URL_GET_MHS =
            "https://ndreeawan1616.000webhostapp.com/prakModul6/select.php?id=";
    public static final String URL_UPDATE_MHS =
            "https://ndreeawan1616.000webhostapp.com/prakModul6/update.php";
    public static final String URL_DELETE_MHS =
            "https://ndreeawan1616.000webhostapp.com/prakModul6/delete.php";
    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Script PHP
    public static final String KEY_MHS_ID = "id";
    public static final String KEY_MHS_NAMA = "nama";
    public static final String KEY_MHS_JURUSAN = "jurusan";
    public static final String KEY_MHS_EMAIL = "email";
    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_JURUSAN = "jurusan";
    public static final String TAG_EMAIL = "email";
    //ID Mahasiswa
//mhs itu singkatan dari Mahasiswa
    public static final String MHS_ID = "mhs_id";
}
