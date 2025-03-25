package com.example.produtosapi.montadora.configuration;

import com.example.produtosapi.montadora.Motor;
import com.example.produtosapi.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalo(120);
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setModelo("AA-1");
        return motor;
    }
    @Bean(name = "motorTurbo")
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalo(300);
        motor.setTipoMotor(TipoMotor.TURBO);
        motor.setCilindros(6);
        motor.setLitragem(3.5);
        motor.setModelo("AA-2");
        return motor;
    }
    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalo(200);
        motor.setTipoMotor(TipoMotor.ELETRICO);
        motor.setCilindros(1);
        motor.setLitragem(1.4);
        motor.setModelo("AA-3");
        return motor;
    }
}
