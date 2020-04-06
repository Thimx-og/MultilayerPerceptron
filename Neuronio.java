class Neuronio {
	private double entrada;
	private double saida;
	private double[] pesos;
	private double erro;
	private String tipoCamada;

	public Neuronio(int qtdPesos, String tipoCamada) {
		this.inicializaPesos(qtdPesos);
		this.tipoCamada = tipoCamada;
	}

	public void defineSaidaNeuronio(double entradasPonderadas) {
		System.out.println("resultado: " + sigmoideAtivacao(entradasPonderadas));
		setSaida(sigmoideAtivacao(entradasPonderadas));
	}

	public double getEntrada() {
		return this.entrada;
	}

	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}

	public double getSaida() {
		return this.saida;
	}

	public void setSaida(double saida) {
		this.saida = saida;
	}

	public double[] getPesos() {
		return this.pesos;
	}

	public void setPesos(double[] pesos) {
		this.pesos = pesos;
	}

	public String getTipoCamada() {
		return this.tipoCamada;
	}

	public void setTipoCamada(String tipoCamada) {
		this.tipoCamada = tipoCamada;
	}

	private void inicializaPesos(int qtdPesos) {
		double[] pesosAuxiliar = new double[qtdPesos];

		for (int i = 0; i < qtdPesos; i++) {
			pesosAuxiliar[i] = getRandomNoIntervalo(0.1, 1.0);
		}

		this.pesos = pesosAuxiliar;
	}

	private double getRandomNoIntervalo(double min, double max){
	   double x = (Math.random()*((max-min)+1))+min;
	   return x;
	}

	private static double sigmoideAtivacao(double x) {
		double exponencialEuler = 2.718;

		return 1/(1 + Math.pow(exponencialEuler, -x));
	}
}