public class Produto {
    String idProduto;
    String nomeProduto;
    String fabricanteProduto;

    public Produto(String idProduto, String nomeProduto, String fabricanteProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.fabricanteProduto = fabricanteProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto='" + idProduto + '\'' +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", fabricanteProduto='" + fabricanteProduto + '\'' +
                '}';
    }
}
