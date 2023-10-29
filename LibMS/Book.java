class Book{
	private String title;
	private String author;
	private String ISBN;
	private boolean available;

	Book(String title, String author, String ISBN, boolean available){
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.available = available;
	}

	public String getTitle(){
		return title;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getAuthor(){
		return author;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public String getISBN(){
		return ISBN;
	}

	public void setIsbn(String ISBN){
		this.ISBN = ISBN;
	}

	public boolean isAvailable(){
		return available;
	}

	// Setter method for availability
    public void setAvailable(boolean available) {
        this.available = available;
    }


}