package hr.algebra.tracefood.webapp.service;

public class AbstractBlockchainDBStorableService<T> extends AbstractStorableService<T> {
    
    public AbstractBlockchainDBStorableService(String url, Class<T> responseType) {
        super(url, responseType);
    }

}
