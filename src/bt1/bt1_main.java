/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Asus
 */
public class bt1_main 
{
    public static LocalDate getDateFromString(String string, DateTimeFormatter format) 
    {       
        LocalDate date = LocalDate.parse(string, format);
        return date; 
    }  
    
    public static void main(String[] args) throws ParseException 
    {      
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");       
        HoaDon hoaDon = new HoaDon.Builder()
        .addHeader("HD001", "Hoàng Tuấn Kiên", getDateFromString("13/05/2020", format))
        .addProduct("KeyBoard", 5, 5300000, 0.5F)
        .build();
     
        System.out.println("Hóa Đơn");
        System.out.println("Mã hóa đơn: " + hoaDon.header.getMaHoaDon() + "\n" + "Tên khách hàng: " + hoaDon.header.getTenKhachHang() + "\n" +
        "Ngày bán: " + hoaDon.header.getNgayBan() + "\n");
        
        System.out.println("Chi tiết hóa đơn");
        for (CTHD x : hoaDon.cthd) 
        {
            System.out.println("Tên sản phẩm: " + x.getTenSanPham() + "\n" + "Số lượng: " + x.getSoLuong() + "\n" + 
                    "Đơn giá: " + (int)x.getDonGia() + "\n" + "Chiết khấu: " + x.getChietKhau() + "\n");
        }
    }
    
}
