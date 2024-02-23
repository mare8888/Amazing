package mobile.finaltest;

import mobile.config.base.BaseMethods;
import mobile.po.ListSavedArticlePage;
import mobile.po.MainPage;
import mobile.po.SavePage;
import mobile.po.SkipPage;
import mobile.services.ArticleService;
import mobile.services.ListSavedArticleService;
import org.testng.annotations.Test;

public class DeleteList extends BaseMethods {
    @Test
    void sdfsmobile() {
        new SkipPage().clickSkip();
        new MainPage().swipeToMore();
        new ArticleService().clickMore();
        new ArticleService().saveImage();
        new SavePage().clickSaveButton();
        new ListSavedArticleService()
                .addToListArticle("Film");
        new ListSavedArticlePage()
                .swipeElementRight(550);
        new ArticleService().clickList();
        new ArticleService().deleteList();
        new ArticleService().confirmDelete();

    }
}
