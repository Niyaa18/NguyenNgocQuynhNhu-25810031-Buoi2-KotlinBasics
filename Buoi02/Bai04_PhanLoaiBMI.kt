// Nguyễn Ngọc Quỳnh Như - MSSV: 25810031

fun main() {
    val canNang = 50.0
    val chieuCao = 1.60

    val bmi = canNang / (chieuCao * chieuCao)

    println("Chi so BMI: $bmi")

    if (bmi < 18.5) {
        println("Phan loai: Gay")
    } else if (bmi < 25.0) {
        println("Phan loai: Binh thuong")
    } else if (bmi < 30.0) {
        println("Phan loai: Thua can")
    } else {
        println("Phan loai: Beo phi")
    }
}
