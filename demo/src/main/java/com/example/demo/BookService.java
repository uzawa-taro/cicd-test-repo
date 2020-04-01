    package com.example.demo;

    public interface BookService {
        /**
         * 図書名による全県件参照処理。
         *
         * @return 全図書データリスト
         */
        BookList findAll();

        /**
         * 図書の新規登録処理。
         *
         * @param book 登録内容
         */
        void addBook(Book book);
    }
