import java.util.ArrayList;

public class ProdutoRepository {

  // abre conexão com o banco de dados
  private DbConnection dbConnection;

  public ProdutoRepository(DbConnection dbConnection){
    this.dbConnection = dbConnection;
  }

  public List<Produto> buscarProdutos(){
    // retorna a lista de protudos armazenados na base de dados
    return new ArrayList<>();
  }

  public void salvarProduto(Produto produto){
    // salva lista de produtos na base de dados
  }
}
