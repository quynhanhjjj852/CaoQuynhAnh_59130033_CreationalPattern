/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author Asus
 */
public class CTHD 
{

    String tenSanPham;
    int soLuong;
    double donGia;
    float chietKhau;

    public CTHD() 
    {}

    public CTHD(String tenSanPham, int soLuong, double donGia, float chietKhau) 
    {
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    public String getTenSanPham() 
    {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) 
    {
        this.tenSanPham = tenSanPham;
    }
    
    public double getDonGia() 
    {
        return donGia;
    }
    
    public void setDonGia(double donGia) 
    {
        this.donGia = donGia;
    }
    
    public int getSoLuong() 
    {
        return soLuong;
    }
    
    public void setSoLuong(int soLuong) 
    {
        this.soLuong = soLuong;
    }
    
    public float getChietKhau() 
    {
        return chietKhau;
    }

    public void setChietKhau(float chietKhau) 
    {
        this.chietKhau = chietKhau;
    }
    
}
