package Library;

public class Library {
    EBook[] listOfBook = new EBook[10];
    int numberOfBook = 0;

    public EBook[] seeBookList() {
        EBook[] list = new EBook[numberOfBook];
        for (int i = 0; i < numberOfBook; i++) {
            list[i] = listOfBook[i];
        }
        return list;
    }

    public void addEBook(EBook eBook) {
        listOfBook[numberOfBook] = eBook;
        numberOfBook++;
    }

    public void updateEBook(String code, EBook newEBook) {
        for (int i = 0; i < numberOfBook; i++) {
            if (listOfBook[i].codeBook.equals(code)) {
                listOfBook[i] = newEBook;
                break;
            }
        }
    }

    public void deleteEBook(String code) {
        for (int i = 0; i < numberOfBook; i++) {
            if (listOfBook[i].codeBook.equals(code)) {
                for (int j = i; j < numberOfBook - 1; j++) {
                    listOfBook[j] = listOfBook[j + 1];
                }
                numberOfBook--;
                break;
            }
        }
    }

    public void sortByTitle(String title) {
        if (title.equals("Tiêuđề")) {
            for (int i = 0; i < numberOfBook; i++) {
                for (int j = i + 1; j < numberOfBook; j++) {
                    if (listOfBook[i].title.compareTo(listOfBook[j].title) > 0) {
                        EBook temp = listOfBook[i];
                        listOfBook[i] = listOfBook[j];
                        listOfBook[j] = temp;
                    }
                }
            }
        }
    }
    public void sortByAuthor(String author) {
        if (author.equals("Tác giả")) {
            for (int i = 0; i < numberOfBook; i++) {
                for (int j = i + 1; j < numberOfBook; j++) {
                    if (listOfBook[i].author.compareTo(listOfBook[j].author) > 0) {
                        EBook temp = listOfBook[i];
                        listOfBook[i] = listOfBook[j];
                        listOfBook[j] = temp;
                    }
                }
            }
        }
    }
    public void sortByPublishingYear(String publishingYear) {
        if (publishingYear.equals("Năm sản xuất")) {
            for (int i = 0; i < numberOfBook; i++) {
                for (int j = i + 1; j < numberOfBook; j++) {
                    if (listOfBook[i].publishingYear.compareTo(listOfBook[j].publishingYear) > 0) {
                        EBook temp = listOfBook[i];
                        listOfBook[i] = listOfBook[j];
                        listOfBook[j] = temp;
                    }
                }
            }
        }
    }
    public EBook findEBookByCode(String code) {
        for (int i = 0; i < numberOfBook; i++) {
            if (listOfBook[i].codeBook.equals(code)) {
                return listOfBook[i];
            }
        }
        return null;
    }

    public EBook findEBookByTitle(String title) {
        for (int i = 0; i < numberOfBook; i++) {
            if (listOfBook[i].title.equalsIgnoreCase(title)) {
                return listOfBook[i];
            }
        }
        return null;
    }
}
