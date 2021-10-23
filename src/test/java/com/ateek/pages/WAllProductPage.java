package com.ateek.pages;

import com.ateek.utility.BrowserUtil;
import com.ateek.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class WAllProductPage {

    //we can store all elements one by one
    // or we can store by entire row

    @FindBy(xpath = "//table[@class='ProductsTable']//tr/th")
    public List<WebElement> allHeaderRowCells;

    @FindBy(xpath = "//table[@class='ProductsTable']//tr[2]/td")
    private List<WebElement> firstRowCells;

    @FindBy(xpath = "//table[@class='ProductsTable']//tr[3]/td")
    private List<WebElement> secondRowCells;

    @FindBy(xpath = "//table[@class='ProductsTable']//tr[4]/td")
    private List<WebElement> thirdRowCells;

    @FindBy(xpath = "//h2[normalize-space(.)='List of Products']")
    public WebElement header;


    public WAllProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //this method gets all headers row of the table on View all products page
    public List<String> getAllTableHeaders(){

/* moved to Browser.Util
        List<String> allTextLst = new ArrayList<>();
        for (WebElement eachElement : allHeaderRowCells) {
            allTextLst.add(  eachElement.getText()  );
        }
        return allTextLst;
 */
    //calling this method from Browser.util class
    return BrowserUtil.getAllText(allHeaderRowCells);
    }


    //getting actual result as map so we can compare Map and Map
    public Map<String, String> getRowMapFromWebTable(){

        //The map => key -> as columns      value -> as rows
        Map<String, String> rowMap = new LinkedHashMap<>();

        //getting all headers -> so we use as key
        List<String> allHeaders = BrowserUtil.getAllText(allHeaderRowCells);

        //getting all first row -> so we can use as value
        List<String> allFirstRow = BrowserUtil.getAllText(firstRowCells);
//        rowMap.put( allHeaders.get(0) , allFirstRow.get(0)  );
//        rowMap.put( allHeaders.get(1) , allFirstRow.get(1)  );
//        rowMap.put( allHeaders.get(2) , allFirstRow.get(2)  );

        for (int i = 0; i < allHeaders.size(); i++) {

            rowMap.put(  allHeaders.get(i), allFirstRow.get(i)); // i -> represents column

        }
        return rowMap;
    }


}








