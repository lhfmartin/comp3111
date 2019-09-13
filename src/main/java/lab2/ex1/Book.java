package lab2.ex1;

public class Book {
    private String chapters[];
    private static final int DEFAULT_CHAPTERS = 10;
    public Book(){
        chapters = new String[DEFAULT_CHAPTERS];
        for(int i = 0; i < chapters.length; i++){
            chapters[i] = "Chapter " + i;
        }
    }
    public Book(String[] chapters){
        this.chapters = chapters;
    }
    public String getChapter(int i){
        return chapters[i];
    }
    public String[] getChapters(){
        return chapters;
    }
}
