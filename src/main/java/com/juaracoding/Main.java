package com.juaracoding;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("deviceName", "Pixel 3 API 28");
        dc.setCapability("udid", "emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.chad.financialrecord");
        dc.setCapability("appActivity", "com.rookie.catatankeuangan.feature.splash.SplashActivity");
        dc.setCapability("noReset", true);
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, dc);
        System.out.println("Catatan Keuangan App");
        MobileElement btnTransaksi = (MobileElement) driver.findElementById("com.chad.financialrecord:id/fabMenu");
        btnTransaksi.click();
        MobileElement inputPengeluaran = (MobileElement) driver.findElementById("com.chad.financialrecord:id/etAmount");
        inputPengeluaran.sendKeys("1");
        MobileElement btnSave = (MobileElement) driver.findElementById("com.chad.financialrecord:id/btSave");
        btnSave.click();
        System.out.println("Berhasil Save Pengeluaran");
        MobileElement btnTambahTransaksiLagi = (MobileElement) driver.findElementById("com.chad.financialrecord:id/fabMenu");
        btnTambahTransaksiLagi.click();
        MobileElement btnPemasukkan = (MobileElement) driver.findElementById("com.chad.financialrecord:id/btnIncome");
        btnPemasukkan.click();
        MobileElement inputPemasukkan = (MobileElement) driver.findElementById("com.chad.financialrecord:id/etAmount");
        inputPengeluaran.sendKeys("1");
        MobileElement btnSavelagi = (MobileElement) driver.findElementById("com.chad.financialrecord:id/btSave");
        btnSave.click();
        System.out.println("Berhasil Save Pemasukkan");
    }
}