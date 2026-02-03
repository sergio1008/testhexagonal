package com.serbernal.config;

import com.serbernal.ports.inbound.CreatePersonaUseCase;
import com.serbernal.repository.IPersonaRepository;
import com.serbernal.service.IPersonaService;
import com.serbernal.service.impl.PersonaServiceImpl;
import com.serbernal.services.CreatePersonaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonaBeanConfig {


    @Bean
    public CreatePersonaUseCase createPersonaUseCase(IPersonaService service){
        return new CreatePersonaService(service);
    }

    @Bean
    public IPersonaService personaService(IPersonaRepository repository){
        return new PersonaServiceImpl(repository);
    }
}
