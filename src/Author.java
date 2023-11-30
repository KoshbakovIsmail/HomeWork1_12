public class Author {
   private String authorLastName;
   private String authorFirstName;
   private String authorSurName;
    public Author(String authorLastName, String aythorFirstName, String authorSurName) {
        this.authorLastName = authorLastName;
        this.authorFirstName = aythorFirstName;
        this.authorSurName = authorSurName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorSurName() {
        return authorSurName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public void setAuthorSurName(String authorSurName) {
        this.authorSurName = authorSurName;
    }

}

