package utilities;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * @author kattie95
 */
public class HibernateUtil
{
    private static SessionFactory sessionFactory;

    private static SessionFactory buildSessionFactory()
    {
        try {
            StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                    .configure().build();    //TODO: LOL, why it's working without config link? -> "hibernate.cfg.xml"
            Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
            return metadata.getSessionFactoryBuilder().build();
        } catch (HibernateException hex) {      //instead of Throwable. TODO: check if it will work with diff thing
            System.err.println("Nie udalo sie zbudowac session factory. Meh. " + hex);
            throw new ExceptionInInitializerError(hex);
        }
    }
    //think: let's try to get 'catched'..?

    public static SessionFactory getSessionFactory()
    {
        if (sessionFactory == null)
            sessionFactory = buildSessionFactory();
        return sessionFactory;
    }
}
