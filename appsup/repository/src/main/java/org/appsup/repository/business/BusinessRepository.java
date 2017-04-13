package org.appsup.repository.business;

public interface BusinessRepository {
    <T> T getByPrimaryKey(Object... keyVals);
    <T> T getByBusinessKey(String keyName, Object... keyVals);
    <T> T create(T bo);
    <T> T update(T bo);
    <T> T delete(T bo);
}
