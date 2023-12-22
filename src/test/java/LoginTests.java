import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests {
    @Test
    void successfulLoginTest(){
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;

        open("https://qa.guru/cms/system/login");
        $("[name=email]").setValue("anatoliy.aleshin@rt.ru");
        $("[name=password]").setValue("123qweasd").pressEnter();
        $(".main-header__login").click();
        $(".logined-form").shouldHave(text("Анатолий"));

    }
}
