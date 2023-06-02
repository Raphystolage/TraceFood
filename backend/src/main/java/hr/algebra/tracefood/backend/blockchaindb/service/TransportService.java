package hr.algebra.tracefood.backend.blockchaindb.service;

import hr.algebra.tracefood.backend.blockchaindb.model.Processing;
import hr.algebra.tracefood.backend.blockchaindb.model.Transport;
import hr.algebra.tracefood.backend.blockchaindb.repository.ProcessingRepository;
import hr.algebra.tracefood.backend.blockchaindb.repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportService extends AbstractBlockchainDBStorableService<Transport> {

    public TransportService(TransportRepository repository) {
        super(repository);
    }

    @Autowired
    private ProductService productService;

    public List<Transport> getByProductId(Long id) {
        return ((TransportRepository) repository).getByProduct(productService.getById(id).orElse(null));
    }

    public List<Transport> getBySenderId(Long senderId) {
        return ((TransportRepository) repository).getBySenderId(senderId);
    }

}
