package lesson1;

    public class Book {
        private String Title;
        private String Author;
        private static int YearPublication;
        public book(String Title, String Author, int YearPublication) {
            this.title = title;
            this.autor = autor;
            this.yearPublication();
        }

        public String getName() {
            return this.Title;
        }

        public String getAuthor() {
            return this.Author;
        }

        public int getYearPublication() {
            return this.YearPublication;
        }

        public void setYearPublication(int yearPublication) {
            this.YearPublication = yearPublication;
        }
    }