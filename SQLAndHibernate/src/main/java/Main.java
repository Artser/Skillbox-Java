import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;


public class Main {
    private static StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    private static Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
    private static SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();


    public static void main(String[] args) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<PurchaseList> PurchaseListQuery = criteriaBuilder.createQuery(PurchaseList.class);// что такое  CriteriaQuery для чего эта строка?
        Root<PurchaseList> purchaseRoot = PurchaseListQuery.from(PurchaseList.class); // второй раз к PurchaseList.class теперь с root для чего (так и не поняла)
        List<PurchaseList> purchaseList = session.createQuery(PurchaseListQuery.select(purchaseRoot)).getResultList(); // сесси составляет нам список? чего список?
        for (PurchaseList p : purchaseList) {
            LinkedPurchaseList linkedPurchaseLists = new LinkedPurchaseList();
            String nameCourse = p.getCourseName();
            String nameStudent = p.getStudentName();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Course> queryC = builder.createQuery(Course.class);
            CriteriaQuery<Student> queryS = builder.createQuery(Student.class);

            Root<Course> rootC = queryC.from(Course.class);//снчала думала что это список...но нет..внизу List
            Root<Student> rootS = queryS.from(Student.class);

            List<Course> courseP = session.createQuery(queryC.select(rootC)
                    .where(builder.equal(rootC.<String>get("name"), nameCourse))).getResultList();//что мы хотим получить этой строкой?
            List<Student> studentP = session.createQuery(queryS.select(rootS)
                    .where(builder.equal(rootS.<String> get("name"), nameStudent))).getResultList();

            linkedPurchaseLists.setId(new LinkedPurchaseKey(studentP.get(0).getId(), courseP.get(0).getId()));
            session.persist(linkedPurchaseLists);
        }

        transaction.commit();
        sessionFactory.close();
    }
}


