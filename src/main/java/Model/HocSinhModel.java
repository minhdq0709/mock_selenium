/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Minh.dq
 */
public class HocSinhModel {
    private String hoten;
    private String ngaysinh;
    private String gioitinh;
    private String CCCD;
    private String diachi;
    private boolean danToc;
    private boolean ngoaiKhoa;

    public HocSinhModel() {
    }

    public HocSinhModel(String hoten, String ngaysinh, String gioitinh, 
            String CCCD, String diachi, boolean danToc, boolean ngoaiKhoa) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.CCCD = CCCD;
        this.diachi = diachi;
        this.danToc = danToc;
        this.ngoaiKhoa = ngoaiKhoa;
    }
    
    

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    public boolean isDanToc() {
        return danToc;
    }

    public void setDanToc(boolean danToc) {
        this.danToc = danToc;
    }

    public boolean isNgoaiKhoa() {
        return ngoaiKhoa;
    }

    public void setNgoaiKhoa(boolean ngoaiKhoa) {
        this.ngoaiKhoa = ngoaiKhoa;
    }
}
