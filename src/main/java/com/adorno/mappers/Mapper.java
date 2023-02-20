package com.adorno.mappers;

public interface Mapper<T, V>{
    T map(V v);
}
