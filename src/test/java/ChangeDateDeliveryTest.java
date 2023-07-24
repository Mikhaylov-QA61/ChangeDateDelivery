import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ChangeDateDeliveryTest {


    DataPlaning plan = new DataPlaning();

    @Test
    void successfulFormSend() {

        open("http://localhost:9999");
        SelenideElement form = $(".form");
        form.$("[data-test-id=city] input").setValue(plan.generateCity());
        $(".menu").click();
        form.$("[data-test-id=date] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.UP), Keys.DELETE);
        form.$("[data-test-id=date] input").setValue(plan.generateDate(5,"dd.MM.yyyy"));
        form.$("[data-test-id=name] input").setValue(plan.generateName());
        form.$("[data-test-id=phone] input").setValue(plan.generatePhone());
        form.$("[data-test-id=agreement]").click();
        form.$(".button").click();
        $("[data-test-id=success-notification] .notification__title").shouldBe(visible).shouldHave(exactText("Успешно!"));
        $(".icon-button.notification__closer").click();
        form.$("[data-test-id=date] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.UP), Keys.DELETE);
        form.$("[data-test-id=date] input").setValue(plan.generateDate(6,"dd.MM.yyyy"));
        form.$(".button").click();
        $("[data-test-id=replan-notification] .notification__title").shouldBe(visible).shouldHave(exactText("Необходимо подтверждение"));
        $("[data-test-id=replan-notification] .button").click();
        $("[data-test-id=success-notification] .notification__content").shouldBe(visible).shouldHave(exactText("Встреча успешно запланирована на " + plan.generateDate(6,"dd.MM.yyyy")));



    }
}
