// Nguyễn Ngọc Quỳnh Như - MSSV: 25810031

fun main() {
    // Tao danh sach 5 cuon sach
    val dsSach = mutableListOf("Toan", "Van", "Anh", "Ly", "Hoa")

    println("Danh sach ban dau: $dsSach")

    dsSach.add("Sinh")
    dsSach.add("Su")

    dsSach.remove("Hoa")

    dsSach.sort()

    println("Danh sach sau khi xu ly: $dsSach")
}
