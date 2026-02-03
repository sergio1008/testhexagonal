package com.serbernal.ports.inbound;

public interface UseCase <In, Out>{

    Out execute(In in);
}
