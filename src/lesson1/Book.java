package lesson1;

    public class Book {
        private String Name;
        private String Surname;
        private String Author;
        private static int YearPublication;

        public Author(String name, String author, String surname, int yearPublication) {
            this Name = name;
            this Surname = surname;
            this Author = author;
            this YearPublication = yearPublication;
        }

        public String getName() {
            return this.Name;
        }

        public String getSurname() {
            return this.Surname;
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

}
