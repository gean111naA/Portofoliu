package ro.siit.session10.accessControl;

class MyPreciousClass {
    public static void main(String[] args) {
        MyPreciousClass myClass = new MyPreciousClass();
    }
}

class MyOtherPreciousClass {
    public static void main(String[] args) {
        MyPreciousClass myClass = new MyPreciousClass();
        throw new RuntimeException("exeption");
    }
}
