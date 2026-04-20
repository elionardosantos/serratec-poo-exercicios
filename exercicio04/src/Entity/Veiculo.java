package Entity;

import Interface.Fretavel;
import Interface.Tributavel;

public abstract sealed class Veiculo implements Fretavel, Tributavel permits Caminhao, CarroPasseio {

    private final String placa;
    private final String marca;
    private final Integer anoFabricacao;
    private final Double valorLocacaoDiaria;
    private final Double precoFipe;

    public Veiculo(String placa, String marca, Integer anoFabricacao, Double valorLocacaoDiaria, Double precoFipe) {
        this.placa = placa;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.valorLocacaoDiaria = valorLocacaoDiaria;
        this.precoFipe = precoFipe;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public Double getValorLocacaoDiaria() {
        return valorLocacaoDiaria;
    }

    public Double getPrecoFipe() {
        return precoFipe;
    }
}
