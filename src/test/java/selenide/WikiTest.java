package selenide;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

import selenide.po.ArticlePage;
import selenide.po.SearchPage;

public class WikiTest {

    @Test
    void shouldBeOpenedArticle(){
        open("https://ru.wikipedia.org/wiki");

        new SearchPage()
                .searchUbisoftArticle("Ubisoft")
                .clickEnter()
                .clickOnUbisoftArticle();

        assertThat(new ArticlePage().getHeadingOfArticle()).as("The text must be Ubisoft: история изменений").isEqualTo("Ubisoft: история изменений");
    }
}
