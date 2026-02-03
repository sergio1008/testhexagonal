package com.serbernal.ports.inbound;

public interface UseCase <IN, OUT>{

    OUT execute(IN in);
}
