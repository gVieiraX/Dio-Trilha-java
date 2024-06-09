package dio.my_first_web_api.Handler;

public class CampoObrigatorioException extends BusinessException   {
    public CampoObrigatorioException(String campo){
        super("O campo %s é obrigatório", campo);
    }

}
