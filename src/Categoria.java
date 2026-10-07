
/**
 * Categoria do motorista.
 * Cada categoria tem um percentual de comissão cobrado pela plataforma:
 * BRONZE 25%; PRATA 20%; OURO 15%; DIAMANTE 10%.
 */
public enum Categoria {
    BRONZE, PRATA, OURO, DIAMANTE;
    public double comissao;
    
    if Categoria.BRONZE{
        comissao = 0.25;
    }
    else if Categoria.PRATA{
        comissao = 0.20;
    }
    else if Categoria.OURO{
        comissao = 0.15;
    }
    else if Categoria.DIAMANTE{
        comissao = 0.10;
    }

    public double getComissao() {
        return comissao;
    }


    //TODO Tarefa 1: associar a cada constante sua comissão (0.25, 0.20, 0.15, 0.10)
    // (atributo, construtor e método getComissao())
}
