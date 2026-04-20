package Entity;

import java.time.LocalDate;

public final class CarroPasseio extends Veiculo{

    public CarroPasseio(
            String placa,
            String marca,
            Integer anoFabricacao,
            Double valorLocacaoDiaria,
            Double precoFipe
    ) {
        super(placa, marca, anoFabricacao, valorLocacaoDiaria, precoFipe);
    }

    @Override
    public Double alugarVeiculo(Double pesoCarga, Integer dias) {
        return super.getValorLocacaoDiaria() * dias;
    }

    @Override
    public Double calcularIpva() {

        if(super.getAnoFabricacao() - LocalDate.now().getYear() >= 20) {
            return 0.0;
        } else {
            return super.getPrecoFipe() * 0.04;
        }

    }
}
