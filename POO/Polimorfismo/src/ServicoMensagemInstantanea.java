//a classe MSNMessenger é ou representa
public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();

	public abstract void receberMensagem();

	protected void validarConectadoIntenert() {
		System.out.println("Validando se está concetado a internet");
	}
}