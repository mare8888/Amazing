package mobile.services;

import mobile.po.ArticlePage;

public class ArticleService {

    private final ArticlePage articlePage = new ArticlePage();

    public String getArticleName() {
        return articlePage
                .clickFirstArticle()
                .getArticleName();
    }

    public void saveImage() { articlePage.downloadPicture(); }
    public void clickMore() { articlePage.clickMoreButton(); }
    public void clickList(){
        articlePage.clickList();
    }
    public void deleteList(){
        articlePage.deleteList();
    }
    public void confirmDelete(){
        articlePage.confirmDelete();
    }

}
