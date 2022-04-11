package ExeComida;

public class Comida {
    private Integer QtdePorcao;
    private Float Peso;
    private String Descricao;

    public Comida() {
    }

    public Comida(Integer QtdePorcao, Float Peso, String Descricao) {
        this.QtdePorcao = QtdePorcao;
        this.Peso = Peso;
        this.Descricao = Descricao;
    }

    public Integer getQtdePorcao() {
        return QtdePorcao;
    }

    public void setQtdePorcao(Integer QtdePorcao) {
        this.QtdePorcao = QtdePorcao;
    }

    public Float getPeso() {
        return Peso;
    }

    public void setPeso(Float Peso) {
        this.Peso = Peso;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
    
}
