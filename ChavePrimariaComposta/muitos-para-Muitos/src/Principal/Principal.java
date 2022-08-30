/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import br.edu.ifsp.pep.dao.ProdutoDAO;
import br.edu.ifsp.pep.modelo.Produto;
import java.math.BigDecimal;
import javax.persistence.Persistence;

public class Principal {

    private static ProdutoDAO produtoDAO = new ProdutoDAO();

    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("chaveCompostaComAtributo");
    }

    private static void adicionarProdutos() {
        for (int i = 0; i < 10; i++) {
            Produto p = new Produto("Produto " + i, i * 10, new BigDecimal((i + 1) * 100));

            produtoDAO.inserir(p);
        }
    }
}
