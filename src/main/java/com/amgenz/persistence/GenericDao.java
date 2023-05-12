package com.amgenz.persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * A generic dao
 */
public class GenericDao<T> {
    private final Logger logger = LogManager.getLogger(this.getClass());
    private Class<T> type;

    /**
     * Instantiates a new Generic dao
     *
     * @param type the entity type, for example, user.
     */
    public GenericDao(Class<T> type) {
        this.type = type;
    }

    /**
     * Gets a entity by id
     * @param id entity id to search by
     * @return a entity
     */
    public <T>T getById(int id) {
        Session session = getSession();
        T entity = (T)session.get(type, id);
        session.close();
        return entity;
    }

    /**
     * Delete a entity row
     * @param entity entity to be deleted
     */
    public void delete(T entity) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
    }

    /** Return a list of all rows in an entity
     *
     * @return All the entities
     */
    public List<T> getAll() {
        logger.error("In the getAll method in the dao.");
        Session session = getSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery( type );
        Root<T> root = query.from( type );
        List<T> list = session.createQuery( query ).getResultList();
        logger.error("After query was made.");
        session.close();

        return list;
    }

    /** Updates user in the database
     *
     * @param entity  User to be inserted or updated
     */
    public void saveOrUpdate(T entity) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entity);
        transaction.commit();
        session.close();
    }

    /**
     * Inserts a new entity into the database
     * @param entity  entity to be inserted or updated
     */
    public int insert(T entity) {
        logger.error("in the insert method");
        int id;
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(entity);
        logger.error("After query was made inserted: ");
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Get entity by string property (exact match)
     * sample usage: getByPropertyEqualString("lastname", "Curry")
     * @return entity with exact match
     */
    public List<T> getByPropertyEqual(String propertyName, String value) {
        logger.error("In the getByPropertyEqual method in the Generic Dao.");
        Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery( type );
        Root<T> root = query.from( type );
        logger.error("Before the query.");
        query.select(root).where(builder.equal(root.get(propertyName), value));
        logger.error("After the query.");
        List<T> entity = session.createQuery(query).getResultList();
        session.close();
        return entity;
    }

    /**
     * Get entity by string property (exact match)
     * sample usage: getByPropertyEqualString("lastname", "Curry")
     * @return entity with exact match
     */
    public List<T> getByPropertyEqualEntity(String propertyName, T entity) {
        Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery( type );
        Root<T> root = query.from( type );
        logger.error("Before the query.");
        query.select(root).where(builder.equal(root.get(propertyName), entity));
        logger.error("After the query.");
        List<T> entitys = session.createQuery(query).getResultList();
        session.close();
        return entitys;
    }

    /**
     * Get entity by property string (like)
     * sample usage: getByPropertyLike("lastname", "C")
     * @return entities with like matches
     */
    public List<T> getByPropertyLike(String propertyName, String value) {
        Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery( type );
        Root<T> root = query.from( type );
        Expression<String> propertyPath = root.get(propertyName);
        query.where(builder.like(propertyPath, "%" + value + "%"));
        List<T> entity = session.createQuery( query ).getResultList();
        session.close();
        return entity;
    }

    /**
     * Returns an open session from the SessionFactory
     * @return session
     */
    private Session getSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();
    }
}

