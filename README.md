# dumbways-17
Jawaban saya untuk Test Technical Bootcamp Dumbways Batch 17

1. Rafaela berangkat dari titik C menuju titik A tepat pukul 14:00 dengan kecepatan tetap 10 m/detik. Sedangkan Nana juga berangkat dari titik C menuju titik A tepat pukul      15:00 dengan kecepatan 13 m/detik. Buatlah program untuk menghitung dan mencetak pada pukul berapa Rafaela dan Nana tepat berada pada titik yang sama dimana Nana mulai        mendahului Rafaela
   https://github.com/maulanaiskar/dumbways-17/blob/master/no1.java

2. Buatlah Sebuah Function untuk memverifikasi validasi password dengan requirements:
    - Berjumlah minimal delapan karakter
    - Setidaknya terdapat minimal sebuah huruf kecil, sebuah huruf besar, sebuah angka dan sebuah karakter spesial
    
    Example: 
    1qaz2wsX!
    K3p0s3k4l!
    
    Clue:
    isPassword (‘’1qaz2wsX!”)
    Return ⇒ True
    isPassword (“1qaz2wsx!”)
    Return ⇒ False
    
    https://github.com/maulanaiskar/dumbways-17/blob/master/no2.java

3. Buatlah function untuk mencetak garis miring dari karakter yang diinputkan sebagai parameter
   Example:
   drawLine("Dumbways")
   
   D
    u
     m
      b
       w
        a
         y
          s
          
   https://github.com/maulanaiskar/dumbways-17/blob/master/no3.java
   
4. Sebuah web Game Center diketahui mempunyai 3 tabel sebagai berikut:
   - Genre
     - id
     - name
   - Game
     - id
     - title
     - image
     - Genre_id (FK)
   - Transaction
     - id
     - price
     - Game_id(FK)
     - Stock
   Isikan data relevan sesuai dengan tabel db yang telah dibuat!
   
   
   Mohon:
   Buatlah query DB/MYSQL untuk menampilkan data sebagai berikut :
   Tampilkan hasil dari query sebagai berikut :
   tampilkan semua game dengan genre yang sama
   Tampilkan semua data game beserta genre maupun stock yang tersisa
   Tampilkan hasil query post tambah berita dan user
   
   Dari soal Diatas, Buatlah aplikasi sederhana CRUD (CREATE, READ, UPDATE, DELETE) hasil dari query ke layar. dengan ketentuan sebagai berikut:
   - Dapat Menambahkan Game
   - Dapat Menambahkan Genre
   - Dapat menampilkan semua Game jika tombol buy diklik maka akan mengurangi stock game
   
   Gunakan HTML, CSS, dan Twitter Bootstrap (atau library UI yang kamu kuasai) untuk tampilan.

