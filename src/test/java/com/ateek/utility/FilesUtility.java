package com.ateek.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FilesUtility {

    public void addFilesToFavorite() {

        List<String> eachFileText = new ArrayList<>();

        TryCloud_FilesPage addToFav = new TryCloud_FilesPage();
        for (int i = 4; i <= 10; i++) {
            WebElement eachFiles = Driver.getDriver().findElement(By.xpath("(//tbody[@id='fileList'])[1]/tr[" +    ++i   + "]/td[2]/a"));
            //                                                                                              dynamic^
            eachFileText.add(eachFiles.getText());

            BrowserUtil.waitFor(2);
            addToFav.addToFavorite1.click();
            BrowserUtil.waitFor(2);
        }

    }
}