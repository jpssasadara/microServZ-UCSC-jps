package lk.ac.ucsc.forexservice;

import org.springframework.data.jpa.repository.JpaRepository;
                                                              // table(object) name , type of the "id" of the table
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByFromAndTo(String from, String to);
    // select * from exchangevalue where from = USD and to = LKR => spring will do it automatically
}
