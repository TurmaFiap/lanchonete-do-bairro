package br.com.lanchonete.rest.output;

import br.com.lanchonete.model.StatusType;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class OrderOutputDTO {

    private UUID id;
    private String number;
    private StatusType status;

}
