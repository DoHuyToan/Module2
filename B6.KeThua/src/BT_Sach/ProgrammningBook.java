package BT_Sach;

public class ProgrammningBook extends Book {
    private String language;
    private String framework;

    public ProgrammningBook(){}

    public ProgrammningBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgrammningBook(String bookCode, String name, double price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "ProgrammningBook{" +
                "language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                ", with " + super.toString() +
                '}';
    }
}
