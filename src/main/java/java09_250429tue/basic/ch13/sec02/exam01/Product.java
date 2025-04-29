package main.java.java09_250429tue.basic.ch13.sec02.exam01;

public class Product <K, M> {
    private K kind;
    private M model;

    // get
    public K getKind() {
        return this.kind; // this를 꼭 붙여야 하는건가? -> 이 안에는 kind가 없기 때문에
    }
    public M getModel(){
        return this.model;
    }

    // set
    public void setKind(K kind) {
        this.kind = kind;
    }
    public void setModel(M model) {
        this.model = model;
    }
}
