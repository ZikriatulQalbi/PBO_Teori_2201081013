/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZikriatulQalbi180423;

/**
 *
 * @author hp
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord anna = new StudentRecord();
        anna.setName ("Anna");
        anna.setAddress("Padang");
        anna.setAge(23);
        anna.setMathGrade(80);
        anna.setEnglishGrade(70);
        anna.setScienceGrade(80);
        
        
        ///tampilkan data anna
        System.out.println("Nama        :"+anna.getName());
        System.out.println("Alamat      :"+anna.getAddress());
        System.out.println("Umur        :"+anna.getAge());
        System.out.println("Matematika  :"+anna.getMathGrade());
        System.out.println("B. Inggris  :"+anna.getEnglishGrade());
        System.out.println("Pengetahuan :"+anna.getScienceGrade());
        System.out.println("Rata-rata   :"+anna.getAverage());
        ////
        
        StudentRecord ali = new StudentRecord();
        ali.setName("Ali");
        ali.setAddress("Padang");
        
        ali.print("");
        ali.print(80, 70, 90);
        
        StudentRecord budi = new StudentRecord("Budi","Padang");
        budi.print("");
        budi.print(80, 70, 90);
        
        
        
        System.out.println("Jumalah Siswa       :"+StudentRecord.getStudentCount());
        
          
        
        
    }
    
}
