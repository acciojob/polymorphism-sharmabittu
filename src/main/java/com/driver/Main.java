package com.driver;

public class Main {
    static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
    public static void Main(String[] args){
        Product p = new Product();
//        System.out.println(p.product(5, 5));
//        System.out.println(p.product(5, 2, 3));
//        System.out.println(p.product(2.5, 6.8));
        p.product(5, 5);
        p.product(5, 2, 3);
        p.product(2.5, 6.8);
    }
}