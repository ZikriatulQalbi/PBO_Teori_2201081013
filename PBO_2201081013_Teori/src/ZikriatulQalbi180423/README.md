Atribut:
name, address, age: Variabel bertipe String dan int yang menyimpan informasi nama, alamat, dan umur mahasiswa.
mathGrade, englishGrade, scienceGrade: Variabel bertipe double yang menyimpan informasi nilai matematika, bahasa Inggris, dan ilmu pengetahuan mahasiswa.
average: Variabel bertipe double yang digunakan untuk menyimpan nilai rata-rata mahasiswa.
studentCount: Variabel statis bertipe int yang digunakan untuk menghitung jumlah mahasiswa.
Konstruktor:
StudentRecord(): Konstruktor tanpa parameter yang secara otomatis akan meningkatkan studentCount setiap kali sebuah objek StudentRecord dibuat.
StudentRecord(String temp): Konstruktor dengan satu parameter temp yang digunakan untuk mengatur nilai name dengan nilai dari temp.
StudentRecord(String name, String address): Konstruktor dengan dua parameter name dan address yang digunakan untuk mengatur nilai name dan address dengan nilai yang diberikan. Selain itu, studentCount juga akan meningkat.
StudentRecord(double mGrade, double eGrade, double sGrade): Konstruktor dengan tiga parameter yang digunakan untuk mengatur nilai-nilai mathGrade, englishGrade, dan scienceGrade dengan nilai-nilai yang diberikan. studentCount juga akan meningkat.
Metode:
Setter dan Getter: Metode getter digunakan untuk mengembalikan nilai dari atribut yang sesuai, sedangkan metode setter digunakan untuk mengatur nilai atribut yang sesuai.
getAverage(): Metode ini menghitung dan mengembalikan nilai rata-rata mahasiswa berdasarkan mathGrade, englishGrade, dan scienceGrade.
getStudentCount(): Metode statis ini digunakan untuk mengembalikan jumlah total mahasiswa yang telah dibuat.
print(String temp): Metode ini menerima satu parameter temp dan mencetak nama, alamat, dan umur mahasiswa.
print(double eGrade, double mGrade, double sGrade): Metode ini menerima tiga parameter yang mencetak nama mahasiswa, serta nilai matematika, bahasa Inggris, dan ilmu pengetahuan.
Di class StudentRecordExample: buat objek 'anna' dan atur atributnya untuk menampilkan 'system.out.println.objek ali dan budi menggunakan konstruktor yang berbeda ali hanya setNane dan setAddress,
budi hanya 2 argumen name dan address.

Atribut:
 nama;alamat;notelp;email; variabel bertipe String.