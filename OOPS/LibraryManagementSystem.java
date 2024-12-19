package OOPS;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Article
{
    private String name ,author ,description,isbn , status , publisher;

    public Article(String name , String author , String description, String isbn , String status , String publisher)
    {
        this.name = name;
        this.author = author;
        this.description = description;
        this.isbn = isbn;
        this.status = status;
        this.publisher = publisher;
    }

    public String getName()
    {
        return name;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getDescription()
    {
        return description;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public  String toString()
    {
        return "Article{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", isbn='" + isbn + '\'' +
                ", status='" + status + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}

class LibraryMember
{
    private  String firstname,lastname , fullname , email , phonenumber;
    private int borrowedBooksCount;
    public LibraryMember(String firstname , String lastname ,String fullname , String email ,String phonenumber)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.fullname = fullname;
        this.email = email;
        this.phonenumber = phonenumber;
        this.borrowedBooksCount = 0;
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }
    public String getFirstname()
    {
        return  firstname;
    }

    public String getLastname()
    {
        return  lastname;
    }

    public String getFullname()
    {
        return  fullname;
    }

    public String getEmail()
    {
        return  email;
    }

    public String getPhonenumber()
    {
        return  phonenumber;
    }

    public void borrowBook() {
        this.borrowedBooksCount++;
    }

    public void returnBook() {
        this.borrowedBooksCount--;
    }

    @Override
    public String toString() {
        return "LibraryMember{" +
                "firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", fullName='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phonenumber + '\'' +
                '}';
    }
}


class LibraryMembership
{
    private LibraryMember member;
    private String fullname;

    private LocalDate fromDate , toDate;

    private  boolean ispaid;


    public LibraryMembership(LibraryMember member , String fullname , LocalDate fromDate , LocalDate toDate , boolean ispaid)
    {
        this.member = member;
        this.fullname = fullname;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.ispaid = ispaid;
    }

    public LibraryMember getMember()
    {
        return member;
    }

    public String getFullName() {
        return fullname;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public boolean isPaid() {
        return ispaid;
    }

    @Override
    public String toString() {
        return "LibraryMembership{" +
                "member=" + member +
                ", fullName='" + fullname + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", isPaid=" + ispaid +
                '}';
    }
}


enum Transactiontype
{
    Issue , Return;
}

class LibraryTransaction
{
    private LibraryMember member;
    private LocalDate date;
    private Transactiontype type;

    public LibraryTransaction(LibraryMember member, Transactiontype type, LocalDate date) {
        this.member = member;
        this.type = type;
        this.date = date;
    }


    public LibraryMember getMember() {
        return member;
    }

    public Transactiontype getType() {
        return type;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "LibraryTransaction{" +
                "member=" + member +
                ", type=" + type +
                ", date=" + date +
                '}';
    }
}


class LibrarySettings
{
    private int maxarticles , loanperiod;

    public LibrarySettings(int maxarticles , int loanperiod)
    {
        this.maxarticles = maxarticles;
        this.loanperiod = loanperiod;
    }

    public  int getMaxarticles()
    {
        return  maxarticles;
    }

    public int getLoanperiod() {
        return loanperiod;
    }

    public void setLoanperiod(int loanperiod)
    {
        this.loanperiod = loanperiod;
    }

    public String toString() {
        return "LibrarySettings{" +
                "maxArticlesIssued=" + maxarticles +
                ", loanPeriodDays=" + loanperiod +
                '}';
    }
}



class Library
{
    private List<Article> articles;
    private  List<LibraryMember> members;

    private List<LibraryMembership> memberships;

    private List<LibraryTransaction> transactions;

    private  LibrarySettings librarySettings;


    public Library(LibrarySettings settings)
    {
        this.articles = new ArrayList<>();
        this.members = new ArrayList<>();
        this.memberships = new ArrayList<>();
        this.transactions = new ArrayList<>();
        this.librarySettings = settings;
    }

    public void addArticle(Article article)
    {
        articles.add(article);
    }

    private Article findArticleByIsbn(String isbn) {
        for (Article article : articles) {
            if (article.getIsbn().equals(isbn)) {
                return article;
            }
        }
        return null;
    }

    public  void removeArticle(String isbn)
    {
        Article article = findArticleByIsbn(isbn);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }


    private LibraryMember findMemberById(String memberId) {
        for (LibraryMember member : members) {
            if (member.getFullname().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    public void removeMember(String memberId) {
        LibraryMember member = findMemberById(memberId);
        if (member != null) {
            members.remove(member);
        } else {
            System.out.println("Member not found");
        }
    }


    public void addMembership(LibraryMembership membership) {
        memberships.add(membership);
    }

    private LibraryMembership findMembershipByMemberId(String memberId) {
        for (LibraryMembership membership : memberships) {
            if (membership.getMember().getFullname().equals(memberId)) {
                return membership;
            }
        }
        return null;
    }


    public void removeMembership(String memberId) {
        LibraryMembership membership = findMembershipByMemberId(memberId);
        if (membership != null) {
            memberships.remove(membership);
        } else {
            System.out.println("Membership not found");
        }
    }

    public void addTransaction(LibraryTransaction transaction) {
        transactions.add(transaction);
    }


    public void listArticles() {
        for (Article article : articles) {
            System.out.println(article);
        }
    }

    public void listMembers() {
        for (LibraryMember member : members) {
            System.out.println(member);
        }
    }

    public void listMemberships() {
        for (LibraryMembership membership : memberships) {
            System.out.println(membership);
        }
    }

    public void listTransactions() {
        for (LibraryTransaction transaction : transactions) {
            System.out.println(transaction);
        }
    }


    public LibrarySettings getSettings() {
        return librarySettings;
    }


    public void setSettings(LibrarySettings settings) {
        this.librarySettings = settings;
    }


    // Issue an article
    public void issueArticle(String isbn, String memberId) {
        Article article = findArticleByIsbn(isbn);
        LibraryMember member = findMemberById(memberId);

        if (article != null && member != null && article.getStatus().equals("Available") && member.getBorrowedBooksCount() < librarySettings.getMaxarticles()) {
            article.setStatus("Issued");
            member.borrowBook();
            addTransaction(new LibraryTransaction(member, Transactiontype.Issue, LocalDate.now()));
            System.out.println(member.getFullname() + " borrowed " + article.getName());
        } else {
            System.out.println("Article is not available, Member not found, or borrow limit exceeded");
        }
    }

    // Return an article
    public void returnArticle(String isbn, String memberId) {
        Article article = findArticleByIsbn(isbn);
        LibraryMember member = findMemberById(memberId);

        if (article != null && member != null && article.getStatus().equals("Issued")) {
            article.setStatus("Available");
            member.returnBook();
            addTransaction(new LibraryTransaction(member, Transactiontype.Return, LocalDate.now()));
            System.out.println(member.getFullname() + " returned " + article.getName());
        } else {
            System.out.println("Article was not borrowed or Member not found");
        }
    }






}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibrarySettings settings = new LibrarySettings(14, 5);

        Library library = new Library(settings);

        Article article1 = new Article("Java Programming", "John Doe", "A comprehensive guide to Java programming.", "1234567890", "Available", "Tech Publishers");
        Article article2 = new Article("Data Structures", "Jane Smith", "An introduction to data structures.", "0987654321", "Available", "Tech Publishers");

        library.addArticle(article1);
        library.addArticle(article2);

        LibraryMember member1 = new LibraryMember("Alice", "Johnson", "alice.johnson@example.com", "555-1234" , "90222");
        LibraryMember member2 = new LibraryMember("Bob", "Smith", "bob.smith@example.com", "555-5678" , "235617");

        library.addMember(member1);
        library.addMember(member2);


        LibraryMembership membership1 = new LibraryMembership(member1,member1.getFullname(), LocalDate.now(), LocalDate.now().plusYears(1), true);

        LibraryMembership membership2 = new LibraryMembership(member1,member2.getFullname(), LocalDate.now(), LocalDate.now().plusYears(1), true);

        library.addMembership(membership1);
        library.addMembership(membership2);

//        System.out.println("Articles in the library:");
        //library.listArticles();

        System.out.println("\nLibrary Members:");
        library.listMembers();

        System.out.println("\nLibrary Transactions:");
        library.listTransactions();

        library.returnArticle("1234567890", "Alice Johnson");

        // List Articles after return
        System.out.println("\nArticles in the library after return:");
        library.listArticles();

        // List Transactions after return
        System.out.println("\nLibrary Transactions after return:");
        library.listTransactions();

        // Remove an Article
        library.removeArticle("0987654321");

        // Remove a Member
        library.removeMember("Bob Smith");

        // List Articles after removal
        System.out.println("\nArticles in the library after removal:");
        library.listArticles();

        // List Members after removal
        System.out.println("\nLibrary Members after removal:");
        library.listMembers();
    }
}
