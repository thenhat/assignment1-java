package assignment6;

import java.io.Console;

public class News implements INews{
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate;

    public int getID() {
        return ID;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public String getContent() {
        return Content;
    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setContent(String content) {
        Content = content;
    }

    public void Display(){
        System.out.println("Title"+getTitle());
        System.out.println("PublishDate"+getPublishDate());
        System.out.println("Author"+getAuthor());
        System.out.println("Content"+getContent());
        System.out.println("AverageRate"+getAverageRate());
    }
    int[] RateList= {10, 30, 11};

    public void Calculate(){
        AverageRate=(RateList[0]+RateList[1]+RateList[2])/3;
    }
}
