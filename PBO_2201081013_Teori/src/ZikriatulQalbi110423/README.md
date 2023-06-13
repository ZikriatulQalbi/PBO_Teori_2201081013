Deklarasi variabel valChar dengan tipe data char dengan nilai karakter A, valInt dengan tipe int dan menginisialisai nilai dengan valChar
konversi otomatis dilakukan, mencetak dengan mengunakan system .out.println()

Deklalarasi v2 variabel tipe String.Free the bound periodicals digunakan ke str1 dan str2 inisialisai dengan nilai str1,
untuk mencetak 'system.out.println'. selanjutnya perbandingan str1 dan str2 dengan operator ==. str2 = new String(str1); membuat objek string baru dengan nilai yang sama dengan str1 .
System.out.println("Same object? "+ (str1 == str2)); dilakukan perbandingan menggunakan operator == antara str1 dan str2.System.out.println("Same value? "+ str1.equals(str2)); 
dilakukan perbandingan nilai antara str1 dan str2 menggunakan metode equals().

membuat array integer,mencetak nilai array. test(ages); //alamat kalau dikrim maka dia berubah yg di bawahnya. public static void test(int[] arr){ //isi arr adalah alamat dari ages
            //merubah nilai aarray
            for(int i=0; i<arr.length; i++){
                arr[i] = i+50;


// Mencetak nilai i
        System.out.println("Nilai i sebelum method dipanggil: " + i);

        // Memanggil method test
        // Passing i sebagai parameter
        test(i);

        // Mencetak nilai i setelah method dipanggil
        System.out.println("Nilai i setelah method dipanggil: " + i);
    }

    public static void test(int j) {
        // Merubah nilai parameter j
            
