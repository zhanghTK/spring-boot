package tk.zhangh.springboot.transaction.lazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ZhangHao on 2017/7/15.
 */
@Component
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public void getOne() {
//        EntityManagerFactory entityManagerFactory = ApplicationContextProvider.getApplicationContext().getBean(EntityManagerFactory.class);
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityManagerHolder entityManagerHolder = new EntityManagerHolder(entityManager);
//        TransactionSynchronizationManager.bindResource(entityManagerFactory, entityManagerHolder);
        System.out.println(studentDao.getOne(1).getName());
//        TransactionSynchronizationManager.unbindResource(entityManagerFactory);
//        EntityManagerFactoryUtils.closeEntityManager(entityManager);
    }

    @Transactional
    public void testNormalGetOneWithTrans() {
        System.out.println(studentDao.getOne(1).getName());
    }

    public void findOne() {
        System.out.println(studentDao.findOne(1).getName());
    }
}
