package Lib;

public class Library extends Book {
    public static void main(String args[]){
        Book book;
        Book[] shelf = new Book[10];

        String[] Author = {"Google",
                "Jhon",
                "Snowden",
                "Patric",
                "Oleg",
                "Masha",
                "Petrovsky",
                "Java",
                "Ororo",
                "Alala"
        };

        String[] Title = {
                "How to Google",
                "Story of my life",
                "We are watching you",
                "Life in a stone",
                "How not to write a code",
                "My love",
                "Story of russian hacker",
                "Java Documentation",
                "Popopo",
                "Oraro"
        };

        int[] PC = {100100,1,182312,31,2,123,1241,12512,1231,125};
        for(int i = 0;i<10;i++) {
            book = new Book();
            book.setBook(Title[i], Author[i], PC[i], "2020");
            shelf[i] = book;
        }

        for (int j = 0;j<10;j++){
            System.out.println(shelf[j].getAuthor()+ " " + '"'+ shelf[j].getTitle()+'"'+ " " + shelf[j].getPageCount());
        }

        sortBooksByTitle(shelf);
        System.out.println('\n');

        for (int j = 0;j<10;j++){
            System.out.println(shelf[j].getAuthor()+ " " + '"'+ shelf[j].getTitle()+'"'+ " " + shelf[j].getPageCount());
        }
        sortBooksByAuthor(shelf);
        System.out.println('\n');

        for (int j = 0;j<10;j++){
            System.out.println(shelf[j].getAuthor()+ " " + '"'+ shelf[j].getTitle()+'"'+ " " + shelf[j].getPageCount());
        }



    }

    public static void sortBooksByTitle(Book[] shelf){
        for(int j = 0; j<10 ; j++) {
            for (int i = 0; i < 9; i++) {
                String currBookTitle = shelf[i].getTitle();
                String nextBookTitle = shelf[i + 1].getTitle();
                Book tmpBook;
                if (currBookTitle.charAt(0) > nextBookTitle.charAt(0)) {
                    tmpBook = shelf[i];
                    shelf[i] = shelf[i + 1];
                    shelf[i + 1] = tmpBook;
                }

            }
            ;
        }
    };

    public static void sortBooksByAuthor(Book[] shelf){
        for(int j = 0; j<10 ; j++) {
            for (int i = 0; i < 9; i++) {
                String currBookAuthor = shelf[i].getAuthor();
                String nextBookAuthor = shelf[i + 1].getAuthor();
                Book tmpBook;
                if (currBookAuthor.charAt(0) > nextBookAuthor.charAt(0)) {
                    tmpBook = shelf[i];
                    shelf[i] = shelf[i + 1];
                    shelf[i + 1] = tmpBook;
                }

            }
            ;
        }
    };

}
