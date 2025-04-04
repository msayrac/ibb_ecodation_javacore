package com.msayrac.project_step1_file;

import java.io.*;
import java.util.ArrayList;

// Öğrenci yönetim sistemi
public class StudentManagementSystem {

    // Field
    private ArrayList<StudentDto> studentDtoList = new ArrayList<>();
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

    //ögrenci ekle
    public void add(StudentDto dto) {
        studentDtoList.add(new StudentDto(++studentCounter, dto.getName(), dto.getSurname(), dto.getBirthday(), dto.getGrade()));
        System.out.println(" Öğrenci eklendi. ");
        //File Ekle
        saveToFile();
    }

    //öğrenci listesi
    public void list() {
        if (studentDtoList.isEmpty()) {
            System.out.println("Öğrenci yoktur.");
            return;
        } else {
            studentDtoList.forEach(System.out::println);
        }
    }

    // ögrenci ara
    public void search(String name) {
        studentDtoList.stream()
                .filter(student -> student.getName()
                        .equalsIgnoreCase(name)).forEach(System.out::println);
    }

    // ögrenci güncelle
    public void update(int id, StudentDto dto) {

        for (int i = 0; i < studentDtoList.size(); i++) {
            for (StudentDto temp : studentDtoList) {
                if (temp.getId() == id) {
                    temp.setName(dto.getName());
                    temp.setSurname(dto.getSurname());
                    temp.setBirthday(dto.getBirthday());
                    temp.setGrade(dto.getGrade());
                    System.out.println("Öğrenci güncellendi ");
                    saveToFile();
                    return;
                }
            }
            System.out.println("Öğrenci bulunamadı.");
        }
    }

    // ögrenci sil
    public void delete(int id) {
        studentDtoList.removeIf(student -> student.getId() == id);
        System.out.println("Öğrenci silindi");
    }

    // File create
    private void saveToFile() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            objectOutputStream.writeObject(studentDtoList);
        } catch (IOException io) {
            System.out.println(" Dosya ekleme hatası ");
            io.printStackTrace();
        }
    }

    // Öğrenci listesini yükle (Dosya) File read
    private void loadStudentListFromFile() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            try {
                studentDtoList = (ArrayList<StudentDto>) objectInputStream.readObject();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            studentCounter = studentDtoList.size();


        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Öğrenci kaydı bulunamadı");
            fileNotFoundException.printStackTrace();
        } catch (IOException io) {
            System.out.println("Dosya okuma hatası");
            io.printStackTrace();
        }

    }


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
