package runningApp;

import model.Animal;
import model.Employee;
import org.hibernate.Session;
import utilities.HibernateUtil;

import java.util.Date;

/**
 * @author kattie95
 */
public class Shelter
{
    public static void main(String[] args)
    {
        /*  Odczytywanie danych z bazy, podstawa:

        SessionFactory sessionFactory = Utility.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        org.hibernate.Transaction transaction = session.beginTransaction();

        CriteriaQuery criteriaQuery = session.getCriteriaBuilder().createQuery(Animal.class);
        criteriaQuery.from(Animal.class);
        List<Animal> animalList = session.createQuery(criteriaQuery).getResultList();

        for (Animal animal : animalList)
        {
            System.out.print("Posiadane zwierze - " +animal.getType()+ ", "+animal.getSex()+" o imieniu "+animal.getName()+". ");
            System.out.println("Ma "+animal.getAge()+" lat, przybyla tu dnia "+animal.getArrival());
        }
        transaction.commit();
        System.out.print("Nie ma wiecej zwierzat.");
        sessionFactory.close();
*/

        Animal animal = new Animal("pies","samiec",new Date());
        animal.setAge(13);
        animal.setName("Pyton");
        //animal.setId(4);  TODO: ID jest potrzebne, gdy chcesz update'ować coś. Inaczej nie ma szans.

        Employee employee = new Employee("Mieczysław Kmieć","ochroniarz",new Date());
        employee.setAge(28);
        employee.setId(3);
        employee.setDetails("Może profesjonalnie szkolić psy.");


        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(animal);
        //  session.saveOrUpdate(employee);     //opcja update działa tylko kiedy jest to samo id.
        session.getTransaction().commit();
        System.out.println("Dodales nowe dane do schroniska.");
        HibernateUtil.getSessionFactory().close();
    }
}
