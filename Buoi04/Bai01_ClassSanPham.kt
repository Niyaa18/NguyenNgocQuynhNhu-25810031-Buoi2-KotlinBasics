// Ho ten: Nguyen Ngoc Quynh Nhu - MSSV: 25810031
package buoi04.bai01

class SanPham(
    val tenSanPham: String,
    val gia: Double,
    val soLuongTonKho: Int = 0
)

fun main() {
    // Object thu nhat: truyen du ba gia tri theo thu tu.
    val sanPhamThuNhat = SanPham("Điện thoại", 5000000.0, 10)

    // Object thu hai: dung named argument, so luong ton kho mac dinh la 0.
    val sanPhamThuHai = SanPham(
        tenSanPham = "Tai nghe",
        gia = 250000.0
    )

    println("SẢN PHẨM THỨ NHẤT")
    println("Tên sản phẩm: ${sanPhamThuNhat.tenSanPham}")
    println("Giá: ${sanPhamThuNhat.gia}")
    println("Số lượng tồn kho: ${sanPhamThuNhat.soLuongTonKho}")

    println()

    println("SẢN PHẨM THỨ HAI")
    println("Tên sản phẩm: ${sanPhamThuHai.tenSanPham}")
    println("Giá: ${sanPhamThuHai.gia}")
    println("Số lượng tồn kho: ${sanPhamThuHai.soLuongTonKho}")
}
