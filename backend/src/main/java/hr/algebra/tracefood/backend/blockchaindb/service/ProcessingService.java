package hr.algebra.tracefood.backend.blockchaindb.service;

import hr.algebra.tracefood.backend.blockchaindb.model.Processing;
import hr.algebra.tracefood.backend.blockchaindb.model.Production;
import hr.algebra.tracefood.backend.blockchaindb.repository.ProcessingRepository;
import hr.algebra.tracefood.backend.blockchaindb.repository.ProductionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessingService extends AbstractBlockchainDBStorableService<Processing> {

    public ProcessingService(ProcessingRepository repository) {
        super(repository);
    }

    @Autowired
    private ProductService productService;

    public List<Processing> getByOriginProductId(Long originProductId) {
        return ((ProcessingRepository) repository).getByOriginProduct(productService.getById(originProductId).orElse(null));
    }
    public List<Processing> getByProcessorId(Long processorId) {
        return ((ProcessingRepository) repository).getByProcessorId(processorId);
    }

}
