/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class HoaDon 
{   
    HoaDonHeader header = new HoaDonHeader();
    ArrayList<CTHD> cthd = new ArrayList<>();
    
    public static class Builder 
    {
        HoaDonHeader header;
        ArrayList<CTHD> cthd = new ArrayList<>();        
        
        public Builder() 
        {}   
        
        public Builder addHeader(String maHoaDon, String tenKhachHang, LocalDate ngayBan) 
        {
            this.header = new HoaDonHeader(maHoaDon, tenKhachHang, ngayBan);
            return this;
        }        
        
        public Builder addProduct(String tenSanPham, int soLuong, double donGia, float chietKhau) 
        {
            CTHD item = new CTHD(tenSanPham, soLuong, donGia, chietKhau);
            this.cthd.add(item);
            return this;
        }
        
        public HoaDon build() 
        {
            return new HoaDon(this);
        }
    }
    
    protected HoaDon (Builder builder) 
    {
        this.header = builder.header;
        this.cthd = builder.cthd;
    }
    
}
