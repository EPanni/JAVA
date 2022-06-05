# DAO-JDBC-PROJECT
DAO based project 
Referências:
https://www.devmedia.com.br/dao-pattern-persistencia-de-dados-utilizando-o-padrao-dao/30999
https://www.oracle.com/technetwork/java/dataaccessobject-138824.html
Ideia geral do padrão DAO:
 Para cada entidade, haverá um objeto responsável por fazer acesso a dados relacionado a esta 
entidade. Por exemplo:
o Cliente: ClienteDao
o Produto: ProdutoDao
o Pedido: PedidoDao
 Cada DAO será definido por uma interface.
 A injeção de dependência pode ser feita por meio do padrão de projeto Factory




note: The DaoFactory was not implemented once we were talking about a learning practice and we were already able to code the more complicated one.
