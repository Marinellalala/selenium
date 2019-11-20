package com.it.Tests;

import com.it.App;
import com.it.Models.Email;
import com.it.Models.EmailFactory;
import com.it.Users.User;
import com.it.Users.UserFactory;
import org.testng.annotations.AfterSuite;

public abstract class BaseTest {
    protected static App app = new App();
    protected static User validUser = UserFactory.getValidUser();
    protected Email email = EmailFactory.getValidEmail();

    @AfterSuite
    public void tearDownSuite() {
        app.common.closeApp();
    }
}
