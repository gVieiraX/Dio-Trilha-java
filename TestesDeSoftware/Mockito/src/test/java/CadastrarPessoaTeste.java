import org.example.ApiDosCorreios;
import org.example.CadastrarPessoa;
import org.example.DadosLocalizacao;
import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

     @Test
     void  validarDadosDeCadastro(){
         DadosLocalizacao DL = new DadosLocalizacao("MG","Timóteo", "Avenida Ana Moura","casa","Timotinho");
         Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("2424424")).thenReturn(DL);
         Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Gabriel", "2424424", LocalDate.now(), "424244");

         Assertions.assertEquals("Gabriel",pessoa.getNome());

     }
}
