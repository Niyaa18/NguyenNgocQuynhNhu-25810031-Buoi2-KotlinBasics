// Nguyễn Ngọc Quỳnh Như - MSSV: 25810031

fun main() {
    val diem = arrayOf(8.0, 7.5, 9.0, 5.0, 6.5, 10.0, 4.0, 8.5, 6.0, 7.0)

    var tong = 0.0
    var max = diem[0]
    var min = diem[0]

    for (d in diem) {
        tong = tong + d
        if (d > max) max = d
        if (d < min) min = d
    }

    val trungBinh = tong / diem.size

    println("Diem trung binh: $trungBinh")
    println("Diem cao nhat: $max")
    println("Diem thap nhat: $min")
}
