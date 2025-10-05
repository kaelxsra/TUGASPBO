// // function sapa(nama) {
// //     console.log("Halo, " + nama + "!");
// // }

// // sapa("Joy"); 
// // sapa("Seulgi");

// function tambah(a, b) {
//     return a * b;
// }

// let hasil = tambah(6, 3);
// console.log("Hasil: " + hasil); // Output: Hasil

// let car = {
//     name: "Fiat",
//     model: 500,
//     weight: "850kg",
//     color: "White",

//     start: function() {
//         console.log("Mobil dinyalakan.");
//     },
//     drive: function() {
//         console.log("Mobil berjalan.");
//     },
//     brake: function() {
//         console.log("Mobil mengerem.");
//     },
//     stop: function() {
//         console.log("Mobil berhenti.");
//     }
// };

// console.log(car.name);
// console.log(car.color);

// car.start();
// car.drive();

// let sepeda = {
//     merk: "polygon",
//     warna: "merah",
//     gear: 21,

//     start: function() {
//         console.log("sepedah mulai dikayuh");
//     },
//     drive: function() {
//         console.log("sepedah berjalan");
//     },
//     brake: function() {
//         console.log("sepedda mengerem.");
//     },
//     stop: function() {
//         console.log("sepeda berhenti.");
//     }
// };
// console.log(sepeda.merk);
// console.log(sepeda.warna);
// console.log("Jumlah gear: " + sepeda.gear);
// sepeda.start();
// sepeda.drive();
// sepeda.brake();
// sepeda.stop();

// function Car(name, model, weight, color) {
//     this.name = name;
//     this.model = model;
//     this.weight = weight;
//     this.color = color;

//     this.start = function() {
//         console.log(${this.name} dinyalakan.);
//     };

//     this.drive = function() {
//         console.log(${this.name} sedang berjalan.);
//     };
// }

// let car1 = new Car("Toyota", "2020", 1200, "Hitam");
// let car2 = new Car("Honda", "2021", 1200, "Hitam");
// car1.start();
// car1.drive(); 
// car2.start();
// car2.drive();

// class car {
//     constructor(name,model,color) {
//         this.name = name;
//         this.model = model;
//         this.color = color;
//     }

//     start() {
//         console.log(${this.name} dinyalakan.);
//     }

//     drive() {
//         console.log(${this.name} sedang berjalan.);
//     }
// }

// let car1 = new car ("toyota", 2021, "blue");
// car1.start();


// class Bicycle {
//     constructor(brand, color, gears) {
//         this.brand = brand;
//         this.color = color;
//         this.gears = gears;
//     }

//     start() {
//         console.log(${this.brand} mulai dikayuh.);
//     }

//     drive() {
//         console.log(${this.brand} sedang berjalan.);
//     }

//     brake() {
//         console.log(${this.brand} mengerem.);
//     }

//     stop() {
//         console.log(${this.brand} berhenti.);
//     }

//     displayInfo() {
//         console.log(Merek: ${this.brand}, Warna: ${this.color}, Jumlah Gear: ${this.gears});
//     }
// }

// // Membuat dua objek sepeda
// let bicycle1 = new Bicycle("Polygon", "Merah", 21);
// let bicycle2 = new Bicycle("United", "Biru", 18);

// // Menjalankan metode
// bicycle1.start();
// bicycle1.drive();

// bicycle2.start();
// bicycle2.drive();

// bicycle1.displayInfo();
// bicycle2.displayInfo();

// bicycle1.brake();
// bicycle1.stop();

// bicycle2.brake();
// bicycle2.stop();
class Student {
    constructor(nama, nim, jurusan, angkatan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }

    introduce() {
        console.log(Halo, nama saya ${this.nama}, NIM: ${this.nim}, jurusan ${this.jurusan}, angkatan ${this.angkatan}.);
    }

    isSenior() {
        if (this.angkatan < 2022) {
            console.log(${this.nama} adalah mahasiswa senior.);
        } else {
            console.log(${this.nama} adalah mahasiswa baru.);
        }
    }

    displayInfo() {
        console.log(Nama: ${this.nama}, NIM: ${this.nim}, Jurusan: ${this.jurusan}, Angkatan: ${this.angkatan});
    }
}

// Membuat objek student
let student1 = new Student("arvin", "123456", "sastra jawa", 1950);
let student2 = new Student("arvin ganteng", "654321", "sastra jawa", 2025);

// Memanggil method
student1.introduce();
student2.introduce();

student1.isSenior();
student2.isSenior();

student1.displayInfo();
student2.displayInfo();