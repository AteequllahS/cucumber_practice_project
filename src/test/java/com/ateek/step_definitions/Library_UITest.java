package com.ateek.step_definitions;

import com.ateek.pages.LibLoginPage;
import com.ateek.utility.BrowserUtil;
import com.ateek.utility.DB_Util;
import com.ateek.utility.Driver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class Library_UITest {


    @BeforeAll
    static void connect() {

        String url = "jdbc:mysql://54.157.236.232:3306/library2";
        String username = "library2_client";
        String password = "6s2LQQTjBcGFfDhY";
        DB_Util.createConnection(url, username, password);

    }

    @Test
    public void userCountTest() {

        DB_Util.runQuery("SELECT COUNT(*) FROM users ORDER BY 1 DESC");
        String actualUserCount = DB_Util.getFirstRowFirstColumn();
        System.out.println("actual_User_Count = " + actualUserCount);

        LibLoginPage loginPage = new LibLoginPage();
        loginPage.goTo();
        BrowserUtil.waitFor(3);
        loginPage.login("librarian47@library", "Sdet2022*");
        BrowserUtil.waitFor(3);

        String expectedUserCount = loginPage.userCount.getText();
        System.out.println("expectedUserCount = " + expectedUserCount);

        assertEquals(expectedUserCount, actualUserCount);

        Driver.closeDriver();

    }

    @Test
    public void bookCountTest() {

        DB_Util.runQuery("SELECT COUNT(*) FROM books ORDER BY 1 DESC");
        String actual_Books_Count = DB_Util.getFirstRowFirstColumn();
        System.out.println("Actual_Books_Count = " + actual_Books_Count);

        LibLoginPage loginPage = new LibLoginPage();
        loginPage.goTo();
        BrowserUtil.waitFor(3);
        loginPage.login("librarian47@library", "Sdet2022*");
        BrowserUtil.waitFor(3);

        String expected_book_Count = loginPage.bookCount.getText();

        System.out.println("expected_Book_Count = " + expected_book_Count);

        assertEquals(expected_book_Count, actual_Books_Count);
        Driver.closeDriver();
    }

    @Test
    public void borrowedBookCountTest() {

        DB_Util.runQuery("SELECT COUNT(IS_RETURNED) FROM book_borrow WHERE is_returned =0");
        String actual_borrowed_book_count = DB_Util.getFirstRowFirstColumn();
        System.out.println("actual_borrowed_book_count = " + actual_borrowed_book_count);

        LibLoginPage loginPage = new LibLoginPage();
        loginPage.goTo();
        BrowserUtil.waitFor(3);
        loginPage.login("librarian47@library", "Sdet2022*");
        BrowserUtil.waitFor(3);

        String expected_BorrowedBook_Count = loginPage.borrowedBookCount.getText();

        System.out.println("expected_BorrowedBook_Count = " + expected_BorrowedBook_Count);

        assertEquals(expected_BorrowedBook_Count, actual_borrowed_book_count);
        Driver.closeDriver();

    }

    @AfterAll
    public static void closeConnection(){
        DB_Util.destroy();
    }
}
