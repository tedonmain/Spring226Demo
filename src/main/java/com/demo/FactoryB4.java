package com.demo;

class FactoryB4 {

    void produce() {

        Printer p = new Printer();
        p.print();
    }

    class Printer {

        private Document document;

        Printer() {
            document = new Document();
        }

        void print() {
            System.out.println(document.getPage());
        }
    }

    class Document {

        Document() { }

        String getPage() {
            return "Page";
        }
    }
}
