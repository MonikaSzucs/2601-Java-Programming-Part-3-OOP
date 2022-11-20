class Novel {
    private final String title;
    private final String authorName;
    private final int yearPublished;

    Novel(final String title, final String authorName, final int yearPublished) {
        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}
