package com.londonappbrewery.destini;

/**
 * Created by Jacky on 11/14/2017.
 */

public class Page {
    int mainText;
    int topButtonText;
    int botButtonText;
    Page topPage;
    Page botPage;
    boolean isEnd;

    public Page(int mainText, int topButtonText, int botButtonText, Page topPage, Page botPage, boolean isEnd) {
        this.mainText = mainText;
        this.topButtonText = topButtonText;
        this.botButtonText = botButtonText;
        this.topPage = topPage;
        this.botPage = botPage;
        this.isEnd = isEnd;
    }

    public Page(int mainText, boolean isEnd){
        this.mainText = mainText;
        this.isEnd = isEnd;
    }

    public Page getTopPage() {
        return topPage;
    }

    public Page getBotPage() {
        return botPage;
    }

    public int getMainText() {
        return mainText;
    }

    public int getTopButtonText() {
        return topButtonText;
    }

    public int getBotButtonText() {
        return botButtonText;
    }

}
