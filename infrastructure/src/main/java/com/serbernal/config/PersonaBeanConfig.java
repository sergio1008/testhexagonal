package com.serbernal.config;

import com.serbernal.ports.inbound.CreatePersonaUseCase;
import com.serbernal.ports.inbound.UpdatePersonaUseCase;
import com.serbernal.repository.IPersonaRepository;
import com.serbernal.service.IPersonaService;
import com.serbernal.service.impl.PersonaServiceImpl;
import com.serbernal.services.CreatePersonaService;
import com.serbernal.services.UpdatePersonaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonaBeanConfig {


    @Bean
    public CreatePersonaUseCase createPersonaUseCase(IPersonaService service){
        return new CreatePersonaService(service);
    }

    @Bean
    public UpdatePersonaUseCase updatePersonaUseCase(IPersonaService service){
        return new UpdatePersonaService(service);
    }

    @Bean
    public IPersonaService personaService(IPersonaRepository repository){
        return new PersonaServiceImpl(repository);
    }
}
