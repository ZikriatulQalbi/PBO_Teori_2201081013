menggunakan loop for-each untuk mencetak setiap argumen yang diterima dari baris perintah menggunakan System.out.println(arg).
memeriksa apakah jumlah argumen yang diterima adalah 2. 
Jika jumlahnya bukan 2, program akan mencetak pesan "Usage: java ArithmeticOperation <number1> <number2>" dan kemudian berakhir dengan pernyataan return.
jumlah argumen benar (yaitu 2), program akan melanjutkan untuk melakukan operasi aritmatika. Argumen pertama (args[0]) diubah menjadi bilangan bulat (int) menggunakan Integer.parseInt() dan disimpan dalam variabel num1. 
Argumen kedua (args[1]) juga diubah menjadi bilangan bulat dan disimpan dalam variabel num2.
program mencetak hasil operasi aritmatika menggunakan System.out.println() dengan menambahkan teks yang sesuai.
