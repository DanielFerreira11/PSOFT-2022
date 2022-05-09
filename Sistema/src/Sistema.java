public class Sistema {
    public static void main (String args[]){
        Produto p1 = new Produto("1","leite","Isis");
        Lote l1 = new Lote("1",p1,15);

        System.out.println(p1.toString());
        System.out.println(l1.toString());

    }
}
