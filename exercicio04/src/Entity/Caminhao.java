package Entity;

import java.time.LocalDate;

public final class Caminhao extends Veiculo {

    final Double capacidadeCargaToneladas;

    public Caminhao(
            String placa,
            String marca,
            Integer anoFabricacao,
            Double valorLocacaoDiaria,
            Double precoFipe,
            Double capacidadeCargaToneladas
    ) {
        super(placa, marca, anoFabricacao, valorLocacaoDiaria, precoFipe);
        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
    }

    @Override
    public Double alugarVeiculo(Double pesoCarga, Integer dias) {

        if(pesoCarga > this.capacidadeCargaToneladas) {
            double multaPorExcessoPeso = (super.getValorLocacaoDiaria() * dias) * 0.1;
            return (super.getValorLocacaoDiaria() * dias) + multaPorExcessoPeso;
        } else {
            return super.getValorLocacaoDiaria() * dias;
        }
    }

    @Override
    public Double calcularIpva() {

        if(super.getAnoFabricacao() - LocalDate.now().getYear() >= 20){
            return 0.0;
        } else {
            return super.getPrecoFipe() * 0.015;
        }

    }
}
