package hr.algebra.tracefood.webapp.service;

import hr.algebra.tracefood.webapp.model.ClassTest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassTestService extends AbstractClassicDBStorableService<ClassTest> {

    public ClassTestService() {
        super("/classTest", ClassTest.class);
    }

    public static void main(String[] args) {
        ClassTestService classTestService = new ClassTestService();
        ClassTest nct = new ClassTest(2L,"Updated !");
        classTestService.update(nct);
        List<ClassTest> cts = classTestService.getAll();
        for(ClassTest ctf : cts) {
            System.out.println(ctf.getArg1()+" "+ctf.getArg2());
        }
    }

}
