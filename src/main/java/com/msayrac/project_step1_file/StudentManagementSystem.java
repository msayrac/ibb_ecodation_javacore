package com.msayrac.project_step1_file;

import java.util.ArrayList;

// Öğrenci yönetim sistemi
public class StudentManagementSystem {

    // Field
    private ArrayList<StudentDto> students = new ArrayList<>();
    private int studentCounter = 0;
    private static final String FILE_NAME = "student.txt";

    // static  nesne boyunca bir kere olusturulur
    static {


    }

    //parametresiz constructor
    public StudentManagementSystem() {
        // Program baslarken öğrenci listesini hemen yüklesin
        loadStudentListFromFile();

    }

    // Öğrenci listesini yükle (Dosya)
    private void loadStudentListFromFile() {

    }

    //ögrenci ekle
    public void add(StudentDto dto) {
        students.add(new StudentDto(++studentCounter,dto.getName(),dto.getSurname(),dto.getBirthday(),dto.getGrade()));
        System.out.println("Öğrenci eklendi. ");
        
        //File Ekle
        saveToFile();

    }

    private void saveToFile() {
    }


    //öğrenci listesi
    // ögrenci ara
    // ögrenci güncelle
    // ögrenci sil

    // ////////////////////////////////////////

    // file create
    // ogrenci dosyaalrını kaydeden metod
    // ogrenci dosyalarını okuyan metod

    // ////////////////////////////////////////

    // toplam ogrenci sayısı
    // ögrenci not ortalaması hesapla
    // en yuksek veya en dusuk not alan ogrenci
    // ögrenci sıralaması (dogun gunu)
    // console secim (ogrenci ekle)


}
