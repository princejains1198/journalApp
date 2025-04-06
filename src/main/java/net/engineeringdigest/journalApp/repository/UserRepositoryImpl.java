package net.engineeringdigest.journalApp.repository;

import net.engineeringdigest.journalApp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;


import java.util.List;

public class UserRepositoryImpl {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<User> getUserForSA() {
        Query query = new Query();
        query.addCriteria(Criteria.where("email").regex("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"));
        query.addCriteria(Criteria.where("sentimentAnalysis").is(true));
        List<User> users = mongoTemplate.find(query, User.class);
        return users;
    }




//    public List<User> getUserForSA() {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("userName").is("vipul"));
//        query.addCriteria(Criteria.where("age").gte(20));
//        List<User> users = mongoTemplate.find(query, User.class);
//        return users;
//    }

//    public List<User> getUserForSA() {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("email").exists(true));   // andOperator
//        query.addCriteria(Criteria.where("email").ne(null).ne(""));   // andOperator
//        query.addCriteria(Criteria.where("sentimentAnalysis").is(true)); // andOperator
//
//
////      Criteria criteria = new Criteria();
//
////      query.addCriteria(criteria.orOperator(
////                  Criteria.where("email").exists(true),
////                  Criteria.where("sentimentAnalysis").is(true))
////      );
//
////      query.addCriteria(criteria.andOperator(
////                  Criteria.where("email").exists(true),
////                  Criteria.where("sentimentAnalysis").is(true))
////      );
//
//        List<User> users = mongoTemplate.find(query, User.class);
//        return users;
//    }

}
