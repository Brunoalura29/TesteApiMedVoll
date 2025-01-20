package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // Garante o construtor padrão
@AllArgsConstructor // Construtor com todos os campos
@Embeddable
public class Endereco {

        private String logradouro;
        private String bairro;
        private String cep;
        private String numero;
        private String complemento;
        private String cidade;
        private String uf;


    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if (dados.logradouro() != null) {
            this.logradouro = dados.logradouro();
        }
        if (dados.bairro() != null) {
            this.logradouro = dados.bairro();
        }
        if (dados.cep() != null) {
            this.logradouro = dados.cep();
        }
        if (dados.uf() != null) {
            this.logradouro = dados.uf();
        }
        if (dados.cidade() != null) {
            this.logradouro = dados.cidade();
        }
        if (dados.numero() != null) {
            this.logradouro = dados.numero();
        }
        if (dados.complemento() != null) {
            this.logradouro = dados.complemento();
        }
    }
}
