package com.ning.javabase;

public class C {
    public A pp;
    public byte zijie;
    private boolean buzhidao;
    protected char zifu;
    public C(){

    }
    public C(A pp,byte zijie,boolean buzhidao,char zifu){
        this.pp=pp;
        this.zijie=zijie;
        this.buzhidao=buzhidao;
        this.zifu=zifu;
    }
    public static void main(String [] atgs){
        C c = new C(new A("s"), (byte) 1, false, '1');
        System.out.println(c);
    }

    @Override
    public String toString() {
        return "C{" +
                "pp=" + pp +
                ", zijie=" + zijie +
                ", buzhidao=" + buzhidao +
                ", zifu=" + zifu +
                '}';
    }
}
