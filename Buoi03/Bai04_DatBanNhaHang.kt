// Ho ten: Nguyen Ngoc Quynh Nhu - MSSV: 25810031
package buoi03.bai04

fun datBan(
    tenKhachHang: String,
    soLuongKhach: Int,
    loaiBan: String = "Bàn thường"
) {
    println("Tên khách hàng: $tenKhachHang")
    println("Số lượng khách: $soLuongKhach")
    println("Loại bàn: $loaiBan")
    println()
}

fun main() {
    // Cach 1: Su dung gia tri mac dinh cua loaiBan.
    datBan("Quỳnh Như", 2)

    // Cach 2: Truyen day du doi so theo dung thu tu.
    datBan("Ngọc Anh", 4, "Bàn VIP")

    // Cach 3: Truyen doi so bang ten tham so.
    datBan(
        loaiBan = "Bàn ngoài trời",
        tenKhachHang = "Minh Thư",
        soLuongKhach = 6
    )
}
