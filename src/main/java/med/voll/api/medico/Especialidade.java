package med.voll.api.medico;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Especialidade {

    ORTOPEDIA,
    CARDIOLOGIA,
    GINECOLOGIA,
    DERMATOLOGIA;

    @JsonCreator
    public static Especialidade fromString(String value) {
        return value == null ? null : Especialidade.valueOf(value.toUpperCase());
    }
}
