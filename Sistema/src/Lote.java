public class Lote {
    String idLote;
    Produto produto;
    int quantidadeLote;

    public Lote(String idLote, Produto produto, int quantidadeLote) {
        this.idLote = idLote;
        this.produto = produto;
        this.quantidadeLote = quantidadeLote;
    }
    @Override
    public String toString() {
        return "Lote{" +
                "idLote='" + idLote + '\'' +
                ", produto=" + produto +
                ", quantidadeLote=" + quantidadeLote +
                '}';
    }
}
