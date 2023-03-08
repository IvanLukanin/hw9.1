import java.util.Objects;

class Author {
    public String author;

    public Author (String author){
        this.author = author;
    }

    public String getName(){
        return author;
    }
    public void setName (String author){
        this.author = author;
    }
    @Override
    public String toString() {
        return "Author{" +
                "author='" + author + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author1 = (Author) o;
        return Objects.equals(author, author1.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(author);
    }
}