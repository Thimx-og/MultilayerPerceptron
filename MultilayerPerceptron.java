class MultilayerPerceptron {
	private static Neuronio[] neuronios;
	private static double[] bias = new double[2];
	private static double taxaAprendizado;
	private static int maximoPeriodos;

	public static void main(String[] args) {
		double[] saidasEsperadas = {0, 0, 0, 1};
		double[][] entradas = {
			{-1, -1},
			{-1, 1},
			{1, -1},
			{1, 1}
		};

		inicializaVariaveis();
		inicializaNeuronios(entradas[0].length, entradas[0].length, 1);

	}

	private static void inicializaNeuronios(int qtdCamadaEntrada, int qtdCamadaEscondida, int qtdSaida) {
		neuronios = new Neuronio[qtdCamadaEntrada + qtdCamadaEscondida + qtdSaida];

		for (int i = 0; i < (qtdCamadaEntrada + qtdCamadaEscondida + qtdSaida); i++) {
			if (i < qtdCamadaEntrada) {
				neuronios[i] = new Neuronio(0, "X");
			} else if (i < (qtdCamadaEntrada + qtdCamadaEscondida)) {
				neuronios[i] = new Neuronio(qtdCamadaEntrada, "Z");
			} else {
				neuronios[i] = new Neuronio(qtdCamadaEscondida, "Y");
			}
		}
	}

	private static void inicializaVariaveis() {
		bias[0] = getRandomNoIntervalo(0.0, 1.0);
		bias[1] = getRandomNoIntervalo(0.0, 1.0);
		taxaAprendizado = getRandomNoIntervalo(0.1, 1.0);
		maximoPeriodos = 100;
	}

	private static double getRandomNoIntervalo(double min, double max){
	   double x = (Math.random()*((max-min)+1))+min;
	   return x;
	}
}