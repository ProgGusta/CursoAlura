public class EscondeArray {
    private int[] referencias;
    private int posLivre;
    private int max;

    public EscondeArray(int tamanho)
    {
        this.referencias = new int[tamanho];
        this.posLivre = 0;
        this.max = tamanho;
    }

    public void adiciona(int number)
    {
        if(posLivre < max)
        {
            this.referencias[this.posLivre] = number;
            this.posLivre ++;
            return;
        }

        System.out.println("Sem posicoes livres");
    }

    public int getReferencia(int index)
    {
        if (index < max)
            return this.referencias[index];

        return -1;
    }
}
