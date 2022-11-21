package ca.bcit.comp2601.lab09.group;

/**
 * Novel Class
 *
 * @author Guilherme Trevison, Monika Szucs, Davood Tabrizi Nejad
 * @version 1.1
 * @since 2022-11-20
 */
class Novel {
    private final String title;
    private final String authorName;
    private final int yearPublished;

    /**
     * @param title the title of the novel
     * @param authorName the author name of the novel
     * @param yearPublished the year the novel was published
     */
    Novel(final String title, final String authorName, final int yearPublished) {
        if(title == null || title.isBlank()) {
            throw new IllegalArgumentException("Invalid title. It cannot be null or blank.");
        }

        if(authorName == null || authorName.isBlank()) {
            throw new IllegalArgumentException("Invalid author name. It cannot be null or blank.");
        }

        if(yearPublished < 0) {
            throw new IllegalArgumentException("Invalid year. It cannot be less than 0");
        }

        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    /**
     * @return the title of the novel
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the author of the novel
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * @return the year the novel was published
     */
    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", yearPublished=" + yearPublished +
                '}';
    }
}
