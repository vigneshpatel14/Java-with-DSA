package EmployeeManagementSystem;

class Article {
    private String Name,Author,Description,Isbn,Status,Publisher;

    public Article(String name , String author, String description , String isbn ,String status, String publisher)
    {
        this.Name = name;
        this.Author = author;
        this.Description = description;
        this.Isbn = isbn;
        this.Status = status;
        this.Publisher = publisher;
    }

    public String getAuthor()
    {
        return Author;
    }

    public String getDescription()
    {
        return Description;
    }

    public String getIsbn()
    {
        return Isbn;
    }

    public String getStatus()
    {
        return Status;
    }

    public String getPublisher()
    {
        return Publisher;
    }

    public String getName()
    {
        return Name;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
