package Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Cập nhật thông tin sách");
            System.out.println("4. Xóa sách");
            System.out.println("5. Sắp xếp theo tiêu đề");
            System.out.println("6. Sắp xếp theo tác giả");
            System.out.println("7. Sắp xếp theo năm sản xuất");
            System.out.println("8. Tìm sách theo mã code");
            System.out.println("9. Tìm sách theo tiêu đề");
            System.out.println("10. Thoát");
            System.out.print("Chọn chức năng (1-8): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã sách: ");
                    String code = scanner.nextLine();
                    System.out.print("Nhập tiêu đề: ");
                    String title = scanner.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String author = scanner.nextLine();
                    System.out.print("Nhập năm xuất bản: ");
                    String publishingYear = scanner.nextLine();
                    System.out.print("Nhập thể loại: ");
                    String genre = scanner.nextLine();
                    System.out.print("Nhập kích thước tệp: ");
                    String fileSize = scanner.nextLine();
                    System.out.print("Nhập định dạng tệp: ");
                    String fileFormat = scanner.nextLine();
                    EBook newBook = new EBook(code, title, author, publishingYear, genre, fileSize, fileFormat);
                    library.addEBook(newBook);
                    break;

                case 2:
                    System.out.println("Danh sách EBook");
                    EBook[] bookList = library.seeBookList();
                    for (EBook book : bookList) {
                        System.out.println(book.toString());
                    }
                    break;

                case 3:
                    System.out.print("Nhập mã sách cần cập nhật: ");
                    String updateCode = scanner.nextLine();
                    EBook foundBook = library.findEBookByCode(updateCode);
                    if (foundBook != null) {
                        System.out.print("Nhập tiêu đề mới: ");
                        String newTitle = scanner.nextLine();
                        System.out.print("Nhập tác giả mới: ");
                        String newAuthor = scanner.nextLine();
                        System.out.print("Nhập năm xuất bản mới: ");
                        String newPublishingYear = scanner.nextLine();
                        System.out.print("Nhập thể loại mới: ");
                        String newGenre = scanner.nextLine();
                        System.out.print("Nhập kích thước tệp mới: ");
                        String newFileSize = scanner.nextLine();
                        System.out.print("Nhập định dạng tệp mới:");
                        String newFileFormat = scanner.nextLine();
                        EBook updatedBook = new EBook(foundBook.getCodeBook(), newTitle, newAuthor, newPublishingYear, newGenre, newFileSize, newFileFormat);
                        library.updateEBook(updateCode,updatedBook);
                        System.out.println("Thông tin sách đã được cập nhật.");
                    } else {
                        System.out.println("Không tìm thấy sách với mã code này.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập mã sách cần xóa: ");
                    String deleteCode = scanner.nextLine();
                    library.deleteEBook(deleteCode);
                    break;

                case 5:
                    System.out.println("Sắp xếp theo tiêu đề:");
                    library.sortByTitle("Tiêu đề");
                    break;
                case 6:
                    System.out.println("Sắp xếp theo tác giả:");
                    library.sortByAuthor("Tác giả");
                    break;

                case 7:
                    System.out.println("Sắp xếp theo năm xuất bản:");
                    library.sortByPublishingYear("Năm sản xuất");
                    break;
                case 8:
                    System.out.print("Nhập mã sách cần tìm: ");
                    String searchCode = scanner.nextLine();
                    EBook foundBookByCode = library.findEBookByCode(searchCode);
                    if (foundBookByCode != null) {
                        System.out.println("Sách được tìm thấy: " + foundBookByCode);
                    } else {
                        System.out.println("Không tìm thấy sách với mã code này.");
                    }
                    break;

                case 9:
                    System.out.print("Nhập tiêu đề sách cần tìm: ");
                    String searchTitle = scanner.nextLine();
                    EBook foundBookByTitle = library.findEBookByTitle(searchTitle);
                    if (foundBookByTitle != null) {
                        System.out.println("Sách được tìm thấy: " + foundBookByTitle);
                    } else {
                        System.out.println("Không tìm thấy sách với tiêu đề này.");
                    }
                    break;


                case 10:
                    System.out.println("Kết thúc chương trình.");
                    break;

                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }

        } while (choice != 10);

        scanner.close();
    }
}
