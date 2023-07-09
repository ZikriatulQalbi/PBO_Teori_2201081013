/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZikriatulQalbiM11_230523;

/**
 *
 * @author hp
 */
public class StudentRecordExample {
        
    
        public static void main( String[] args ){
        StudentRecord qalbiRecord = new StudentRecord();

        //Memberi nama siswa
        qalbiRecord.setName("Qalbi");

        //Menampilkan nama siswa
        System.out.println(qalbiRecord.getName() );

        //Menampilkan jumlah siswa
        System.out.println("Count= "+StudentRecord.getStudentCount());
        }
}

    
    
        
    
    

