package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P27_BookSort {
    static class Book {
        String title;
        int year;
        int page;

        Book(String title, int year, int page) {
            this.title = title;
            this.year = year;
            this.page = page;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String title = st.nextToken();
            int year = Integer.parseInt(st.nextToken());
            int page = Integer.parseInt(st.nextToken());
            bookList.add(new Book(title,year,page));
        }

        bookList.sort((a,b) -> {
            if (a.year!=b.year) {
                return a.year-b.year;
            }
            if (b.page!=a.page) {
                return b.page-a.page;
            }
            return a.title.compareTo(b.title);
        });

        for (Book book : bookList) {
            System.out.println(book.title+" "+book.year+" "+book.page);
        }
    }
}
