package hr.algebra.tracefood.webapp.service;

public class AbstractBlockchainDBStrableService<T> extends AbstractStorableService<T> {
    
    public AbstractBlockchainDBStrableService(String url, Class<T> responseType) {
        super(url, responseType);
    }

}
