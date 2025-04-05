package com.msayrac.project_step1_file;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

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

    public StudentManagementSystem(ArrayList<StudentDto> studentDtoList, int studentCounter) {
        this.studentDtoList = studentDtoList;
        this.studentCounter = studentCounter;
    }

    //ögrenci ekle
    public void add(StudentDto dto) {
        studentDtoList.add(new StudentDto(++studentCounter, dto.getName(), dto.getSurname(), dto.getBirthday());
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
                studentCounter = studentDtoList.size();
                System.out.println("Dosyadan yüklenne öğrenci sayısı : " +studentCounter);
            } catch (FileNotFoundException e) {
                System.out.println("Dosyadan yüklenen öğrenci kaydı bulunamadı");
                throw new RuntimeException(e);
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


    // ///////////////////////////////////////
    // console secim (ogrenci ekle)
    public void chooice() {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();
        while (true) {
            System.out.println("\n1.Öğrenci Ekle");
            System.out.println("\n2.Öğrenci Listele");
            System.out.println("\n3.Öğrenci Are");
            System.out.println("\n4.Öğrenci Güncelle");
            System.out.println("\n5.Öğrenci Sil");
            System.out.println("\n6.Toplam öğrenci sayısı");
            System.out.println("\n7.Rastgele öğrenci seçimi");
            System.out.println("\n8.Öğrenci not hesapla");
            System.out.println("\n9.Öğrenci en yüksek, en düşük notları göster");
            System.out.println("\n10.Öğrenci sıralaması doğum gününe göre göster");
            System.out.println("\n11.Çıkış");
            System.out.println("\nLütfen Seçiminizi Yapınız");

            int chooice = scanner.nextInt();
            scanner.nextLine(); // durma yerimiz
            StudentDto studentDto = new StudentDto();

            String name, surname;
            String birthday;
            double grade;

            switch (chooice) {
                case 1:
                    System.out.println("Öğrenci Adı : ");
                    name = scanner.nextLine();

                    System.out.println("Öğrenci Soyadı : ");
                    surname = scanner.nextLine();

                    System.out.println("Öğrenci Doğum tarihi : ");
                    birthday = scanner.nextLine().toString();

                    System.out.println("Öğrenci Puanı : ");
                    grade = scanner.nextDouble();

                    studentDto.setId(studentCounter);
                    studentDto.setName(name);
                    studentDto.setSurname(surname);
                    studentDto.setCreatedDate(new Date(System.currentTimeMillis()));
                    studentDto.setBirthday(LocalDate.parse(birthday));

                    studentManagementSystem.add(studentDto);
                    break;

                case 2:
                    studentManagementSystem.list();
                    break;
            }
        }
    }

}
