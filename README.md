Project ini adalah tugas untuk membuat framework automation testing berbasis web.  
Framework ini menggunakan kombinasi Java, Gradle, Selenium WebDriver, Cucumber (BDD), dan JUnit 5.  
Website yang diuji adalah [SauceDemo](https://www.saucedemo.com/v1/).

Tujuan utama dari project ini adalah untuk menguji tampilan dan fungsionalitas website secara otomatis dengan pendekatan Behavior Driven Development (BDD) menggunakan Gherkin.

Tujuan Pengerjaan
1. Menerapkan konsep BDD menggunakan Cucumber.
2. Melakukan otomatisasi pengujian login pada website SauceDemo.
3. Menerapkan konsep Page Object Model (POM) agar struktur kode lebih rapi dan mudah dikelola.
4. Menjalankan automation test pada beberapa browser (Chrome, Firefox).
5. Menghasilkan laporan hasil test otomatis dalam format HTML.

Menjalankan automation di browser tertentu
./gradlew testChrome (Default)
./gradlew testFirefox
