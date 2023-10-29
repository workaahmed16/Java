class User{


	private String name;
	private String ID;
	private String[] borrowedBooks;

	User(String name, String ID, String[] borrowedBooks){
		this.name=name;
		this.ID = ID;
		this.borrowedBooks = borrowedBooks;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(String[] borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

}