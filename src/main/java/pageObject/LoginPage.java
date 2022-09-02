package pageObject;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    @FindBy(how = How.XPATH, using = "//h2[text()='Вход']")
    private static SelenideElement entry_text;

    @FindBy(how = How.XPATH, using = "//label[@class='input__placeholder text noselect text_type_main-default'][text()='Email']")
    private static SelenideElement inactiveEmailInput;

    @FindBy(how = How.XPATH, using = "//input[contains(@class, 'text input__textfield')][@name = 'name']")
    private static SelenideElement activeEmailInput;

    @FindBy(how = How.XPATH, using = "//label[@class='input__placeholder text noselect text_type_main-default'][text()='Пароль']")
    private static SelenideElement inactivePasswordInput;

    @FindBy(how = How.XPATH, using = "//input[contains(@class, 'text input__textfield')][@name = 'Пароль']")
    private static SelenideElement activePasswordInput;

    @FindBy(how = How.XPATH, using = "//button[contains(@class, 'button_button__33qZ0')][text()='Войти']")
    private static SelenideElement logIn_button;

    @FindBy(how = How.XPATH, using = "//a[@class='Auth_link__1fOlj'][text()='Зарегистрироваться']")
    private static SelenideElement registerButton;

    @FindBy(how = How.XPATH, using = "//a[@class='Auth_link__1fOlj'][text()='Восстановить пароль']")
    private static SelenideElement recoverPasswordButton;

    @Step("Проверка присутствия заголовка <Вход> на странице")
    public String getEntryText(){
        return entry_text.getText();
    }
    @Step("Клик поля <Email>")
    public void click_inactive_input_email(){
        inactiveEmailInput.click();
    }
    @Step("Заполнение данных в поле <Email>")
    public void setEmail(String email){
        activeEmailInput.setValue(email);
    }
    @Step("Клик поля <Пароль>")
    public void click_inactive_input_password(){
        inactivePasswordInput.click();
    }
    @Step("Заполнение данных в поле <Пароль>")
    public void setPassword(String password){
        activePasswordInput.setValue(password);
    }
    @Step("Клик кнопки <Войти>")
    public void click_logIn_button() {
        logIn_button.click();
    }
    @Step("Клик кнопки <Зарегистрироваться>")
    public void click_register_button(){
        registerButton.click();
    }
    @Step("Клик кнопки <Восстановить пароль>")
    public void click_recover_password(){
        recoverPasswordButton.click();
    }
}

